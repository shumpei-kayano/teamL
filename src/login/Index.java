package login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// このURLパターンはhttp://localhost:8080/teamLで実行される
@WebServlet(urlPatterns={"/"})
public class Index extends HttpServlet {
	public void doGet (
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {

			// index.jspへフォワード
			request.getRequestDispatcher("/login/index.jsp")
				.forward(request, response);
	}
}
