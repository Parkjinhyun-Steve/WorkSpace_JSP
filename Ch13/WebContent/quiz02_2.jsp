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
	int result = Integer.parseInt(request.getParameter("result"));
	int sum = num1 + num2;
%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	String str="전송성공";
	Connection conn = null;
	String sql="INSERT INTO number (num1, num2, result) VALUES (?, ?, ?);";
	PreparedStatement pstmt = null;
	int a = 0;
		
	%>
			
	<%if (result == sum) {%>		
		정답입니다. <br>
		<%=result %> = <%=sum %> <br>
	<% a = 1;		
		}else { %>
		오답입니다. <br>
		<%=result %> != <%=sum %> <br>
	<% a = 0;} %>
		
	<%
	try{
		Context init = new InitialContext();
   		DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/aaa");
   		conn = ds.getConnection();
		pstmt = conn.prepareStatement(sql);
   				
   		pstmt.setInt(1,num1);
   		pstmt.setInt(2,num2);
   		pstmt.setInt(3,a);
 		   		
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


	<form action = "quiz02_3.jsp" >
		<input type="submit" value="오답문제확인">
	
	</form>
	
</body>
</html>