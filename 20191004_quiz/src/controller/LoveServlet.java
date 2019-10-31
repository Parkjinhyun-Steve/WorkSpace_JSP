package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/love.do")
public class LoveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Love love = new Love();
		int plove = love.love();
						
		// ����  // �ٷ� Ŭ������ ���� ó���� ����		
		// ������ ���
		RequestDispatcher dispatcher = request.getRequestDispatcher("Com02.jsp");
		request.setAttribute("love", plove);		
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
}

	
	