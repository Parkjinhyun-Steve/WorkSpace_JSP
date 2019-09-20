<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String uploadPath = request.getRealPath("/upload");  // 실제 서버의 폴더 위치
	int size = 1024*1024*10;  // 10메가(기본값 byte) 1kb*1kb*10
	
	MultipartRequest multi = new MultipartRequest(request, uploadPath, size, "UTF-8", new DefaultFileRenamePolicy()); 
	// 클래스이름  객체이름 = new 생성자이름(request정보, 파일 경로, 사이즈, 인코딩 방식, 파일 이름 중복 시 처리 정책  )
				
	String name = multi.getParameter("name");
	String subject = multi.getParameter("subject");
	
//	Enumeration files = multi.getFileNames();  // 입력상자의 파일이름 반환
//	String file1 = (String)files.nextElement();  // 첫번째 입력상자 파일이름	
	
	String filename1 = multi.getFilesystemName("filename1");  // 실제 서버에 저장 된 파일 이름
	String filename2 = multi.getFilesystemName("filename2");  // 실제 서버에 저장 된 파일 이름
	
	String origfilename1 = multi.getOriginalFileName("filename1");  // 올린 파일 이름
	String origfilename2 = multi.getOriginalFileName("filename2");  // 올린 파일 이름
	
	
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	업로드 패스 : <%=uploadPath %> <br>
	이름 : <%=name %> <br>
	첫번째 올린 파일이름 : <%=origfilename1 %> <br> 
	첫번째 저장된 파일이름 : <%=filename1 %> <br>
	두번째 올린 파일이름 : <%=origfilename2 %> <br>
	두번째 저장된 파일이름 : <%=filename2 %> <br>
	------------------------------------------ <br><br>

	다운로드<br>
	첫번째 파일<br>
	<a href=".\upload\<%=filename1 %>"> <%=origfilename1 %></a><br>
	두번째 파일<br>
	<a href=".\upload\<%=filename2 %>"> <%=origfilename2 %></a><br>
	
	<br> 무조건 다운로드 되게 만들자 <br>
			
	<a href="file_down.jsp?file_name=<%=filename1 %>">첫번째 파일</a><br>
	<a href="file_down.jsp?file_name=<%=filename2 %>">두번째 파일</a><br>
	 

</body>
</html>