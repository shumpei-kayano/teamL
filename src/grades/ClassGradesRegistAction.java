package grades;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tool.Action;

public class ClassGradesRegistAction extends Action {
	public String execute(
		HttpServletRequest request, HttpServletResponse response
	) throws Exception {
		// 入力値を受け取る
		String ent_year = request.getParameter("ent_year");
		String month = request.getParameter("month");
		String classNum = request.getParameter("classNum");

		// 入力値をチェック
		if (ent_year == null || ent_year.length() == 0
			|| month == null || month.length() == 0
			|| classNum == null || classNum.length() == 0
		) {
			request.setAttribute("message", "入力エラーです");
			return "selectClass.jsp";
		}
		// 入力値をjspに渡す
		request.setAttribute("ent_year", ent_year);
		request.setAttribute("month", month);
		request.setAttribute("classNum", classNum);

		return "classGradesRegist.jsp";
	}
}
