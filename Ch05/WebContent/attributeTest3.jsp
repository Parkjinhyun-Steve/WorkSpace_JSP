<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%=application.getAttribute("name") %>
	<%=application.getAttribute("id") %>
	<%=session.getAttribute("email") %>
	<%=session.getAttribute("address") %>
	
	
</body>
</html>