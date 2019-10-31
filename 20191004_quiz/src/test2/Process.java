package test2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pro.do")
public class Process extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
    public Process() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		
		request.setCharacterEncoding("UTF-8");
		
		String id = (String)request.getParameter("id");
		String pw = (String)request.getParameter("pw");
		
		System.out.println("ID : " + id);
		System.out.println("PW : " + pw);
		
		
		// ������ ���   1.�����̷�Ʈ ���  2.������ ���
		
		// 1. �����̷�Ʈ ���
		// response.sendRedirect("hello.jsp");
		
		// 2. ������ ���
		RequestDispatcher rd = request.getRequestDispatcher("hello2.jsp");
		request.setAttribute("id", id);
		request.setAttribute("pw", pw);
		rd.forward(request, response);
		
		
	}

}
