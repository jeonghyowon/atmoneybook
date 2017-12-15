package com.dafe24.atmoneybook.manager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ManagerController {
	
	@RequestMapping(value="/ManagerList", method=RequestMethod.GET)
	public String managerList() {
		System.out.println("매니저 리스트 구현하기 Controller");
		return "manager/Manager_List";
	}
}