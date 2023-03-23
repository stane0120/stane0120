package edu.kh.jdbc.model.service;

import static edu.kh.jdbc.common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import edu.kh.jdbc.common.JDBCTemplate;
import edu.kh.jdbc.model.dao.EmpDAO;
import edu.kh.jdbc.model.dto.Emp;

public class EmpService {

	private EmpDAO dao = new EmpDAO();

	
	/** 재직 중인 사원 정보 반환 서비스
	 * @return empList
	 * @throws SQLException
	 */
	public List<Emp> selectAll() throws SQLException {

		Connection conn = getConnection();
		
		List<Emp> empList = dao.selectAll(conn);
		
		close(conn);
		
		return empList;
	}

	public List<Emp> selectTwo(int input) throws SQLException {
		
		Connection conn = getConnection();
		
		List<Emp> emp = dao.selectTwo(conn, input);
		
		close(conn);

		return emp;
	}

	public int insertEmployee(Emp emp) throws SQLException {
		
		Connection conn = getConncetion();
		
		int result = dao.insertEmployee(conn, emp);
		
		if(result > 0)
			commit(conn);
		else
			rollback(conn);
		
		close(conn);
		
		return result;

	}
	
	
	private Connection getConncetion() {
		// TODO Auto-generated method stub
		return null;
	}

	/** 부서별 통계 조회 서비스
	 * @return mapList
	 * @throws SQLException
	 */
	public List<Map<String, Object>> selectDepartment() throws SQLException{
		
		Connection conn = getConnection();
		
		List<Map<String, Object>> mapList = dao.selectDepartment(conn);
		
		close(conn);
	
		return mapList;
	}

}