package db;


import java.sql.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class JDBCUtil {
	
	public static Connection getConnection() {
		
		Connection con = null;
		
		try {
			Context init = new InitialContext();
			DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/aaa");
			con = ds.getConnection();
			con.setAutoCommit(false);			
		}catch (Exception e) {
			e.printStackTrace();			
		}
		return con;
			
	}
	public static void close(Connection con) {
		try {
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}			
	}
	
	public static void close(Statement stmt) {
		try {
			stmt.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet rs) {
		try {
			rs.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
		
		
	public static void commit(Connection con) {
		try {
			con.commit();
			System.out.println("Commit success!!");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void roolback(Connection con) {
		try {
			con.rollback();
			System.out.println("Roolback success!!");
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
		
