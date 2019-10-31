<%@ page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	Random rand = new Random();
	
	int num1=rand.nextInt()%9+1;
	int num2=rand.nextInt()%9+1;
	int result=num1*num2;
			
%>  
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="quiz9_2.jsp" method="get">
	<%=num1 %> * <%=num2 %> = <input type="number" name="result">
	<input type="hidden" name="result" value=<%=num1 %>>
	<input type="hidden" name="result" value=<%=num2 %>>	
	<input type="submit" value="계산">
	
	</form>

</body>
</html>