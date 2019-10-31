package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

public class Member {
	public int memberCheck(HttpServletRequest request) {
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		int check=0; //0: 로그인 성공, -1:로그인 실패 
		//DB 접근후 확인
		//1.커넥션풀 db연결
		Connection con=null;
		try{
			Context init= new InitialContext();
			DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/aaa");
			con=ds.getConnection();
		}catch (Exception e) {
			e.printStackTrace();
		} 
		//2.쿼리 확인
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			pstmt=con.prepareStatement("select * from member where id=?,pw=?;"); //쿼리작성
			pstmt.setString(1, id); //쿼리완성
			pstmt.setString(2, pw);
			rs=pstmt.executeQuery(); //db조회 후 결과받기
			if(rs.next()) {	//id pw 정보가 있다면 하나가 있기때문에 rx.next()가 true고 아니면 false
				HttpSession session=request.getSession();
				session.setAttribute("id", id);
			}else {
				check=-1;	//로그인 실패
			}
		}catch(Exception ex) {
			System.out.println("db 접근에러:"+ex);
		}finally {
			try {rs.close();} catch (SQLException e) {}
			try {pstmt.close();} catch (SQLException e) {}
			try {con.close();} catch (SQLException e) {}
		}
		
		return check;
		
	}
}
