package svc;

import static db.JDBCUtil.rollback;

import java.sql.*;
import db.JDBCUtil;
import vo.BoardBean;
import boarddao.BoardDAO;

public class InsertDBService {
	
	public void registDB(BoardBean boardBean) {
	
		Connection con = JDBCUtil.getConnection();
		BoardDAO boardDAO = BoardDAO.getInstance();
		boardDAO.setConnection(con);
		
		boardDAO.insertDB(boardBean);
		JDBCUtil.close(con);
	}
	

}
