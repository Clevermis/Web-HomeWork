<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>hello world</title>
</head>
<body>
Hello World!<br/>
<%
out.print("你的 IP 地址 " + request.getRemoteAddr());
%>
</body>
</html>