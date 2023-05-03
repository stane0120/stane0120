package edu.kh.project.member.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.kh.project.member.model.dao.AjaxDAO;
import edu.kh.project.member.model.dto.Member;

@Service // 서비스임을 명시 + bean 등록
public class AjaxServiceImpl implements AjaxService {
   
	@Autowired // DI
	private AjaxDAO dao;

	@Override
	public String selectNickname(String email) {
		return dao.selectNickname(email);
	}

	public String selectMemberTel(String nickname) {

		return dao.selectMemberTel(nickname);
	}

	@Override
	public int checkEmail(String email) {
		return dao.checkEmail(email);
	}

	@Override
	public int checkNickname(String nickname) {
		return dao.checkNickname(nickname);
	}

	// 이메일로 회원 정보 조회
	@Override
	public Member selectMember(String email) {
		return dao.selectMember(email);
	}

	@Override
	public List<Member> selectMemberList(String input) {
		return dao.selectMemberList(input);
	}
	
	

}