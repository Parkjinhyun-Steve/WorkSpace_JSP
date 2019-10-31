<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	Random random = new Random();
	int r = random.nextInt(100 + 1);	
	String a = request.getParameter("name1");
	String b = request.getParameter("name2");
	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%=a %> 와 <%=b %>의 궁합은 <%=r %>% 입니다. 

</body>
</html>