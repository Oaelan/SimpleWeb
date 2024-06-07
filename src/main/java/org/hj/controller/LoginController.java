package org.hj.controller;

import javax.servlet.http.HttpSession;

import org.hj.model.UserInfo;
import org.hj.service.LoginService;
import org.hj.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class LoginController {
	@Autowired
	LoginService ls;
	PostService ps;

	// 로그인 페이지
	@GetMapping("/")
	public String home() {
		System.out.println("홈");
		return "home";
	}


	// 로그인 서버
	@PostMapping("/")
	public String login(HttpSession session, UserInfo user) {
		System.out.println("로그인서버");

		if (ls.isLogin(user) != null) {
			session.setAttribute("id", ls.isLogin(user).getId());
			System.out.println("로그인 성공");
			// 세션에 아이디 값 저장
			// redirect 다른 컨트롤러에있는 맵핑값으로 이동한다!!!!
			// 제발 잊어버리지마..
			return "redirect:/board";
			
		} else {
			System.out.println("로그인 실패");
			return "home";
		}

	}

}
