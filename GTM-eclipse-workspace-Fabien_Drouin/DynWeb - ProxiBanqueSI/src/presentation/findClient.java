package presentation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Client;
import service.Service;

/**
 * Servlet implementation class CestQui
 */
@WebServlet("/findclient")
public class findClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int id;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public findClient() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter writer = response.getWriter();

		writer.println("<p>***********************Réponse du formulaire***********************");
		String idS = request.getParameter("id");
		id = Integer.parseInt(idS);
		writer.println("<p> id Client : " + id);
		

		writer.println("<p>*******************************************************************");
		response.getWriter().append("<p> Served at: ").append(request.getContextPath());

		writer.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	// getters and setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
