package controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import action.Action;
import dao.DAOBase;
import vo.ActionForward;

@WebServlet("*.do")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Servlet() {
        super();    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);	}
		
	
	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		
		request.setCharacterEncoding("UTF-8");
				
		String requestURI = request.getRequestURI();
		System.out.println(requestURI);
		String contextPath = request.getContextPath();
		System.out.println(contextPath);
		String command = requestURI.substring(contextPath.length());
		System.out.println("command -> " + command);		
		ActionForward forward = new ActionForward();
		
		
		// 1. 로그인
		if(command.equals("/Login.do")) {
			System.out.println("로그인.do!");
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			
			DAOBase daob = new DAOBase();
			Connection conn = daob.getConnection();
			daob.setConnection(conn);
			boolean bl = daob.searchDB(id, pw);
			System.out.println("bl -> " + bl);
			
			if(bl){			
				HttpSession session = request.getSession();
				session.setAttribute("id", id);
			}
			
			forward.setPath("Login02.jsp");
			forward.setRedirect(true);
			
		// 11. 에러 
		}else {
				forward.setPath("error.jsp");
				forward.setRedirect(true);	
		}
		
		System.out.println(forward.getPath());
		System.out.println(forward.isRedirect());		
				
		// common forwarding
		if(forward.isRedirect()) {
			response.sendRedirect(forward.getPath());
			
		}else {
			RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
			dispatcher.forward(request, response);			
		}
		
	}
	
}
