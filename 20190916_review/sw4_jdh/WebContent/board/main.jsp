<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style >
	button {
		width : 120px; 
		height : 50px;
		text-align : center;
		background-color : #f5f5dc;
		font-size : 20;
	}
</style>

</head>
<body>
<h1>생산관리 시스템</h1>
	<fieldset>
		<legend>생산관리 메인메뉴</legend>
		
		<button type="button" onclick ="location.href='insertProduct.jsp'">제품입력</button>
		<button type="button" onclick ="location.href='findProduct.jsp'">제품조회</button>
		<button type="button" onclick ="location.href='#'">우선생산제품</button>
		<button type="button" onclick ="location.href='#'">이익순위</button>
		<button type="button" onclick ="location.href='#'">그룹별제고수량</button>
		
	</fieldset>
</body>
</html>