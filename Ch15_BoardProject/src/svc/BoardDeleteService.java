package svc;

import java.sql.Connection;

import dao.BoardDAO;
import db.JDBCUtil;

public class BoardDeleteService {
	public boolean deleteArticle(int board_num) {
		
		BoardDAO boarddao = BoardDAO.getInstance();  // Create boarddao object
		Connection con = JDBCUtil.getConnection(); 
		boarddao.setConnetion(con);
		boarddao.deleteArticle(2);
		int count = boarddao.deleteArticle(1);
		
		boolean isWriteSuccess = false;
		
		if(count > 0) {
			JDBCUtil.commit(con);			
		}else {
			JDBCUtil.roolback(con);		
		}
		
		JDBCUtil.commit(con);
		JDBCUtil.close(con);;
		
		return isWriteSuccess;		
		
	}

}
