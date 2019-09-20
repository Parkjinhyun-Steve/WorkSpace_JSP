<%@page import="java.net.URLEncoder"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.*" %>
<%@page import="java.io.File" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String fileName = request.getParameter("file_name"); // 다운로드 할 파일 이름
	ServletContext context = getServletContext();
	String sDownLoad=context.getRealPath("upload");  // 다운로드할 파일이 저장된 폴더
	String sFilePath=sDownLoad+"\\+"+fileName;  // 전체경로
	
	FileInputStream in = new FileInputStream(sFilePath);
	String sMimeType=getServletContext().getMimeType(sFilePath);
	
	System.out.println("마임타입:" + sMimeType);
	if(sMimeType==null){
		sMimeType="application/octet-stream";
	}
			
	response.setContentType(sMimeType);
	String agent = request.getHeader("User-Agent");
	boolean ieBrowser = (agent.indexOf("MSIE") > -1) || (agent.indexOf("Trident") > -1);
	
	if (ieBrowser) {
		fileName = URLEncoder.encode(fileName, "UTF-8").
				replaceAll("\\+", "%20");
	} else {
		fileName = new String(fileName.getBytes("UTF-8"), "iso-8859-1");
	}
		
		
	response.setContentType(sMimeType);
	response.setHeader("Content-Disposition", "attachment; filename=" + fileName);
	ServletOutputStream out2 = response.getOutputStream();
	
	byte b[] = new byte[4096]; //4k
	int numRead;
	
	while((numRead=in.read(b,0,b.length))!=-1) {
		out2.write(b, 0, numRead);
	}
	out2.flush();
	out2.close();
	in.close();
	
		
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>