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

	<form action = "index.do" method = "post">
	
		<h1> 입력 </h1>		
		■ 이름 : <input type="text" id="name" name="name"> <br>
		■ 내용 : <input type="text" id="text" name="text"> <br><br>		
		<input type="submit" value="제출">		
		
	</form>
	
	<h3> text </h3><br>
	<c:forEach var="aa" items="${bean}">
		${aa.no} ${aa.id} ${aa.text} <br>
	</c:forEach>	

</body>
</html>