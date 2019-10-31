<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%=request.getParameter("name1") %> 와 <%=request.getParameter("name2") %>의 궁합은 <%=request.getAttribute("a") %>% 입니다. 

</body>
</html>