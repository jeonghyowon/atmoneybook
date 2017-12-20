package com.cafe24.atmoneybook.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {
	@Autowired
	StudentDao studentdao;
	
	// �л� ��� ȭ��
	@RequestMapping(value="/StudentInsertForm", method=RequestMethod.GET)
	public String studentInsertForm() {
		System.out.println("�л� ��� ȭ�� Controller");
		return "student/Student_InsertForm";
	}	 
	// �л� ����Ʈ
	@RequestMapping(value="/StudentList", method=RequestMethod.GET)
	public String studentList(Model model) {
		System.out.println("�л� ����Ʈ Controller");
		List<Student> list = studentdao.studentList();
		model.addAttribute("studentList", list);
		return "student/Student_List";
	}
	// �л� ��� ó��
	@RequestMapping(value="/StudentAdd", method=RequestMethod.POST)
	public String studentInsert() {
		System.out.println("�л� ��� ó�� Controller");
		return "redirect:/StudentList";
		
	}
}
