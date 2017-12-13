<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	home.jsp  
</h1>

<P> ${serverTime} </P>

	<a href="./MemberList" > 멤버 리스트 보기</a><br><br>
	<a href="./EmployeeList" > 직원 리스트 보기</a>
</body>
</html>
