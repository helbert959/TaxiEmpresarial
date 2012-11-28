package pe.edu.upc.dsd.taxiempresarial.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pe.edu.upc.dsd.taxiempresarial.controller.UsuarioController;
import pe.edu.upc.dsd.taxiempresarial.exception.DaoException;
import pe.edu.upc.dsd.taxiempresarial.exception.LoginException;
import pe.edu.upc.dsd.taxiempresarial.model.Usuario;

//@WebServlet("/LoginServlet")
public class LoginServlet extends javax.servlet.http.HttpServlet implements
		javax.servlet.Servlet {
	
	static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nickUser = request.getParameter("txtNickUser");
		String pwUser = request.getParameter("txtPwUser");
		
		UsuarioController neg = new UsuarioController();

		try {
			Usuario usuario = neg.login(nickUser, pwUser);
			
			HttpSession session = request.getSession();
			session.setAttribute("USUARIO_ACTUAL", usuario);
			
			response.sendRedirect("PortalServlet");
			return;
		} catch (DaoException e) {
			System.err.println("LoginServlet: Error(DaoException)");
			RequestDispatcher rd = request.getRequestDispatcher("/error.jsp");
			rd.forward(request, response);
		} catch (LoginException e) {
			System.err.println("LoginServlet: Error(LoginException)");
			RequestDispatcher rd = request.getRequestDispatcher("/error_login.jsp");
			rd.forward(request, response);
		}

	}
}