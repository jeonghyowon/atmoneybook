package com.cafe24.atmoneybook.employee;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	
	@Autowired
	SqlSession sql;
	
	private final String NS="com.cafe24.atmoneybook.employee.EmployeeMapper.";
	
	public List<Employee> employeeList() {
		System.out.println("직원 리스트 구현하기 Dao");
		return sql.selectList(NS+"employeeList");
	}
	
}
