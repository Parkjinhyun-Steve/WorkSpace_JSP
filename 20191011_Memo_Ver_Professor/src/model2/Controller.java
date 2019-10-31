package model2;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 읽기
		ArrayList<Vo> vo = new ArrayList<Vo>();
		try {
			Model model = new Model();
			vo = model.load();
			model.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("읽어온값:"+vo.get(1).getId());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		request.setAttribute("vo", vo);
		dispatcher.forward(request, response);	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 2. 쓰기
		ArrayList<Vo> vo = new ArrayList<Vo>();
		try {
			Model model = new Model();
			model.update(request);
			vo = model.load();
			model.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		request.setAttribute("vo", vo);
		dispatcher.forward(request, response);
		
	}

}
