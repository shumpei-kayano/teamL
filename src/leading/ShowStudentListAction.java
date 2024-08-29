package leading;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tool.Action;

public class ShowStudentListAction extends Action {
	public String execute(
			HttpServletRequest request, HttpServletResponse response
		) throws Exception {

		String className =request.getParameter("className");
		System.out.println(className);
		request.setAttribute("className", className);

			return "showStudentList.jsp";
		}
}
