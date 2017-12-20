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
	
	// 학생 등록 화면
	@RequestMapping(value="/StudentInsertForm", method=RequestMethod.GET)
	public String studentInsertForm() {
		System.out.println("학생 등록 화면 Controller");
		return "student/Student_InsertForm";
	}	 
	// 학생 리스트
	@RequestMapping(value="/StudentList", method=RequestMethod.GET)
	public String studentList(Model model) {
		System.out.println("학생 리스트 Controller");
		List<Student> list = studentdao.studentList();
		model.addAttribute("studentList", list);
		return "student/Student_List";
	}
	// 학생 등록 처리
	@RequestMapping(value="/StudentAdd", method=RequestMethod.POST)
	public String studentInsert() {
		System.out.println("학생 등록 처리 Controller");
		return "redirect:/StudentList";
		
	}
}
