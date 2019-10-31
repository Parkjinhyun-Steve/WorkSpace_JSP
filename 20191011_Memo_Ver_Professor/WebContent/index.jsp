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

	<form action="test" method="post">		
	
		<h1> 입력 </h1>		
		■ 이름 : <input type="text" id="id" name="id"> <br>
		■ 내용 : <input type="text" id="text" name="text"> <br><br>		
		<input type="submit" value="제출">	
		
	</form>

	<h1> text </h1><br>
	<c:forEach var="aa" items="${vo}">
		${aa.id} ${aa.text} <br>
	</c:forEach>

</body>
</html>
