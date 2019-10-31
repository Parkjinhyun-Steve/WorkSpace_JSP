package model2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

public class Model {
	
	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	Model() {
		Context init;
		try {
			init = new InitialContext();
			DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/aaa");
			con=ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	void update(HttpServletRequest request) throws Exception{
		request.setCharacterEncoding("UTF-8");
		pstmt=con.prepareStatement("INSERT INTO `testdb`.`hello` (`name`, `text`) VALUES (?,?);"); //�����ۼ�
		pstmt.setString(1, request.getParameter("id")); 
		pstmt.setString(2, request.getParameter("text")); //�����ϼ�
		pstmt.executeUpdate(); //db������Ʈ
	}

	ArrayList<Vo> load() throws Exception{
		ArrayList<Vo> arrayVo = new ArrayList<Vo>();
		pstmt=con.prepareStatement("SELECT * FROM `testdb`.`hello` ORDER BY NO ASC;"); //�����ۼ�
		rs=pstmt.executeQuery(); //db������Ʈ	
		while(rs.next()) {
			Vo vo = new Vo();
			vo.setId(rs.getString("name"));
			vo.setText(rs.getString("text"));
			arrayVo.add(vo);
		}
		return arrayVo;
	}
	void close() throws Exception{
		if(rs==null) rs.close(); 
		if(pstmt==null) rs.close();
		if(con==null) rs.close();
	}
	
}
