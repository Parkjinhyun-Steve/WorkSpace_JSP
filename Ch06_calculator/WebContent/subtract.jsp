<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String as = "";
	String bs = "";
	String result ="";	
	
	if(request.getParameter("num1") != null) {
		
		as = request.getParameter("num1");
		bs = request.getParameter("num2");
		
		int ai = Integer.parseInt(request.getParameter("num1"));
		int bi = Integer.parseInt(request.getParameter("num2"));		
		int sum = ai - bi;
		
		result = Integer.toString(sum);
		
	}

%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="top.jsp"/><br>
		
	<b>빼기</b> <br>
	
	<form action=subtract.jsp>
		<input type="text" name="num1" value=<%=as%>> -
		<input type="text" name="num2" value=<%=bs%>> =
		<input type="text" name="result" value=<%=result%>>	
	
		<input type="submit" value="계산">
	
	</form>
	
	
	</body>	
</html>