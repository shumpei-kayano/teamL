package leading;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tool.Action;

public class ShowLeadingListAction extends Action {
	public String execute(
			HttpServletRequest request, HttpServletResponse response
		) throws Exception {


			return "selectClass.jsp";
		}
}
