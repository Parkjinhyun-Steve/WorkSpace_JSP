

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model1_model2.Add;

/**
 * Servlet implementation class SumServlet
 */
@WebServlet("/sum")
public class SumServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SumServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 비즈니스 로직(model-pojo)
		Add add = new Add();
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		int sum = add.run(num1, num2);
		
		// 디스패치
		RequestDispatcher dispatcher = request.getRequestDispatcher("model2_2.jsp");
		request.setAttribute("sum", sum);
		dispatcher.forward(request, response);
		
	}

}
