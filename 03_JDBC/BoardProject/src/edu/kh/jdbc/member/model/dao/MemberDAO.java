package edu.kh.jdbc.member.model.dao;

import static edu.kh.jdbc.common.JDBCTemplate.*;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import edu.kh.jdbc.member.model.dto.Member;


public class MemberDAO {

	// JDBC 객체 참조 변수
	private Statement stmt;
	private PreparedStatement ptst;
	private ResultSet rs;
	
	// xml에 작성된 SQL을 읽어와 저장할 객체 참조 변수
	private Properties prop;
	private PreparedStatement pstmt;
	
	public MemberDAO() {
		try {
			prop = new Properties();
			
			prop.loadFromXML(new FileInputStream("member-sql.xml"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/** 회원 목록 조회 SQL 수행
	 * @param conn
	 * @return memberList
	 * @throws Exception
	 */
	public List<Member> selectMemberList(Connection conn) throws Exception {
		// 결과 저장용 변수 선언 / 객체 생성
		
		List<Member> memberList = new ArrayList<>();
		
		try {
			String sql = prop.getProperty("selectMemberList");
			
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {

			String memberId = rs.getString("MEMBER_ID");
			String memberName = rs.getString("MEMBER_NM");
			String memberGender = rs.getString("성별");
			
			Member member = new Member();
			member.setMemberId(memberId);
			member.setMemberName(memberName);
			member.setMemberGender(memberGender);

		
			memberList.add(member);
			}
		} finally {
			close(rs);
			close(stmt);
			
	    }

		return memberList;
}


	public int updateMember(Connection conn, String memberName, String memberGender, int memberNo) throws Exception{
		
		// 1. 결과 저장용 변수 선언
		int result = 0;
		
		try {
			// 2. SQL 작성, 수행
			String sql = prop.getProperty("updateMember");

					
		    pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, memberName);
			pstmt.setString(2, memberGender);
			pstmt.setInt(3, memberNo);
			
			result = pstmt.executeUpdate();
			
		} finally {
			// 3. JDBC 객체 자원 반환
			close(pstmt);
		}

		// 4. 결과 반환
		return result;
	}

	/**
	 * @param conn
	 * @param memberPw
	 * @param memberPw2
	 * @param memberNo
	 * @return result
	 * @throws Exception
	 */
	public int updatePassword(Connection conn, String memberPw, String memberPw2, int memberNo) throws Exception {
		
		// 1. 결과 저장용 변수 선언
		int result = 0;
		
		try {
			// 2. SQL 작성, 수행
			String sql = prop.getProperty("updatePassword");
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  memberPw2);
            pstmt.setString(2,  memberPw);			
            pstmt.setInt(3, memberNo);
            
            result = pstmt.executeUpdate();
			
			
		} finally {
			close(pstmt);
		}
		
		
		return result;
	}

	/** 회원 탈퇴 SQL 수행
	 * @param conn
	 * @param memberPw
	 * @param memberNo
	 * @return result
	 * @throws Exception
	 */
	public int unRegisterMember(Connection conn, String memberPw, int memberNo) throws Exception{
		int result = 0;
		
		try {
			String sql = prop.getProperty("unRegisterMember");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, memberNo);
			pstmt.setString(2, memberPw);
			
			result = pstmt.executeUpdate();
			
		} finally {
		    close(pstmt);
		}
		
		return result;
	}
	
}
