package test;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDAO;
import db.JDBCUtil;
import svc.BoardDeleteService;
import vo.BoardBean;

@WebServlet("/TestDB")
public class TestDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public TestDB() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*** test for the service 
		
		BoardDetailService bdstest = new BoardDetailService();
		BoardBean article = bdstest.getArticle(1);
		System.out.println(article.getBoard_content()); ***/
		
				
		/*** test for delete 
		
		BoardDAO boarddao = BoardDAO.getInstance();  // Create boarddao object
		Connection con = JDBCUtil.getConnection(); 
		boarddao.setConnetion(con);
		boarddao.deleteArticle(2);
		DBCUtil.commit(con);
		JDBCUtil.close(con);	***/  
		
		
		/*** test for modify 
		
		BoardDAO boarddao = BoardDAO.getInstance();  // Create boarddao object
		Connection con = JDBCUtil.getConnection(); 
		boarddao.setConnetion(con);
		
		BoardBean article = new BoardBean();
		article.setBoard_num(1);
		article.setBoard_subject("수정제목-아이유");
		article.setBoard_content("수정내용-아이유");				
		boarddao.modifyArticle(article);
		JDBCUtil.commit(con);
		JDBCUtil.close(con); ***/
		
		/*** test for delete ***/
		
		BoardDeleteService bds = new BoardDeleteService();
		bds.deleteArticle(3);
				

		
	}

}
