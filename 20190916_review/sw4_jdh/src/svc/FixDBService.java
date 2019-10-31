package svc;

import java.sql.Connection;

import boarddao.BoardDAO;
import db.JDBCUtil;
import vo.BoardBean;

public class FixDBService {
	
	public void FixDB(BoardBean boardBean) {
		Connection con = JDBCUtil.getConnection();
		BoardDAO boardDAO = BoardDAO.getInstance();
		boardDAO.setConnection(con);
		boardDAO.FixDB(boardBean);
		JDBCUtil.close(con);
	}
}
