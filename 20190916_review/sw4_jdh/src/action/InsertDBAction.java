package action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import svc.InsertDBService;
import vo.ActionForward;
import vo.BoardBean;

public class InsertDBAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ActionForward forward = new ActionForward();
		InsertDBService ids = new InsertDBService();
		
		String code = request.getParameter("code");
		String pname = request.getParameter("pname");
		int cost = Integer.parseInt(request.getParameter("cost"));
		int pnum = Integer.parseInt(request.getParameter("pnum"));
		int jnum = Integer.parseInt(request.getParameter("jnum"));
		int sale = Integer.parseInt(request.getParameter("sale"));
		String gcode = request.getParameter("gcode");
		
		BoardBean boardBean = new BoardBean();
		boardBean.setCode(code);
		boardBean.setPname(pname);
		boardBean.setCost(cost);
		boardBean.setPnum(pnum);
		boardBean.setJnum(jnum);
		boardBean.setSale(sale);
		boardBean.setGcode(gcode);
		
		ids.registDB(boardBean);
		forward.setPath("main.jsp");
		forward.setRedirect(false);
		
		return forward;
		
		
		
	}

}
