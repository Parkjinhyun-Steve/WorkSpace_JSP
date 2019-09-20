<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String cookie = request.getHeader("Cookie");
	String language="korea";
	
	if(cookie != null) { 
		Cookie cookies[] = request.getCookies();		
		for(Cookie temp:cookies){
			if(temp.getName().equals("language"))
				language = temp.getValue();
			
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
	
	<%if(language.equals("korea")){ %>
		안녕하세요.
	<%}else { %>
		Hello
	<%} %>
	
	<form action="cookieExample2.jsp" method="post" >
		<input type="radio" name="language" value="korea"		
		<%if(language.equals("korea")) { %> checked <%} %> >한국어 페이지
		
		<input type="radio" name="language" value="english"
		<%if(language.equals("english")) { %> checked <%} %> >영어 페이지
		
		<input type="submit" value="설정">
	</form>
</body>
</html>