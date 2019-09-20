<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%  String sum_str=" ";
    String num1=" "; 
    String num2=" ";
	
    if(request.getParameter("num1")!=null){
		num1=request.getParameter("num1");
		num2=request.getParameter("num2");
		
		int sum=Integer.parseInt(request.getParameter("num1"))+Integer.parseInt(request.getParameter("num2"));
		
		sum_str=Integer.toString(sum);
    }
		
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<jsp:include page="top.jsp"/>
	
		<form action="add.jsp">
			<input type="text" name="num1" value=<%=num1%>> + <input type="text" name="num2" value=<%=num2%>> =<input type="text" value=<%=sum_str%>>
			<input type="submit" value="계산">
		</form>
		
</body>
</html>