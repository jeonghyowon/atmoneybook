<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>���� ����Ʈ</title>
</head>
<body>
	<h2>���� ����Ʈ</h2>
	    <table border="1" width="700px">
	        <tr>
	            <th>��ȣ</th>
	            <th>�̸�</th>
	            <th>����</th>
	            <th>����</th>
	            <th>����</th>
	        </tr>
	        <c:forEach var="employee" items="${employeelist}">
			<tr>
				<td>${employee.employee_no}</td>
				<td>${employee.name}</td>
				<td>${employee.age}</td>
				<td><a
					href="/memberupdate?employee_no=$employee.employee_no}"
					class="btn_add">����</a></td>
				<td><a href="/memberdelete?employee_no=${employee.employee_no}"
					class="btn_add">����</a></td>
			</tr>
			</c:forEach>	        
    	</table>
</body>
</html>