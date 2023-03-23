package edu.kh.jdbc.model.dao;

import static edu.kh.jdbc.common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import edu.kh.jdbc.common.JDBCTemplate;
import edu.kh.jdbc.model.dto.Emp;

public class EmpDAO {

	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	
	
	/** 재직 중인 사원 조회 SQL 수행 후 결과 반환
	 * @param conn
	 * @return empList
	 * @throws SQLException
	 */
	public List<Emp> selectAll(Connection conn) throws SQLException {

		List<Emp> empList = new ArrayList<>();
		
		try {
			String sql = "SELECT EMP_ID, EMP_NAME, NVL(DEPT_TITLE, '없음') DEPT_TITLE, JOB_NAME, SALARY, EMAIL \r\n"
		             + "NVL(DEPT_TITLE, '없음') DEPT_TITLE\r\n"
		             + "NVL(PHONE, '없음') PHONE \r\n"
		             + "FROM EMPLOYEE"
		             + "JOIN JOB USING(JOB_CODE)"
		             + "LEFT JOIN DEPARTMENT ON (DEPT_CODE = DEPT_ID)\r\n"
		             + "WHERE ENY_YN = 'N"
		             + "ORDER BY JOB_CODE";
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) { // 조회 결과를 1행씩 접근
				
				String empId = rs.getString(1);
				String empName = rs.getString(2);
				String departmentTitle = rs.getString(3);
				String jobName = rs.getString(4);
				int salary = rs.getInt(5);
				String phone = rs.getString(6);
				String email = rs.getString(7);
				
				Emp emp = new Emp(Integer.parseInt(empId),
						           empName, phone, departmentTitle, jobName, salary, phone, email);
				
				
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
		
		
		try { String sql = "SELECT EMP_ID, EMP_NAME, EMAIL \r\n"
	             + "NVL(PHONE, '없음') PHONE \r\n"
				 + "TO_CHAR(ENT_DATE, 'YYYY' \r\n"
	             + "FROM EMPLOYEE \r\n"
	             + "WHERE ENY_YN = 'N' \r\n"
	             + "ORDER BY ENT_DATE";
		
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
			
		if(rs.next()) {
			int empId = rs.getInt("EMP_ID");		
        	String empName = rs.getString("EMP_NAME");
        	String phone = rs.getString("PHONE");
        	String email = rs.getString("EMAIL");
        	String entDate = rs.getString("EMT_DATE");

		};
		
		} finally {
			
			close(rs);
			close(stmt);
		}
					
		return null;
	

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


	
	
    /** 부서별 통계 조회 SQL 수행 후 결과 반환
     * @param conn
     * @return mapList
     * @throws SQLException
     */
	public List<Map<String, Object>> selectDepartment(Connection conn) throws SQLException{
       
		// 1. 결과 저장용 객체 생성
		List<Map<String, Object>> mapList = new ArrayList<>();
		
		try {			
			// 2. SQL 작성 후 수행
			String sql = "SELECT DEPT_CODE, NVL(DEPT_TITLE, '부서없음') DEPT_TITLE, COUNT(*) 인원, FLOOR(AVG(SALARY)) 평균\r\n"
					+ "FROM EMPLOYEE\r\n"
					+ "LEFT JOIN DEPARTMENT ON(DEPT_CODE = DEPT_ID)\r\n"
					+ "GROUP BY DEPT_CODE, DEPT_TITLE\r\n"
					+ "ORDER BY DEPT_CODE\r\n";
			
					stmt = conn.createStatement();
					rs = stmt.executeQuery(sql);
					
					while(rs.next()) {
						String deptTitle = rs.getString("DEPT_TITLE");
						int count = rs.getInt("원인");
						int avg = rs.getInt("평균");
					
						Map<String, Object> map = new LinkedHashMap<>();
						                            // 입력 순서가 유지되는 Map
						
						map.put("deptTitle", deptTitle);
						map.put("count", count);
						map.put("avg", avg);
					}
					
		} finally {
			
		}
		
		return mapList;
	}
}