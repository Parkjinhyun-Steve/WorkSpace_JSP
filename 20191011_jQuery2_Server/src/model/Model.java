package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import bean.Bean;

public class Model {

	//1.Ŀ�ؼ�Ǯ DB ����		
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	
	public void model() {		
		try{
			Context init = new InitialContext();
			DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/aaa");
			con = ds.getConnection();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//2.���� ����
	public void update(HttpServletRequest request) throws Exception {	  //  ������!! �ȴ����� try ~ catch
		
		String name = request.getParameter("name");		// name �޾ƿ���		
		String text = request.getParameter("text"); 	// text �޾ƿ���
		
		pstmt = con.prepareStatement("INSERT INTO `testdb`.`hello` (`name`, `text`) VALUES (?,?);"); //�����ۼ� // ?���� '' ���� �ʴ´�.
		
		
		pstmt.setString(1, name); 
		pstmt.setString(2, text);
		System.out.println(pstmt.toString());
		pstmt.executeUpdate();
	}
		
	//3. �б� ����		
	public ArrayList<Bean> load() throws Exception {  //  ������!! �ȴ����� try ~ catch
		
		ArrayList<Bean> arrayBean = new ArrayList<Bean>();
		pstmt = con.prepareStatement("SELECT * FROM `hello` ORDER BY NO ASC"); //�����ۼ�			
		rs = pstmt.executeQuery();
		while(rs.next()) {
			Bean bean = new Bean();			
			bean.setNo(rs.getString("no"));
			bean.setId(rs.getString("name"));
			bean.setText(rs.getString("text"));
			arrayBean.add(bean);			
		}
		return arrayBean;
	}
		
	//4. �ݱ�
	public void close() throws Exception {  //  ������!! �ȴ����� try ~ catch
		if(rs  == null) rs.close();
		if(pstmt  == null) rs.close();
		if(con == null) rs.close();

	}
	
}
		

	

