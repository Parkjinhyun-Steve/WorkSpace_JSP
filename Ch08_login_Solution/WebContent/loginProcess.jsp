<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	session.setAttribute("id", request.getParameter("id"));
	
	Cookie cookie = new Cookie("id", "");
	cookie.setMaxAge(600); // 유효기간
	response.addCookie(cookie);
	
	cookie=null;
	if(request.getParameter("idCheck")!=null){
		cookie = new Cookie("id", request.getParameter("id"));
				
	}else{
		cookie = new Cookie("id", "");
						
	}
	cookie.setMaxAge(600);
	response.addCookie(cookie);
	
%>   
    
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="logout.jsp" method="post">

	<%=request.getParameter("id") %> <br>
	<%=request.getParameter("pw") %> <br>
	<%=request.getParameter("idCheck") %> <br>
	
	<input type="submit" value="로그아웃"> <br>
	
	</form>	
	
</body>
</html>