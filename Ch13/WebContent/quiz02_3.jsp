<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
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
	String str = "성공";
	Connection conn = null;
	String sql = "SELECT * FROM number WHERE result=0;";
	PreparedStatement pstmt = null;
	ResultSet rs = null;
		
	try{
		Context init = new InitialContext();
   		DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/aaa");
   		conn = ds.getConnection();
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();  // 자료를 받아올수 있는 메소드
		
		while(rs.next()){
			System.out.println(rs.getString("num1"));
			System.out.println(rs.getString("num2"));			
		}
		rs.first();		
		
	}catch(Exception e) {
   		str="실패";
   		e.printStackTrace();
   		
	}finally { // try catch 상관없이 실행
		rs.close();
		pstmt.close();  
		conn.close();
	}
	
%>

<%=str %>

<%while(rs.next()){ %>
	<br>
	<%=rs.getString("num1") %> + <%=rs.getString("num2") %>		
<%} %>


</body>
</html>