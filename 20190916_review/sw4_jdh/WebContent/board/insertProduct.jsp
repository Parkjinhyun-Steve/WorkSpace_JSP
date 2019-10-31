<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<style >
		button {
			width : 80px; 
			height : 35px;
			text-align : center;
			background-color : #f5f5dc;
			font-size : 20;
		}
		input[type=submit]{
			width : 80px; 
			height : 35px;
			text-align : center;
			background-color : #f5f5dc;
			font-size : 20;
		}
	</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>생산관리 등록화면</h1>
<fieldset>
	<legend>생산관리 등록화면</legend>
	<form action="insertDB.bo" method="post">
	<table>
		<tr>
			<td>제품코드</td>
			<td><input type="text" name="code" ></td>
		</tr>
		<tr>
			<td> 제품이름</td>
			<td> <input type="text" name="pname"></td>
		</tr>
		<tr> 
			<td>제품원가 </td>
			<td><input type="text" name="cost" ></td>
		</tr>
		<tr>
			<td> 목표수량</td>
			<td><input type="text" name="pnum"></td>
		</tr>
		<tr>
			<td> 재고수량 </td>
			<td><input type="text" name="jnum"></td>
		</tr>
		<tr>
			<td> 출고가</td>
			<td><input type="text" name="sale"></td>
		</tr>
		<tr>
			<td> 그룹이름 </td>
			<td><select name="gcode">
					<option value="A">컴퓨터</option>
					<option value="B">냉장고</option>
					<option value="C">냉장소모품</option></td>
				</select></td>
		</tr>
	</table>
		<input type="submit" value="등 록"><button type="button" onclick ="location.href='main.jsp'">메인화면</button>
	</form>
</fieldset>
</body>
</html>