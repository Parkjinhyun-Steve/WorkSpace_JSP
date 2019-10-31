<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	${sessionScope.test} <br>   <%-- <%=session.getAttribute("test") %> 와 같은 의미    --%>	
	${param.name}  <%-- <%=request.getParameter("name") %> 와 같은 의미    --%>

</body>
</html>