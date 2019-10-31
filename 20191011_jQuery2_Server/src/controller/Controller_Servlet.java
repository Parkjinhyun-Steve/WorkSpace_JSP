package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Bean;
import model.Model;


@WebServlet("*.do")
public class Controller_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Controller_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	    	
    	// 1. 읽기
    	ArrayList<Bean> bean = new ArrayList<Bean>();		
		try {
			Model model = new Model();
			model.model();
			bean = model.load();
			model.close();
		} catch (Exception e) {
			e.printStackTrace();			
		}
		System.out.println(bean.get(1).getId());
		
		RequestDispatcher dispatcher =  request.getRequestDispatcher("index.jsp");
		request.setAttribute("bean", bean);
		dispatcher.forward(request, response);
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 2.쓰기
		ArrayList<Bean> bean = new ArrayList<Bean>();		
		try {
			Model model = new Model();
			model.model();
			model.update(request);
			bean = model.load();
			model.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dispatcher =  request.getRequestDispatcher("index.jsp");
		request.setAttribute("bean", bean);
		dispatcher.forward(request, response);
		
	}
}







