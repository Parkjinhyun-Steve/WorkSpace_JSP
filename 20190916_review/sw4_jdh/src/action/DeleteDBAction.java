package action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import svc.DeleteDBService;
import vo.ActionForward;
import vo.BoardBean;

public class DeleteDBAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			ActionForward forward = new ActionForward();
			DeleteDBService dds = new DeleteDBService();
			dds.DeleteDB(request.getParameter("code"));
			
			forward.setPath("findProduct.jsp");
			forward.setRedirect(false);
			
		return forward;
	}

}
