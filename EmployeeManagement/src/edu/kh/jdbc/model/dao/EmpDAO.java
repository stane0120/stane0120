package edu.kh.jdbc.model.dao;

import static edu.kh.jdbc.common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.kh.jdbc.common.JDBCTemplate;
import edu.kh.jdbc.model.dto.Emp;

public class EmpDAO {

	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	
	
	/** 전체 사원 조회 SQL 수행 후 결과 반환 메서드
	 * @param conn
	 * @return
	 * @throws SQLException
	 */
	public List<Emp> selectAll(Connection conn) throws SQLException {

		List<Emp> empList = new ArrayList<>();
		
		try {
			String sql = "SELECT EMP_ID, EMP_NAME, NVL(DEPT_TITLE, '없음') DEPT_TITLE, JOB_NAME, NVL(PHONE, '없음') PHONE \r\n"
		             + "FROM EMPLOYEE\r\n"
		             + "NATURAL JOIN JOB\r\n"
		             + "LEFT JOIN DEPARTMENT ON (DEPT_CODE = DEPT_ID)\r\n"
		             + "ORDER BY JOB_CODE";
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				String empId = rs.getString("EMP_ID");
				String empName = rs.getString(2);
				String departmentName = rs.getString(3);
				String jobName = rs.getString("JOB_NAME");
				String phone = rs.getString(5);
				
				Emp emp = new Emp(Integer.parseInt(empId),
						           empName, phone, departmentName, jobName);
				
				
				empList.add(emp);				
			}
		             
		} finally {
		
			
			close(stmt);
			close(rs);
		}
		return empList;
	}



	public List<Emp> selectTwo(Connection conn, int input) throws SQLException{

		Emp emp = null;
		
		
		try {   String sql = "SELECT EMP_ID, EMP_NAME, NVL(DEPT_TITLE, '없음') DEPT_TITLE, JOB_NAME, NVL(PHONE, '없음') PHONE \r\n"
				+ "FROM EMPLOYEE\r\n"
				+ "NATURAL JOIN JOB\r\n"
				+ "LEFT JOIN DEPARTMENT ON (DEPT_CODE = DEPT_ID)\r\n"
				+ "WHERE EMP_ID = " + input;
		
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
			
		if(rs.next()) {
			int empId = rs.getInt(1);		
        	String empName = rs.getString(2);
        	String jobName = rs.getString(3);
        	String phone = rs.getString(4);
			
			emp = new Emp(empId, empName, jobName, phone);
		
		
		} finally {
			
			close(rs);
			close(stmt);
		}
					
		return emp;
	

}
		
		


	public int insertEmployee(Connection conn, Emp emp) throws SQLException {

		int result = 0;
		
		try {
			String sql = "INSERT INTO EMPLOYEE VALUES(SEQ_EMP_ID.NEXTVAL,"
					+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, SYSDATE, NULL, 'N')";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, emp.getEmpName());
			pstmt.setString(2, emp.getEmpNo());
			pstmt.setString(3, emp.getEmail());
			pstmt.setString(4, emp.getPhone());
			pstmt.setString(5, emp.getDeptCode());
			pstmt.setString(6, emp.getJobCode());
			pstmt.setString(7, emp.getSalLevel());
			pstmt.setInt(8, emp.getSalary());
			pstmt.setDouble(9, emp.getBonus());
			pstmt.setInt(10, emp.getManagerId());
			
			
			result = pstmt.executeUpdate();
			
		} finally {
			
			close(pstmt);
		}
		
		return result;
	}