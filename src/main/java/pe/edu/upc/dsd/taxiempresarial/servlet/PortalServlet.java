package pe.edu.upc.dsd.taxiempresarial.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pe.edu.upc.dsd.taxiempresarial.model.Usuario;

public class PortalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PortalServlet() {
		
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.processRequest(request, response);		
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		Usuario usuario_actual = (Usuario)session.getAttribute("USUARIO_ACTUAL");	
		
		if (usuario_actual == null) {
			request.getRequestDispatcher("error.jsp").forward(request, response);
			return;
		}

		RequestDispatcher rd = request.getRequestDispatcher("Portal_Cliente.jsp");
		rd.forward(request, response);

		return;
	}

}
