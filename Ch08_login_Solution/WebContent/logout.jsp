<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	session.removeAttribute("id");
%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="login.jsp" method="post">

	로그아웃 되었습니다. <br>
	
	<input type="submit" value="되돌아가기"> <br>
	
	</form>	

</body>
</html>