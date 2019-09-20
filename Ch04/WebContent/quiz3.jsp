<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

	<%
	
	int a = 0;
	int b = 0;
	for(int i=0; i<=100; i++){
		a = i%2;
		if(a == 0) b=b+i;	
	}
	
	%>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		
	1~100 사이에 있는 <br>
	<em>짝수 </em> 등의 합은 <br>
	
	<font size=14px> <%=b %></font> 입니다.

</body>
</html>