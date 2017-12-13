package com.cafe24.atmoneybook.member;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {
	
	@Autowired
	SqlSession sql;
	
	private final String NS="com.cafe24.atmoneybook.member.MemberMapper.";
	
	public List<Member> memberList() {
		System.out.println("멤버 리스트 구현하기  Dao");		
		return sql.selectList(NS+"memberList");
	}

	
}
