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
		int check=0; //0: �α��� ����, -1:�α��� ���� 
		//DB ������ Ȯ��
		//1.Ŀ�ؼ�Ǯ db����
		Connection con=null;
		try{
			Context init= new InitialContext();
			DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/aaa");
			con=ds.getConnection();
		}catch (Exception e) {
			e.printStackTrace();
		} 
		//2.���� Ȯ��
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			pstmt=con.prepareStatement("select * from member where id=?,pw=?;"); //�����ۼ�
			pstmt.setString(1, id); //�����ϼ�
			pstmt.setString(2, pw);
			rs=pstmt.executeQuery(); //db��ȸ �� ����ޱ�
			if(rs.next()) {	//id pw ������ �ִٸ� �ϳ��� �ֱ⶧���� rx.next()�� true�� �ƴϸ� false
				HttpSession session=request.getSession();
				session.setAttribute("id", id);
			}else {
				check=-1;	//�α��� ����
			}
		}catch(Exception ex) {
			System.out.println("db ���ٿ���:"+ex);
		}finally {
			try {rs.close();} catch (SQLException e) {}
			try {pstmt.close();} catch (SQLException e) {}
			try {con.close();} catch (SQLException e) {}
		}
		
		return check;
		
	}
}
