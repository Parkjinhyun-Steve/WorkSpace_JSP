

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/calc")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		
		int num3 = Integer.parseInt(num1);
		int num4 = Integer.parseInt(num2);
		
		PrintWriter out = response.getWriter();		
		out.println(num3 + "+" + num4 + "=" + (num3 + num4));
		out.println(num3 + "-" + num4 + "=" + (num3 - num4));
		out.println(num3 + "*" + num4 + "=" + (num3 * num4));
		out.println(num3 + "/" + num4 + "=" + (num3 / num4));
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
