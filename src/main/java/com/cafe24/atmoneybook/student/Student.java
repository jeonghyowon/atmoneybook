package com.cafe24.atmoneybook.student;

public class Student {
	
	private int student_no;
	private String name;
	private int age;
	
	public int getStudent_no() {
		return student_no;
	}
	public void setStudent_no(int student_no) {
		this.student_no = student_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [student_no=" + student_no + ", name=" + name + ", age=" + age + "]";
	}
	
}
