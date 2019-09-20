<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

	<%	
	int sum = 0;
	for(int i=0; i<=1000; i++){
		if(i%3==0 || i%5==0 ) sum+=i;	
	}	
	%>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	1~1000사이에 있는 <br>
	3과 5의 배수를 <sup>(중복제거)</sup> <font=20px>모두</font><br>
	더하면<br>
	<font color="red"><u> <%=sum %> </u></font> 입니다.

</body>
</html>