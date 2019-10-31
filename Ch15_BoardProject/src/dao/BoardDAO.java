package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import db.JDBCUtil;
import vo.BoardBean;  // import the other package

public class BoardDAO {
	
	Connection con = null; // connect DB
	
	// ***** Singleton pattern ***** //
	private static BoardDAO boarddao = null;
	
	// constructor assess prohibition
	private BoardDAO() {}	
	
	// method for creating object
	public static BoardDAO getInstance() {
		if(boarddao == null) {
			boarddao = new BoardDAO();
		}
		return boarddao;
	}		
	
	//0. connect DB
	public void setConnetion(Connection con) {
		this.con = con;		
	}
	
	
	//1. view the Article
	public BoardBean selectArticle(int board_num) { //public -> to use other package
		
		PreparedStatement pstmt = null; // create the PreparedStatement class
		ResultSet rs = null;
		BoardBean boardBean = null;		
		try {
			pstmt = con.prepareStatement("SELECT board_subject, board_file, board_content FROM board WHERE board_num=?;"); // write the query
			pstmt.setInt(1, board_num);  // complete the query
			rs = pstmt.executeQuery(); // bring the result after executing the query 
			if(rs.next()) {
				boardBean = new BoardBean();
				boardBean.setBoard_subject(rs.getString("board_subject")); 
				boardBean.setBoard_file(rs.getString("board_file"));
				boardBean.setBoard_content(rs.getString("board_content"));
			}		
		} catch (Exception ex) {
			System.out.println("Error! : 1. View the detailed contents -> " + ex);			
		} finally {			
			JDBCUtil.close(rs);
			JDBCUtil.close(pstmt);			
		}	
		return boardBean;
	}
	

	//2. confirm the last Board number
	public int lastBoardNumber() { //public -> to use other package
		
		PreparedStatement pstmt = null; // create the PreparedStatement class
		ResultSet rs = null;
		int lastBoardNumber = 0;						
		try {
			pstmt = con.prepareStatement("SELECT max(board_num) FROM board;"); // write the query
			rs = pstmt.executeQuery(); // bring the result after executing the query   
			if(rs.next()) {
				lastBoardNumber = rs.getInt(1);
			}		
		} catch (Exception ex) {
			System.out.println("Error! : 2. Confirm the last contents number -> " + ex);			
		} finally {			
			JDBCUtil.close(rs);
			JDBCUtil.close(pstmt);			
		}	
		return lastBoardNumber;
	}
	

	// 3. update the read count
	public int updateReadCount(int board_num) {
		
		PreparedStatement pstmt = null; // create the PreparedStatement class
		int updateCount = 0;						
		try {
			pstmt = con.prepareStatement("UPDATE board SET board_readcount=board_readcount+1 WHERE board_num=?;"); // write the query
			pstmt.setInt(1, board_num);  // complete the query
			updateCount = pstmt.executeUpdate() ; // bring the result after executing the query			
			System.out.println(updateCount);		
		} catch (Exception ex) {
			System.out.println("Error! : 3. Update the read count -> " + ex);			
		} finally {			
			JDBCUtil.close(pstmt);
		}
		return updateCount;				
	}
	

