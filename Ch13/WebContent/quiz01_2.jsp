<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<%
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	int sum = num1 + num2;
%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>결과는 <%=sum %></h1>
	
	<%
	String str="성공";
	Connection conn = null;
	String sql="INSERT INTO number (num1, num2) VALUES (?, ?);";
	PreparedStatement pstmt = null;
		
	try{
		Context init = new InitialContext();
   		DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/aaa");
   		conn = ds.getConnection();
		pstmt = conn.prepareStatement(sql);
   				
   		pstmt.setInt(1,num1);
   		pstmt.setInt(2,num2);
 		   		
 		if(pstmt.executeUpdate() !=0 ) {
   			System.out.println("등록성공(console)");
   		}
   		   		
	}catch(Exception e) {
   		str="실패";
   		e.printStackTrace();
   		
	}finally { // try catch 상관없이 실행
		pstmt.close();  
		conn.close();
	}
	
%>

<%=str %>

	
</body>
</html>