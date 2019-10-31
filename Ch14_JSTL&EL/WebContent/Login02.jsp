<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");	

	if(id.equals("dlwlrma") && pw.equals("1234")){ 
		session.setAttribute("id", id);  // 세션에 id 기록		
	}else {
		session.removeAttribute("id");  // 세션에 id 삭제
	}
	
%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:choose>
		<c:when test="${empty sessionScope.id}">
			로그인을 해주세요. <br> <br>
			<a href="Login01.jsp"> 로그인 </a>			
			
		</c:when>	
		<c:otherwise>
			현재 로그인 된 사용자는 <br>
			${sessionScope.id} 입니다. <br> <br>
			<a href="Login01.jsp"> 로그아웃 </a>
			
		</c:otherwise>
		
	</c:choose>
	

</body>
</html>