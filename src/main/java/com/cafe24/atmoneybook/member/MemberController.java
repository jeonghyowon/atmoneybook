package com.cafe24.atmoneybook.member;

import java.util.List;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	
	@Autowired
	MemberDao memberdao; 
	
	@RequestMapping(value="/MemberList", method=RequestMethod.GET)
	public String memberList(Model model) {
		System.out.println("멤버 리스트 구현하기 Controller");
		List<Member> list = memberdao.memberList();
		model.addAttribute("memberlist",list);
		return "member/Member_List";
		
	}
	
}
