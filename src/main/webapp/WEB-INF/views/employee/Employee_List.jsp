<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>직원 리스트</title>
</head>
<body>
	<h2>직원 리스트</h2>
	    <table border="1" width="700px">
	        <tr>
	            <th>번호</th>
	            <th>이름</th>
	            <th>나이</th>
	            <th>수정</th>
	            <th>삭제</th>
	        </tr>
	        <c:forEach var="employee" items="${employeelist}">
			<tr>
				<td>${employee.employee_no}</td>
				<td>${employee.name}</td>
				<td>${employee.age}</td>
				<td><a
					href="/memberupdate?employee_no=$employee.employee_no}"
					class="btn_add">수정</a></td>
				<td><a href="/memberdelete?employee_no=${employee.employee_no}"
					class="btn_add">삭제</a></td>
			</tr>
			</c:forEach>	        
    	</table>
</body>
</html>