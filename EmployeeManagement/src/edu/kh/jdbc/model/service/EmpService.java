package edu.kh.jdbc.model.service;

import static edu.kh.jdbc.common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import edu.kh.jdbc.common.JDBCTemplate;
import edu.kh.jdbc.model.dao.EmpDAO;
import edu.kh.jdbc.model.dto.Emp;

public class EmpService {

	private EmpDAO dao = new EmpDAO();

	public List<Emp> selectAll() throws SQLException {

		Connection conn = getConnection();
		
		List<Emp> empList = dao.selectAll(conn);
		
		close(conn);
		
		return empList;
	}

	public Emp selectTwo(int input) throws SQLException {
		
		Connection conn = getConnection();
		
		Emp emp = dao.selectTwo(conn, input);
		
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
}
