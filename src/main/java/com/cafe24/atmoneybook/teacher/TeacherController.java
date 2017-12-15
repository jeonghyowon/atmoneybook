package com.cafe24.atmoneybook.teacher;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TeacherController {
	
	@RequestMapping(value="/Teacher", method=RequestMethod.GET)
	public String teacherList() {
		return "teacher/Teacher_List";
		
	}

}
