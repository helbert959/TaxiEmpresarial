package pe.edu.upc.dsd.taxiempresarial.servlet;

import java.io.IOException;
import java.util.Collection;
import java.util.GregorianCalendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import localhost.webservicetaxyemp.ArrayOfTaxyReservaEntity;
import localhost.webservicetaxyemp.TaxyReservaEntity;
import localhost.webservicetaxyemp.TaxyServicioEntity;

import pe.edu.upc.dsd.taxiempresarial.useful.UsefulMethods;
import localhost.webservicetaxyemp.WebServiceTaxyEmpSoap;
import pe.edu.upc.dsd.taxiempresarial.model.Usuario;

public class ConsultarReservaServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public ConsultarReservaServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.processRequest(request, response);
        
        UsefulMethods useful = new UsefulMethods();

        try {
            WebServiceTaxyEmpSoap port = useful.callWebService();

            HttpSession session = request.getSession();
            Usuario usuario_actual = (Usuario)session.getAttribute("USUARIO_ACTUAL");
            
            ArrayOfTaxyReservaEntity listaArray = port.consultarServicioRutaDisponiblePorUsuario(usuario_actual.getCod_user());

            Collection<TaxyReservaEntity> reservas = listaArray.getTaxyReservaEntity();
            
            request.setAttribute("RESERVAS", reservas);
            RequestDispatcher rd = request.getRequestDispatcher("/consultarReservaTaxi.jsp");
            rd.forward(request, response);

            } 		
         catch (Exception e) {
//			request.setAttribute("REPRESENTANTES", "errorEX");
//			RequestDispatcher rd = request.getRequestDispatcher("/error.jsp");
//			rd.forward(request, response);			
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.processRequest(request, response);        
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	
    }
}
