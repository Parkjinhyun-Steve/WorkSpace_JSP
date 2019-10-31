<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${parm.num1}
	${parm.num2}
	
	<form action="test01_3.jsp" method="get">
	
		<input type="text" name="num1"> + <input type="text" name="num2"> <br>	
			
		<input type = "submit" value="출력">
	
	</form>		

</body>
</html>