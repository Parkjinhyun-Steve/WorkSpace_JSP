<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	
	<c:if test="${empty sessionScope.id}"> 
			
		<form action ="Login.do" method="post" >
		<h1> Login Page </h1>			
			id : <input type = "text" name="id" > <br>
			pw : <input type = "text" name="pw" > <br><br>			
			<input type = "submit" value = "로그인">	
		</form>
	</c:if>
	
	<c:if test="${!empty sessionScope.id}">	
		${sessionScope.id}님 반갑습니다. <br> <br>
		<a href="Logout.jsp"> 로그아웃 </a>
	</c:if>
	
	<c:if test="${empty sessionScope.id}">
		!아이디, 패스워드를 확인해 주세요
							
	</c:if>


</body>
</html>