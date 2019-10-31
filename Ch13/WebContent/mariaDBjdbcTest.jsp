<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
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
	String connet="성공";
	String sql="INSERT INTO member (id, name) VALUES('hhccc', '홍길동');";
	Statement stmt=null;	

	try{
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection(
				"jdbc:mariadb://192.168.0.176:3307/testDB",
				"java","java");
		stmt = conn.createStatement();
		stmt.executeUpdate(sql);
		conn.close();
		
	}catch(Exception e){
		connet="실패";
		e.printStackTrace();
	}	
%>
<%=connet %>

</body>
</html>