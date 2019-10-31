<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Random rand = new Random();
	int num1 = rand.nextInt(10)+5;
	int num2 = rand.nextInt(10)+5;

%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="quiz02_2.jsp">
	
	<h1> 덧셈 계산 <br></h1>
	
		<input type="number" name="num1" value=<%=num1 %>> + 
		<input type="number" name="num2" value=<%=num2 %>> =
		<input type="number" name="result"> <br><br>	
		<input type="submit" value="전송">
	
	</form>

</body>
</html>