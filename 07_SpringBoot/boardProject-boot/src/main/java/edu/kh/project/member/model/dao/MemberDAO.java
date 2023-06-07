package edu.kh.project.member.model.dao;

import edu.kh.project.member.model.dto.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {

	@Autowired
	private MemberMapper memberMapper; // MemberMapper 인터페이스를 상속 받은 자식 객체
	
	/** 로그인 DAO
	* @param inputMember
	* @return 회원 정보 또는 null
	*/
	public Member login(Member inputMember) {
		return memberMapper.login(inputMember);
	}

	/** 회원 가입 DAO
	* @param inputMember
	* @return result
	*/
	public int signUp(Member inputMember) {
		return memberMapper.signUp(inputMember);
	}

}
