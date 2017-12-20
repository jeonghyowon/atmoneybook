package com.cafe24.atmoneybook.student;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
	@Autowired
	SqlSession sql;
	
	private final String NS="com.cafe24.atmoneybook.student.StudentMapper.";
	
	public void studentInsert(Student student) {
		System.out.println("학생 등록 처리 Dao");
		sql.insert(NS+"studentInsert", student);
	}
	public List<Student> studentList() {
		System.out.println("학생 리스트 Dao");
		return sql.selectList(NS+"studentList");
	}
}
