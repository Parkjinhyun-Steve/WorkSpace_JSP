<%@page import="java.net.Inet4Address"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	int count = Integer.parseInt(request.getParameter("count"));	
%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	설문 조사<br>
	
	<%
		for( int i=1; i<=count; i++){ %>
			
			<%=i %>. <input type="radio" name="p<%=i %>" value="1">1 <input type="radio" name="p<%=i %>" value="2">2 <input type="radio" name="p<%=i %>" value="3">3 <br>
<%		}

%>
	


</body>
</html>