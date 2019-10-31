package action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import svc.FindDBService;
import vo.ActionForward;
import vo.BoardBean;

public class FindDBAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ActionForward forward = new ActionForward();
		FindDBService fds = new FindDBService();
		BoardBean dataList = fds.getDB(request.getParameter("code"));
		request.setAttribute("dataList", dataList);
		forward.setPath("findProduct.jsp");
		forward.setRedirect(false);
		return forward;
		
	}

}
