package svc;

import java.sql.Connection;

import dao.BoardDAO;
import db.JDBCUtil;
import vo.BoardBean;

public class BoardDetailService {
	public BoardBean getArticle(int board_num) {
		
		// 1. update the read count
		Connection con = JDBCUtil.getConnection();  // create the DB connection information object
		BoardDAO boardDAO = BoardDAO.getInstance();  // create the BoardDAO object 
		boardDAO.setConnetion(con);  // send the DB connection information object
		int updateCount = boardDAO.updateReadCount(board_num);  //update the read count 
		
		if(updateCount > 0) {
			JDBCUtil.commit(con);  // transfer commit
		}else {
			JDBCUtil.roolback(con); // transfer roolback
		}
		
		// 2. bring the detailed contents
		BoardBean article = boardDAO.selectArticle(board_num);
		JDBCUtil.close(con);		
		return article;		
		
	}

}
