package edu.kh.jdbc.member.model.service;

import static edu.kh.jdbc.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.List;
import java.util.Random;

import edu.kh.jdbc.member.model.dao.MemberDAO;
import edu.kh.jdbc.member.model.dto.Member;

public class MemberService {
	
	private MemberDAO dao = new MemberDAO();

	/**
	 * @return
	 * @throws Exception
	 */
	public List<Member> selectMemberList() throws Exception {
		
		Connection conn = getConnection();
		
		List<Member> memberList = dao.selectMemberList(conn);
		
		close(conn);

		return memberList;
	}

	public int updateMember(String memberName, String memberGender, int memberNo) throws Exception{
		
		Connection conn = getConnection();
		
		
		// dao 호출 후 결과 반환 받기
		int result = dao.updateMember(conn, memberName, memberGender, memberNo);
		
		// 트랜잭션 처리
		if(result > 0) commit(conn);
		
		close(conn);
		
		return result;
	
	}

	/** 비밀번호 변경 서비스
	 * @param memberPw
	 * @param memberPw2
	 * @param memberNo
	 * @return result
	 * @throws Exception
	 */
	public int updatePassword(String memberPw, String memberPw2, int memberNo) throws Exception {
		
		Connection conn = getConnection();
		
		
		// dao 호출 후 결과 반환 받기
		int result = dao.updatePassword(conn, memberPw, memberPw2, memberNo);
		
		if(result > 0) commit (conn);
		else           rollback (conn);
		
		close(conn);
		
		return result;
	}

/** 숫자 6자리 보안코드 생성 서비스
 * @return code
 */
public String createSecurityCode() {
	
	StringBuffer code = new StringBuffer();
	
	// String : 불변성
	// StringBuffer : 가변성
	
	Random ran = new Random(); // 난수 생성 객체
	
	for(int i=0; i<6 ; i++) {
		int x = ran.nextInt(10); // 0이상 10미만 정수
		code.append(x); // StringBuffer 마지막에 추가(뒤에 이어 붙임)
	}
	
	return code.toString();
	
}
/**
 * @param memberPw
 * @param memberNo
 * @return 
 */
public int unRegisterMember(String memberPw, int memberNo) throws Exception {
	
	Connection conn = getConnection();
	
	int result = dao.unRegisterMember(conn, memberPw, memberNo);
	
	if(result > 0) commit (conn);
	else           rollback (conn);
	
	return 0;
	
	close(conn);
	
	return result;
}



	
	

}
