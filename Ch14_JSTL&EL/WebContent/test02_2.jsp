<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String id = request.getParameter("id");
	if(id.equals("aaa")){
		session.setAttribute("id", id);  // 세션에 id 기록		
	}else {
		session.removeAttribute("id");  // 세션에 id 삭제
	}	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<a href="test02_3.jsp"> 로그인 확인 </a>	

</body>
</html>