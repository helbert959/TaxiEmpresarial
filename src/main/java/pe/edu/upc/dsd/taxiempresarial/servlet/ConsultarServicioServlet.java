package pe.edu.upc.dsd.taxiempresarial.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.edu.upc.dsd.taxiempresarial.controller.ServicioController;
import pe.edu.upc.dsd.taxiempresarial.exception.DaoException;

public class ConsultarServicioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ConsultarServicioServlet() {
		
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.processRequest(request, response);				
		
		try {
			ServicioController lista = new ServicioController();
				
			request.setAttribute("SERVICIOS", lista.listarEmpresas());
			RequestDispatcher rd = request.getRequestDispatcher("/ConsultarReservaTaxi.jsp");
			rd.forward(request, response);		
								
			} 
		
		catch (DaoException e) {
			request.setAttribute("REPRESENTANTES", "errorEX");
			RequestDispatcher rd = request.getRequestDispatcher("/error.jsp");
			rd.forward(request, response);
			
		}	
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

}
