<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int c = Integer.parseInt(request.getParameter("c"));
	int d = Integer.parseInt(request.getParameter("d"));
	int num = Integer.parseInt(request.getParameter("num"));

%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%	
	if(num==c*d){ %>
		정답입니다.		
	<%}else {%>	
		오답입니다.
	<%} %>
	

</body>
</html>