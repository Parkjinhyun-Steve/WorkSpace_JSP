<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
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
	String str="성공";
	Connection conn = null;
	String sql="INSERT INTO member (id, password, name, age, gender, email) VALUES (?, ?, ?, ?, ?, ?);";
	PreparedStatement pstmt = null;
		
	try{
		Context init = new InitialContext();
   		DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/aaa");
   		conn = ds.getConnection();
		pstmt = conn.prepareStatement(sql);
   				
   		pstmt.setString(1,"IU");
   		pstmt.setString(2,"1234");
   		pstmt.setString(3,"이지금");
   		pstmt.setString(4,"27");
   		pstmt.setString(5,"female");
   		pstmt.setString(6,"iuena@gmail.com");
 		   		
 		if(pstmt.executeUpdate() !=0 ) {
   			System.out.println("등록성공");
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