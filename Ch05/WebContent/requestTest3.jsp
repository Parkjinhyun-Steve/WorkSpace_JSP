<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	서버도메인용 : <%=request.getServerName() %> <br>
	서버포트번호 : <%=request.getServerPort() %> <br>
	요청 URL : <%=request.getRequestURL() %> <br>
	요청 URI : <%=request.getRequestURI() %> <br>	
	
	

</body>
</html>