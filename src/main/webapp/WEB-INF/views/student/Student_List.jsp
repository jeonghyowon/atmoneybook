<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�л� ����Ʈ</title>
</head>
<body>
	<h2>�л� ����Ʈ</h2>
	<table border="1" width="700px">
		<tr>
			<th>��ȣ</th>
	        <th>�̸�</th>
	        <th>����</th>
	        <th>����</th>
	        <th>����</th>
		</tr>
		<c:forEach var="student" items="${studentList}">
		<tr>
			<td>${student.student_no}</td>
			<td>${student.name}</td>
			<td>${student.age}</td>
			<td><a href="/studentUpdate?student_no=${student.student_no}" class="btn_add">����</a></td>
			<td><a href="/studentDelet?student_no=${student.student_no}" class="btn_add">����</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>