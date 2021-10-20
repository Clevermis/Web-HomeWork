<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <% request.setCharacterEncoding("utf-8");%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>接收登陆页面传来的数据</title>
<%
//从index.jsp页面传来的数据，用request接收
String name=request.getParameter("name");//前台页面传递过来的无论是key还是value都是String类型
String phone=request.getParameter("phone");
%>
</head>
<body>
你提交的用户名称是：<%=name %><br />
你提交的用户电话是：<%=phone %><br />
</body>
</html>