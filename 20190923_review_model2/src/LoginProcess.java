

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;


public class LoginProcess {
	public boolean check(HttpServletRequest aaa) {
		String id = aaa.getParameter("id");
		String pw = aaa.getParameter("pw");
		boolean check = false;
		
		String str = "db접속성공!"; 
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
			try {
				rs.close();
				pstmt.close();  
				conn.close();
			}catch (SQLException e) {
				str="실패!";
		   		e.printStackTrace();				
			}			
		}
		System.out.println(login);
		return login;		
	}
}
