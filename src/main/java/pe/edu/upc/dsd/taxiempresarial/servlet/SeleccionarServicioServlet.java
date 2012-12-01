package pe.edu.upc.dsd.taxiempresarial.servlet;

import java.io.IOException;
import java.util.GregorianCalendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import pe.edu.upc.dsd.taxiempresarial.exception.DaoException;
import pe.edu.upc.dsd.taxiempresarial.model.Reserva;
import pe.edu.upc.dsd.taxiempresarial.model.Usuario;
import pe.edu.upc.dsd.taxiempresarial.useful.UsefulMethods;
import pe.edu.upc.dsd.taxiempresarial.wsdlservice.WebServiceTaxyEmpSoap;

public class SeleccionarServicioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SeleccionarServicioServlet() {
		
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
//			HttpSession session = request.getSession();
//			Usuario usuario_actual = (Usuario)session.getAttribute("USUARIO_ACTUAL");
//			
//			Reserva reserva = new Reserva(); 
//			
//			reserva.setCod_servicio(cod_servicio);
//			reserva.setCod_user(usuario_actual.getCod_user());
//			
//            request.setAttribute("RESERVA", reserva);
//			RequestDispatcher rd = request.getRequestDispatcher("/consultarServicioTaxiResult.jsp");
//			rd.forward(request, response);		
								
			} 		
		catch (Exception e) {
//			request.setAttribute("REPRESENTANTES", "errorEX");
//			RequestDispatcher rd = request.getRequestDispatcher("/error.jsp");
//			rd.forward(request, response);			
		}	
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {		
	}

}
