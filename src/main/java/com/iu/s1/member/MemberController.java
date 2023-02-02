package com.iu.s1.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/member/*")
public class MemberController {

	
	@RequestMapping(value = "join")
	public String getMemberJoin() {
		System.out.println("Member Join");
		return "member/memberJoin";
	}
	
	
	@RequestMapping(value ="memberLogin")//http://localhost/s1/member/memberLogin
	public void memberLogin() {
	
	
	}
	
	@RequestMapping(value = "myPage")
	public ModelAndView update() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("member/memberPage");
		return mv;
	}
}
