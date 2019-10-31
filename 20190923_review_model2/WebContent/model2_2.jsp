<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	
	boolean check = (boolean) request.getAttribute("check");
	if (check == true) {
		check = true;
	}	
%>
        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% if (check) {%>

	로그인 성공!<br>
	
	<%}else { %>
	로그인 실패!<br>
	id 또는 pw를 확인해주세요.<br>
	
	<%} %>	

</body>
</html>