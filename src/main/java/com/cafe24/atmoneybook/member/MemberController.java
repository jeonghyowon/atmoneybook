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
	MemberDao memberdao; // MemberDao memberdao = new MemberDao();
	
	// ����ȭ�鿭��
	@RequestMapping(value="/MemberaddForm", method=RequestMethod.GET)
	public String memberaddForm() {
		System.out.println("����ȭ�鿭�� controller");
		
		return "member/Member_InsertForm";
	}	
	// ����ó���ϱ�
	@RequestMapping(value="/Memberadd", method=RequestMethod.POST)
	public String memberadd(Member member) {
		System.out.println("����ó���ϱ� controller");
		memberdao.memberAdd(member);
		return "redirect:/MemberList";
	}
	// ��� ����Ʈ
	@RequestMapping(value="/MemberList", method=RequestMethod.GET)
	public String memberList(Model model) {
		System.out.println("��� ����Ʈ �����ϱ� Controller");
		List<Member> list = memberdao.memberList();
		model.addAttribute("memberlist",list);
		return "member/Member_List";
	}
}
