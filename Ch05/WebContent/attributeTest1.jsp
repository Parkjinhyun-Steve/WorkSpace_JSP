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
		request.setCharacterEncoding("utf-8");
		String name=request.getParameter("name");
		String id=request.getParameter("id");
		application.setAttribute("name", name);
		application.setAttribute("id", id);
	
	%>
	
	<form action="attributeTest2.jsp" method="post">
	<table border="1">
		<tr>
			<td colspan="2">session 에 저장할 내용들</td>
		</tr>
		
		<tr>
			<td>e-mail</td>
			<td><input type="text" name="email"></td>			
		</tr>		
		
		<tr>
			<td>집주소</td>
			<td><input type="text" name="address"></td>			
		</tr>
		
		<tr>
			<td colspan="2"><input type="submit" value="전송"></td>
		</tr>
	
	</table>
	</form>
	
	

</body>
</html>