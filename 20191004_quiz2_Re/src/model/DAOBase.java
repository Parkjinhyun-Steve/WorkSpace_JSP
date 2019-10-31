package model;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class DAOBase implements DAO {	
	public Connection getConnection() throws SQLException{		
               String jdbc_driver = "org.mariadb.jdbc.Driver";
               String db_url = "jdbc:mariadb://192.168.0.176:3307/testDB";
               try{
			Class.forName(jdbc_driver);
			Connection conn = DriverManager.getConnection(db_url, "system", "hrdkorea");
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
}