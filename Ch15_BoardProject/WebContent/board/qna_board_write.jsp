<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2> 게시판 글쓰기 </h2>

	<form action="BoardWritePro.bo" method="post" enctype="multipart/form-data">
		
		<table>
			<tr>
				<td> 이름 </td><td><input type="text" name="BOARD_NAME">
			</tr>
		
			<tr>
				<td> 암호 </td><td><input type="password" name="BOARD_PASS">
			</tr>
		
			<tr>
				<td> 제목 </td><td><input type="text" name="BOARD_SUBJECT">
			</tr>
	
			<tr>
				<td> 내용 </td><td><textarea name="BOARD_CONTENT"></textarea>
			</tr>
			
			<tr>
				<td> 파일첨부 </td><td><input type="file" name="BOARD_FILE" value="찾아보기">
			</tr> 
			
		</table> <br>
			<input type="submit" value="Submit">
			<input type="reset" value="ReWrite">			
	</form>
	
</body>
</html>