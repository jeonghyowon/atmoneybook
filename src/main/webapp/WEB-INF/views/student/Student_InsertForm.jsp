<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>학생 등록</title>
</head>
<body>
	<h1>학생 등록</h1>
	<form action="./StudentAdd" method="post">
		<table>
			<tr>
				<td>이름 : </td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>나이 : </td>
				<td><input type="text" name="age"></td>
			</tr>
		</table>
		<input type="submit" value="등록">
	</form>
</body>
</html>