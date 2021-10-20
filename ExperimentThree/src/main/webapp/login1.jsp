<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录</title>
</head>
<body>
	<font size="2">
	<form action="loginCheck.jsp" method="post">
	用户名:<input type="text" name="userName" size="10"><br/>
	密&nbsp;&nbsp;&nbsp;码:<input type="password" name="passWord" size="10"><br/></font>
	<font size="1" color="green">(提交后，用户名将被存入session中)</font><br>
	<input type="submit" value="提交">
	</form>
</body>
</html>