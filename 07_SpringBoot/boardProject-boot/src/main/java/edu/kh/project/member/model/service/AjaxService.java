package edu.kh.project.member.model.service;

import java.util.List;

import edu.kh.project.member.model.dto.Member;

public interface AjaxService {

	String selectNickname(String email);

	/** 닉네임으로 전화번호 조회
	 * @param nickname
	 * @return tel
	 */
	String selectMemberTel(String nickname);

	/** 이메일 중복 화인
	 * @param email
	 * @return count
	 */
	int checkEmail(String email);

	/** 닉네임 중복 확인
	 * @param nickname
	 * @return count
	 */
	int checkNickname(String nickname);

	/** 이메일로 정보 조회
	 * @param email
	 * @return 
	 */
	Member selectMember(String email);

	/** 이메일이 일부라도 일치하는 모든회원 조회
	 * @param input
	 * @return memberList
	 */
	List<Member> selectMemberList(String input);

}
