<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.*" %>

<%
	Random rand = new Random();
	
	int a = rand.nextInt(8);
	int b = rand.nextInt(8);
	int c = a+1;
	int d = b+1;

%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	구구단 테스트
	
	<form action="quiz9_2.jsp">
	
	<%=c %> X <%=d %> = <input type="number" name="num"> <br>
	<input type="hidden" name="c" value=<%=c %>>
	<input type="hidden" name="d" value=<%=d %>>
	<input type="submit" value="확인">
	
	</form>


</body>
</html>