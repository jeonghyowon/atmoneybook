package com.dafe24.atmoneybook.manager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ManagerController {
	
	@RequestMapping(value="/ManagerList", method=RequestMethod.GET)
	public String managerList() {
		System.out.println("�Ŵ��� ����Ʈ �����ϱ� Controller");
		return "manager/Manager_List";
	}
}