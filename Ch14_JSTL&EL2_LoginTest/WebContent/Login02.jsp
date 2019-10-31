<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%
	//String id = request.getParameter("id");
	//String pw = request.getParameter("pw");
	
	
	//if(id.equals("dlwlrma") && pw.equals("1234")){ 
	//	session.setAttribute("id", id);  // 세션에 id 기록		
	//}else {
	//	session.removeAttribute("id");  // 세션에 id 삭제
	//}	
%>
 
<% 
	//<c:set var="id" value="dlwlrma" />
	//<c:set var="pw" value="1234" />	
	//<c:if test="${id eq 'dlwlrma' and pw eq '1234'}" var="id" scope="session" >
	//</c:if>
%> 


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<c:if test="${empty sessionScope.id}">		
		로그인을 해주세요. <br> <br>
		<a href="Login01.jsp"> 로그인 </a>
	</c:if>
	
	<c:if test="${!empty sessionScope.id}">
		${sessionScope.id}님 반갑습니다. <br> <br>
		<a href="Logout.jsp"> 로그아웃 </a>
	</c:if>
	

</body>
</html>