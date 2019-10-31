<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String str = "String Test String Test";
	System.out.println(str);
	String str1=URLEncoder.encode(str,"UTF-8");
	System.out.println(str1);
	String str2=str1.replace("+", "%20");
	System.out.println(str2);
	String str3=str1.replace("\\+", "%20");
	System.out.println(str3);
	
%>
</body>
</html>