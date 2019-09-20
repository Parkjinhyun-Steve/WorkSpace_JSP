<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
		session.setMaxInactiveInterval(100);
	%>
	
	세션 생성 유무 : <%=session.isNew() %><br>
	세션 생성 시간 : <%=session.getCreationTime() %><br>
	최종 접속 시간 : <%=session.getLastAccessedTime() %><br>
	세션ID : <%=session.getId() %><br>

</body>

</html>