package in.cms.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionStateServlet
 */
@WebServlet("/sessionState")
public class SessionStateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		ArrayList<String> bag;
		HttpSession session = request.getSession();

		if (session.getAttribute("bag") != null)
			bag = (ArrayList<String>) session.getAttribute("bag");
		else
			bag = new ArrayList<>();

		out.println("<html><body>");
		out.println("<form>");
		out.println("<label><strong>Enter an item:</strong></label>");
		out.println("<input type='text' size=25 name='inm' />");
		out.println("<button>Add to Cart</button>");
		out.println("<hr />");

		out.println("<h3>Items In the Bag</h3>");
		String inm = request.getParameter("inm");

		if (inm != null) {
			bag.add(inm);
		}

		out.println("<ul>");
		for (String item : bag) {
			out.println("<li>" + item + "</li>");
		}
		out.println("</ul>");
		out.println("</form></body></html>");

		session.setAttribute("bag", bag);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
