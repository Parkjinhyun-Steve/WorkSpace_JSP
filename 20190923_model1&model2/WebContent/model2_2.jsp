<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	int sum = (int) request.getAttribute("sum");  // Attribute 문자뿐 아니라 모든 형을 보내고 받을 수 있다.
%> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%=sum %>

</body>
</html>