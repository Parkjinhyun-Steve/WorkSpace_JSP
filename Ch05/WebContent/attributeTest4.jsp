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
		pageContext.setAttribute("pageScore", "Pagevalue");
		request.setAttribute("requestScope", "requestvalue");		
	%>
	
	<%=pageContext.getAttribute("pageScope") %> <br>
	<%=request.getAttribute("requestScope") %>
	
	<%pageContext.forward("attributeTest5.jsp"); %>
	
	<jsp:forward page="attribute5.jsp">
		<jsp:parm name="name" value="홍길동">
		<jsp:parm name="id" value="hong">
	</jsp:forward>
	
</body>
</html>