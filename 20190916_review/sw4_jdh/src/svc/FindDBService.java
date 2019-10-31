package svc;

import java.sql.Connection;
import java.util.ArrayList;

import boarddao.BoardDAO;
import db.JDBCUtil;
import vo.BoardBean;

public class FindDBService {
	
	public BoardBean getDB(String code) {
		Connection con = JDBCUtil.getConnection();
		BoardDAO boardDAO = BoardDAO.getInstance();
		boardDAO.setConnection(con);
		BoardBean data = boardDAO.FindDB(code);
		JDBCUtil.close(con);
		return data;
	}
}
	


