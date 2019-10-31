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

	<c:set var="test" value = "Hello JSTL!"/> <br>
	<c:out value="${test}"/> <br>
	<c:remove var="test"/> <br>
	
	지우고 보기 : <c:out value="${test}"/>
	
	<c:catch var="err">
	<%=10/0 %>
	
	</c:catch> <br>
		
	<c:out value="${err}"/>	
		
	<c:if test="${5<10}">
		참
	</c:if> <br>
	
	<c:choose> <br>
		<c:when test="${5+10==50}">
			5+10은 50이다
		</c:when>
		
		<c:otherwise>
			5+10은 50이 아니다.
		</c:otherwise>
	</c:choose> <br>
	
	<c:forEach var="test" begin="1" end="10" step="2">
		${test } &ndsp;&ndsp;
	</c:forEach> <br>
	
	
	


</body>
</html>