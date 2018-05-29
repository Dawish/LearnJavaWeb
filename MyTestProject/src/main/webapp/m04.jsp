<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/m04" method="post">
	<fieldset>
		<legend>表单</legend>
		<p>
			<label>学生ID：</label><input type="text" name="id">
		</p>
		<p>
			<label>学生Name：</label><input type="text" name="name">
		</p>
		<p>
			<label>学生Age：</label><input type="text" name="age">
		</p>
		<p>
			<input type="submit">
		</p>
	</fieldset>
	</form>
</body>
</html>