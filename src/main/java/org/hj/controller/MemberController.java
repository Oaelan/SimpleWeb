package org.hj.controller;

import org.hj.model.UserInfo;
import org.hj.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
	@Autowired
	MemberService ms;
	
	@GetMapping("/join")
	public String join() {
		return "member/join";
	}
			
	
	@PostMapping("/join")
	public String insertUser(UserInfo user) {
		ms.insertUser(user);
		return "joinSuccess";
	}
	
}
