package action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import svc.FindDBService;
import svc.FixDBService;
import vo.ActionForward;
import vo.BoardBean;

public class FixDBAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ActionForward forward = new ActionForward();
		FixDBService fds = new FixDBService();
		
		String code = request.getParameter("code");
		String pname = request.getParameter("pname");
		int cost = Integer.parseInt(request.getParameter("cost"));
		int pnum = Integer.parseInt(request.getParameter("pnum"));
		int jnum = Integer.parseInt(request.getParameter("jnum"));
		int sale = Integer.parseInt(request.getParameter("sale"));
		String gcode = request.getParameter("gcode");
		
		BoardBean dataList = new BoardBean();
		dataList.setCode(code);
		dataList.setPname(pname);
		dataList.setCost(cost);
		dataList.setPnum(pnum);
		dataList.setJnum(jnum);
		dataList.setSale(sale);
		dataList.setGcode(gcode);
		
		fds.FixDB(dataList);
		forward.setPath("findProduct.jsp");
		forward.setRedirect(false);
		return forward;
	}

}