	// 4. Confirm the total contents count	
	public int selectListCount() {
		
		PreparedStatement pstmt = null; // create the PreparedStatement class
		ResultSet rs = null;
		int ListCount = 0;						
		try {
			pstmt = con.prepareStatement("SELECT COUNT(*) FROM board;"); // write the query
			rs = pstmt.executeQuery(); // bring the result after executing the query   
			if(rs.next()) {
				ListCount = rs.getInt(1);
			}		
		} catch (Exception ex) {
			System.out.println("Error! : 4. Confirm the total contents count -> " + ex);			
		} finally {			
			JDBCUtil.close(rs);
			JDBCUtil.close(pstmt);
		}	
		return ListCount;	
	}
	
	
	//5. Register the article
	public int insertArticle(BoardBean article) {
		
		PreparedStatement pstmt = null; // create the PreparedStatement class
		int insertArticle = 0;								
		try {
			pstmt = con.prepareStatement("INSERT INTO board VALUES (?, ?, ?, ?, ?, ?, 0, NOW(), ?, 0, 0);"); // write the query
			pstmt.setInt(1, article.getBoard_num());  // complete the query
			pstmt.setString(2, article.getBoard_name());  
			pstmt.setString(3, article.getBoard_pass());  
			pstmt.setString(4, article.getBoard_content());
			pstmt.setString(5, article.getBoard_file()); 
			pstmt.setString(6, article.getBoard_subject());
			pstmt.setInt(7, article.getBoard_num());			
			insertArticle = pstmt.executeUpdate(); // execute the insertArticle
			System.out.println(insertArticle); 		
		} catch (Exception ex) {
			System.out.println("Error! : 5. Register the article -> " + ex);			
		} finally {			
			JDBCUtil.close(pstmt);
		}	
		return insertArticle;		
	}
	
	//6. Delete Article
	public int deleteArticle(int board_num) {
		
		PreparedStatement pstmt = null; // create the PreparedStatement class
		int count = 0;								
		try {
			pstmt = con.prepareStatement("DELETE FROM board WHERE board_num=?;"); // write the query
			pstmt.setInt(1, board_num);  // complete the query
												
			count = pstmt.executeUpdate(); // execute the insertArticle
			System.out.println(count);
			
		} catch (Exception ex) {
			System.out.println("Error! : 6. Delete the article -> " + ex);			
		} finally {			
			JDBCUtil.close(pstmt);
		}	
		return count;		
	}
	
	//7. Modify Article
	public int modifyArticle(BoardBean article) {
		
		PreparedStatement pstmt = null; // create the PreparedStatement class
		int modifyArticle = 0;								
		try {
			pstmt = con.prepareStatement("UPDATE board SET board_subject=?, board_content=? WHERE board_num=?;"); // write the query
									
			pstmt.setString(1, article.getBoard_subject());
			pstmt.setString(2, article.getBoard_content());
			pstmt.setInt(3, article.getBoard_num()); // complete the query						
			modifyArticle = pstmt.executeUpdate(); // execute the insertArticle
			System.out.println(modifyArticle);
			
		} catch (Exception ex) {
			System.out.println("Error! : 7. Modify article -> " + ex);			
		} finally {			
			JDBCUtil.close(pstmt);
		}	
		return modifyArticle;		
	}
	
	//8. Array List
	public ArrayList<BoardBean> selectArticleList(int page, int limit) {
		
		PreparedStatement pstmt = null; // create the PreparedStatement class
		ResultSet rs = null;
		BoardBean boardBean = null;
		ArrayList<BoardBean> articleList = new ArrayList<BoardBean>();
		
		try {
			pstmt = con.prepareStatement("SELECT * FROM board ORDER BY re_ref DESC, re_step LIMIT ?, ?;"); // write the query			
			pstmt.setInt(1, (page-1) * limit); // row number
			pstmt.setInt(2, limit);
			rs = pstmt.executeQuery(); // execute the Query
			
			while(rs.next()) {
				boardBean = new BoardBean();
				boardBean.setBoard_num(rs.getInt("board_num"));				
				boardBean.setBoard_subject(rs.getString("board_subject"));
				boardBean.setBoard_name(rs.getString("board_name"));
				boardBean.setBoard_date(rs.getDate("board_date"));
				boardBean.setBoard_readcount(rs.getInt("board_readcount"));
				boardBean.setRe_lev(rs.getInt("re_lev"));
				articleList.add(boardBean);
			}
			
		} catch (Exception ex) {
			System.out.println("Error! : 8. ArrayList -> " + ex);			
		} finally {
			JDBCUtil.close(rs);
			JDBCUtil.close(pstmt);
		}	
		return articleList;		
	}
	
	
}
