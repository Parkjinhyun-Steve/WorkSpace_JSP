<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% int num1=(int)(Math.random()*8)+2;
   int num2=(int)(Math.random()*8)+2;
	
	// random(min ~ max)  -> (max-min+1)+min
	
	long time1 = System.currentTimeMillis(); // 현재시간 구하기
	
%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	구구단 테스트<br><br>
	
	<form action="quiz10_2.jsp">
	<%=num1 %> * <%=num2 %> = <input type="number" name="result"><br><br>
	
	<input type="hidden" name="num1" value=<%=num1 %>>
	<input type="hidden" name="num2" value=<%=num2 %>>
	<input type="hidden" name="time1" value=<%=time1 %>>
	
	<input type="submit" value="확인">
		
	</form>
		

</body>
</html>