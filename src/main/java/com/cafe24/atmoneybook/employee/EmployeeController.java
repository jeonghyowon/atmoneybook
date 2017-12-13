package com.cafe24.atmoneybook.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeDao employeedao;
	
	@RequestMapping(value="/EmployeeList", method=RequestMethod.GET)
	public String employeeList(Model model) {
		System.out.println("직원 리스트 구현하기 Controller");
		List<Employee> list = employeedao.employeeList();
		model.addAttribute("employeelist",list);
		return "employee/Employee_List";
		
	}
	
}
