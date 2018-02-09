package be.vdab.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import be.vdab.valueobjects.Adres;

@WebServlet("/resultaat.htm")
public class ResultaatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VIEW = "/WEB-INF/JSP/resultaat.jsp";
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Adres adres = new Adres("Interleuvenlaan", "2", "1", "5250", "Heverlee");
		request.setAttribute("adres", adres);
		request.getRequestDispatcher(VIEW).forward(request, response);
	}
}