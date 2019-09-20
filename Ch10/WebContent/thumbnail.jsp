
<%@page import="javax.imageio.ImageIO"%>
<%@page import="java.io.File"%>
<%@page import="java.awt.Graphics2D"%>
<%@page import="java.awt.image.BufferedImage"%>
<%@page import="javax.media.jai.JAI"%>
<%@page import="javax.media.jai.RenderableOp"%>
<%@page import="java.awt.image.renderable.ParameterBlock"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	ServletContext context = request.getServletContext();
	String imagePath = context.getRealPath("/image");  // 실제 서버의 폴더 위치
	int size = 1024*1024*1;  // 10메가(기본값 byte) 1kb*1kb*10

	MultipartRequest multi = new MultipartRequest(request, imagePath, size, "UTF-8", new DefaultFileRenamePolicy()); 
	// 클래스이름  객체이름 = new 생성자이름(request정보, 파일 경로, 사이즈, 인코딩 방식, 파일 이름 중복 시 처리 정책  )
	
	String filename = multi.getFilesystemName("filename");  // 실제 서버에 저장 된 파일 이름
	String origfilename = multi.getOriginalFileName("filename");  // 올린 파일 이름
	
	ParameterBlock pb = new ParameterBlock();
	pb.add(imagePath + "/" + filename);
	RenderableOp rOp = JAI.create("fileload", pb);
	
	BufferedImage bi = rOp.getAsBufferedImage(); 
	BufferedImage thumb = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
	Graphics2D g=thumb.createGraphics();
	File file = new File(imagePath+"/sm_"+filename);
	ImageIO.write(thumb, "jpg", file);
	
	
%>    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	- 원본 이미지 - <br>
	<img src="image/<%=filename %>"><p>
	
	- 썸네일 이미지 - <br>
	<img src="image/sm_<%=filename %>"><p>

</body>
</html>