package dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import db.JDBCUtil;

public class DAOBase implements DAO {	
	public Connection getConnection() {		
               String jdbc_driver = "org.mariadb.jdbc.Driver";
               String db_url = "jdbc:mariadb://192.168.0.176:3307/testDB";
               try{
			Class.forName(jdbc_driver);
			Connection conn = DriverManager.getConnection(db_url, "java", "java");
			return conn;
               } catch(Exception e) {
                    e.printStackTrace();
               }
                return null;		
	}
	public void closeDBResources(ResultSet rs, Statement stmt, Connection conn) {
		if(rs != null) {
			try {
				rs.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		if(stmt != null) {
			try {
				stmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		if(conn != null) {
			try {
				conn.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	Connection con = null;
	
	private static DAOBase daobase = null;
	
	public static DAOBase getInstance() {
		if(daobase == null) {
			daobase = new DAOBase();
		}
		return daobase;
	}
	public void setConnection(Connection con) {
		this.con = con;
	}
	
	
	// DB
	public boolean searchDB(String id, String pw) {
		
		boolean bl = true; 
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = con.prepareStatement("SELECT * FROM login WHERE id = ? AND pw = ?");
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			
			if(!rs.next())				
				bl = false;
			
			System.out.println("성공" );
		}catch(Exception e){
			System.out.println("에러" + e);
		}finally {
			JDBCUtil.close(rs);
			JDBCUtil.close(pstmt);
		}
		return bl;
	}
	
}