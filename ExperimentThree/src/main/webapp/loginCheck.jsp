<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>保存</title>
</head>
<%
	request.setCharacterEncoding("UTF-8");		//设置编码
	String userName=request.getParameter("userName");		//获取用户名
	String passWord=request.getParameter("passWord");		//获取密码
	if(userName.length()>0&&passWord.length()>0){
	  session.setAttribute("username",userName);
	  response.sendRedirect("main.jsp");
  }else{	
	  response.sendRedirect("login1.jsp");
  }
%>
<body>
</body>
</html>