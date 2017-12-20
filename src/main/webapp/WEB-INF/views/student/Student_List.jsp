<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>학생 리스트</title>
</head>
<body>
	<h2>학생 리스트</h2>
	<table border="1" width="700px">
		<tr>
			<th>번호</th>
	        <th>이름</th>
	        <th>나이</th>
	        <th>수정</th>
	        <th>삭제</th>
		</tr>
		<c:forEach var="student" items="${studentList}">
		<tr>
			<td>${student.student_no}</td>
			<td>${student.name}</td>
			<td>${student.age}</td>
			<td><a href="/studentUpdate?student_no=${student.student_no}" class="btn_add">수정</a></td>
			<td><a href="/studentDelet?student_no=${student.student_no}" class="btn_add">삭제</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>