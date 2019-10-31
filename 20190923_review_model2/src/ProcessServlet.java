

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ProcessServlet
 */
@WebServlet("/process")
public class ProcessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 모델처리
		LoginProcess loginProcess = new LoginProcess();
		boolean check = loginProcess.check(request);  // 로그인 여부 확인
		
		// dispatcher
		RequestDispatcher dispatcher =  request.getRequestDispatcher("model2_2.jsp");

		request.setAttribute("check", check);		
		dispatcher.forward(request, response);
		
	}
}
