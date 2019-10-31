<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String login = request.getParameter("login");
	if(login==null){
		login="fail";
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%if(login.equals("fail")) {%>
	
	<form action="quiz03_2.jsp" method="get">
		
	ID : <input type="text" name="id"> <br>
	PW : <input type="password" name="pw"> <br><br>
	
	<input type="submit" value="로그인"> <br>
	
	</form>
	
	<%}else { %>
	
	<%=request.getParameter("id") %>님 로그인 되었습니다.
	
	<%} %>
		

</body>
</html>