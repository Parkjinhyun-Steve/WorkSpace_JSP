package svc;

import java.sql.Connection;
import java.sql.PreparedStatement;

import boarddao.BoardDAO;
import db.JDBCUtil;

public class DeleteDBService {

	public void DeleteDB(String code) {
		Connection con = JDBCUtil.getConnection();
		BoardDAO boardDAO = BoardDAO.getInstance();
		boardDAO.setConnection(con);
		boardDAO.DeleteDB(code);
	
		JDBCUtil.close(con);
	}

}
