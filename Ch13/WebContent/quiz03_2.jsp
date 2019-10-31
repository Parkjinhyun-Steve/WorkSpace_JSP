<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%

	String id = request.getParameter("id");
	String pw = request.getParameter("pw");

	String str = "db접속성공!"; %><br> <%
	Connection conn = null;
	String sql = "SELECT * FROM db WHERE id= ? ;";
	PreparedStatement pstmt = null;  // 쿼리를 날리기 위한 객체 
	
	ResultSet rs = null;
	boolean login = false; 
		
	try{
		Context init = new InitialContext();
   		DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/aaa");
   		conn = ds.getConnection();
		
   		pstmt = conn.prepareStatement(sql);   		
   		pstmt.setString(1, id);
   		
		rs = pstmt.executeQuery();  // 실행 : 자료를 받아올수 있는 메소드
		
		if(rs.next()){
			if(rs.getString("pw").equals(pw))				
				login=true;				
		}else {
			login=false;
		}
					
	}catch(Exception e) {
   		str="실패!";
   		e.printStackTrace();
   		
	}finally { // try catch 상관없이 실행
		rs.close();
		pstmt.close();  
		conn.close();
	}
%>

<%=str %> <br>
   
        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% if (login) {%>

	<%=id %>님 로그인 성공!
	
	<%}else { %>
	로그인 실패!<br>
	id 또는 pw를 확인해주세요.
	
	<%} %>	

</body>
</html>