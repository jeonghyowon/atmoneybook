package com.cafe24.atmoneybook.member;

public class Member {

		private int no;
		private String name;
		private int age;
		
		
		public int getNo() {
			return no;
		}
		public void setNo(int no) {
			this.no = no;
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
			return "Member [no=" + no + ", name=" + name + ", age=" + age + "]";
		}
		
		
	
}
