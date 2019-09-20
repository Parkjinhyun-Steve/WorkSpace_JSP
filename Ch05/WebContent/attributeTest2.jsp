<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
	<%
		request.setCharacterEncoding("utf-8");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		session.setAttribute("email", email);
		session.setAttribute("address", address);
	
	%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="attributeTest3.jsp">저장정보 확인</a>


</body>
</html>