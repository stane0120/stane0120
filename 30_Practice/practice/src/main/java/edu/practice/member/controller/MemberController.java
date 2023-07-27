package edu.practice.member.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/member") // 공통된 주소 앞부분 작성 , member로 시작하는 요청은 해당 컨트롤러에서 처리
@SessionAttributes({"loginMember"}) // Model의 이름(key)를 적으면 session으로 추가
public class MemberController {
	

	@Autowired
	private MemberService service;
	
	
	//@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(HttpServletRequest req) {
		
		// 파라미터 전달 방법 1 : HttpServletRequest를 이용하는 방법
		// -> Controller 메서드에 매개변수로 HttpServletRequest 작성
		
		// ?매개 변수에 적으면 왜 사용 가능할까??
		// Spring Framework가 제공하는 
		// Argument Resolver(매개 변수 해결사)가 해결해줘서
		
		String inputEmail = req.getParameter("inputEmail");
		String inputPw = req.getParameter("inputPw");
		
		System.out.println("inputEmail : " + inputEmail);
		System.out.println("inputPw : " + inputPw);
		
		
		// ************** redirect 방법! **************
		// "redirect:요청주소"
		return "redirect:/";
	}
	
	
}
