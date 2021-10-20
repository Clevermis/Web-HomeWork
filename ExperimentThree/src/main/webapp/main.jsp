<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>主页</title>
</head>
<body>
<%
	String username=(String)session.getAttribute("username");  //获取保存在session范围内的用户名
	if(username!=null) {
		out.print("登陆成功！欢迎" + username + "浏览站点！");
	}
	else
		response.sendRedirect("login1.jsp");
%>
<%
	if(application.getAttribute("count")==null){
		application.setAttribute("count",0);
	}
%>
<%
	int count=Integer.parseInt(application.getAttribute("count").toString());
	count++;
	application.setAttribute("count", count);
%>
<div class="p3">访问次数：<%=application.getAttribute("count") %></div>
<a href="login1.jsp">[退出]</a>
</body>
</html>