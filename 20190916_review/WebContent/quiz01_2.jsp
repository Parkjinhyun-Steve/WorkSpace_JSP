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
	request.setCharacterEncoding("UTF-8");
	
	String a = request.getParameter("text1");
	String b = request.getParameter("text2");
		
	%>
	
	<%=a+b %> <br>
	
	<%=request.getParameter("text1") + request.getParameter("text2") %>

</body>
</html>