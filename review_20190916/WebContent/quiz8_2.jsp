<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	int price = Integer.parseInt(request.getParameter("price"));
	int money = Integer.parseInt(request.getParameter("money"));
	int result = money - price;
	
	int result10000 = result/10000;      //3 
	int result1000 = (result-(result10000*10000))/1000;
	int result100 = (result-(result10000*10000)-(result1000*1000))/100;
	int result10 = (result-(result10000*10000)-(result1000*1000)-(result100*100))/10;
			
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	if(result>=0) {%>
		거스름돈은 <%=result%> 입니다. <br>		

			<%if(result10000!=0){ %>
			만원 개수 : <%=result10000%> <br>
			<%}else{} %>			
			
			<%if(result1000!=0){ %>
			천원 개수 : <%=result1000%> <br>
			<%}else{} %>

			<%if(result100!=0){ %>
			백원 개수 : <%=result100%> <br>
			<%}else{} %>

			<%if(result10!=0){ %>
			십원 개수 : <%=result10%> <br>
			<%}else{} %>
				
	<%}else { %>
		돈을 더 받으세요
	<%} %>
	

</body>
</html>