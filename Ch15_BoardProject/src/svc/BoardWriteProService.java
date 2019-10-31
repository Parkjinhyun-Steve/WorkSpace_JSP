package svc;

import java.sql.Connection;

import dao.BoardDAO;
import db.JDBCUtil;
import vo.BoardBean;

public class BoardWriteProService {
	
	public boolean registArticle(BoardBean boardbean) {

		// 1. bring the last board number
		Connection con = JDBCUtil.getConnection();  // create the DB connection information object
		BoardDAO boardDAO = BoardDAO.getInstance();  // create the BoardDAO object 
		boardDAO.setConnetion(con);  // send the DB connection information object
		int lastboardnumber = boardDAO.lastBoardNumber();
		boolean isWriteSuccess = false;
		
		// 2. write the last board number + 1
		boardbean.setBoard_num(lastboardnumber + 1);
		int insertCount = boardDAO.insertArticle(boardbean);
		if(insertCount > 0) {
			JDBCUtil.commit(con);
			isWriteSuccess = true;
		}else {
			JDBCUtil.roolback(con);		
		}
		JDBCUtil.close(con);
		return isWriteSuccess;
		
		
	}
	

}
