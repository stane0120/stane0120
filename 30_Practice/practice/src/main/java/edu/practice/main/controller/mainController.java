package edu.practice.main.controller;

import org.springframework.stereotype.Controller; // 컨트롤러 임포트
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class mainController {
	
	@RequestMapping("/")
	public String mainForward() {
		return "common/main";  // jsp파일을 실행시키는 컨트롤러
	}

}
