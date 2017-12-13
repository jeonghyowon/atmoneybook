package com.cafe24.atmoneybook.employee;

public class Employee {

	private int employee_no;
	private String name;
	private int age;
	
	public int getEmployee_no() {
		return employee_no;
	}
	public void setEmployee_no(int employee_no) {
		this.employee_no = employee_no;
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
		return "Employee [employee_no=" + employee_no + ", name=" + name + ", age=" + age + "]";
	}
	
}
