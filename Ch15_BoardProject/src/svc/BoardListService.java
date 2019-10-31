package svc;

import java.sql.Connection;
import java.util.ArrayList;

import dao.BoardDAO;
import db.JDBCUtil;
import vo.BoardBean;

public class BoardListService {
	public ArrayList<BoardBean> getArticleList(int page, int limit) {
		Connection con = JDBCUtil.getConnection();
		BoardDAO boardDAO = BoardDAO.getInstance();
		boardDAO.setConnetion(con);
		ArrayList<BoardBean> articleList = null;
		articleList = boardDAO.selectArticleList(page, limit);
		
		JDBCUtil.close(con);		
		
		return articleList;
		
	}

}
