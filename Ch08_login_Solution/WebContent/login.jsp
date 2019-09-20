<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<%
	String id = (String)session.getAttribute("id");

	String cookie=request.getHeader("Cookie");
	String cookieID="";
	if(cookie!=null){
		Cookie[] cookies=request.getCookies();
		for(Cookie temp: cookies){
			if(temp.getName().equals("id"))
				cookieID=temp.getValue();
		}
		
	}

%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%if(id==null){ %>

	<form action="loginProcess.jsp" method="post">
	
		ID : <input type="text" name="id" value=<%=cookieID%>> <br>
		PW : <input type="password" name="pw">  <br>
		<input type="submit" value="로그인"> <br>
		<input type="checkbox" name="idCheck" <%if(!(cookieID.equals(""))){%> checked <%} %> > 아이디 저장 <br>
	
	</form>
	
	<%}else { %>
	
	<%=id %> 님 환영합니다. <br>
	
	<input type="button" onclick="location.href='logout.jsp'" value="로그아웃"> <br>
	
	<%} %>
	
		

</body>
</html>