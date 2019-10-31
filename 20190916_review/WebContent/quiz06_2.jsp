<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int num = Integer.parseInt(request.getParameter("num"));
	String result = null;
%>    
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	if(num%2==0){
		result="짝수";
	}else{
		result="홀수";
	}
		
	%>

	입력한 <%=num %>은 <br>
	<b><%=result %></b>입니다.
	

</body>
</html>