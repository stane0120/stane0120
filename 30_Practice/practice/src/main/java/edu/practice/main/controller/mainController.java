package edu.practice.main.controller;

import org.springframework.stereotype.Controller; // 컨트롤러 어노테이션 임포트
import org.springframework.web.bind.annotation.RequestMapping; 

/* @RequestMapping : 요청에 대한 어떤  Controller, 어떤 메소드가 처리할지를 맵핑하기 위한 어노테이션 */


@Controller
public class mainController {
	
	@RequestMapping("/")
	public String mainForward() {
		return "common/main";  // jsp파일을 실행시키는 컨트롤러
	}

}
