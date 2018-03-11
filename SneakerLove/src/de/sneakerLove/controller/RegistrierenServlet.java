package de.sneakerLove.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sneakerLove.kunde.Kunde;

/**
 * Servlet implementation class RegistrierenServlet
 */
@WebServlet("/RegistrierenServlet")
public class RegistrierenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistrierenServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String vorname = request.getParameter("vorname");
		String nachname = request.getParameter("nachname");
		String email = request.getParameter("email");
		String nutzername = request.getParameter("nutzername");
		String passwort = request.getParameter("passwort");
		String confirm = request.getParameter("confirm");

		if (passwordCheck(passwort, confirm)) {
			Kunde kunde = new Kunde(vorname, nachname, email, nutzername, passwort);
			HttpSession session = request.getSession();
			session.setAttribute("KUNDE", kunde);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}

	}

	private boolean passwordCheck(String password, String confirm) {
		if (password.equals(confirm)) {
			// Kunde = new Kunde();
			System.out.println("Passwort stimmt überein!");
			return true;
		} else {
			System.out.println("Passwort stimmt nicht überein!");
			return false;
		}
	}
}
