<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%	int result = Integer.parseInt(request.getParameter("result"));
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	long time1 = Long.parseLong(request.getParameter("time1"));
	long time2 = System.currentTimeMillis();
	long time = (time2 - time1) / 1000;  // 걸린 시간 ( ms / 1000)
	int answer = num1 * num2;
	
%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	if(answer==result){ %>
		정답입니다.
	<%}else { %>
		오답입니다.
	<%} %>
	
	<br> 걸린시간은 <%=time %>초 입니다.

</body>
</html>