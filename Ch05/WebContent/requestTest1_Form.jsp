<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


</head>
<body>

	<h1>Request 예제입니다.</h1>
	<form action="request1.jsp" method="post">
	
	이름 <input type="text" name="name"><br>
	성별 남 <input type="radio" name="gender" value="male">
	여 <input type="radio" name="gender" value="female"><br>
	취미 독서 <input type="checkbox" name="hobby" value="독서">
	게임 <input type="checkbox" name="hobby" value="게임">
	TV시청 <input type="checkbox" name="hobby" value="TV시청 ">
	축구 <input type="checkbox" name="hobby" value="축구">
	기타 <input type="checkbox" name="hobby" value="기타"><br>
	<input type="submit" value="전송"><br>
	
	</form>

</body>
</html>