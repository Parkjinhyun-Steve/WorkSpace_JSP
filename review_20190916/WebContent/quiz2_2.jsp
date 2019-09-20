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
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	String select = request.getParameter("select");
	
	int i = 0;
	int sum = 0;	
		
	if(select.equals("even")) {
		for(i = num1 ; i <= num2; i++){
			if(i%2==0) {
				sum = sum + i;
			}
		}
		
	}else {
		for(i = num1 ; i <= num2; i++){
			if(i%2!=0) {
				sum = sum + i;
			}
		}				
	}	
		
	%>
	
	<%=num1 %> 에서 <%=num2 %> 까지의 <br>
	<%
	if(select.equals("even"))
		out.print("짝수");
	else
		out.print("홀수");
	%>	
	의 더한 값은 <%=sum %>입니다.<br>

</body>
</html>