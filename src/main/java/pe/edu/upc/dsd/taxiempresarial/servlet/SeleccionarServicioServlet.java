package pe.edu.upc.dsd.taxiempresarial.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import localhost.webservicetaxyemp.WebServiceTaxyEmpSoap;

import pe.edu.upc.dsd.taxiempresarial.model.Usuario;
import pe.edu.upc.dsd.taxiempresarial.useful.UsefulMethods;

public class SeleccionarServicioServlet extends HttpServlet {
//
//    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_3779/ServicioWeb.asmx.wsdl")
//    private WebServiceTaxyEmp service;
//    
    
    private static final long serialVersionUID = 1L;

    public SeleccionarServicioServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        this.processRequest(request, response);

        try {
            UsefulMethods useful = new UsefulMethods();
            WebServiceTaxyEmpSoap port = useful.callWebService();
            
            int codServicio = Integer.parseInt(request.getParameter("codServ"));
            
            HttpSession session = request.getSession();
            Usuario usuario_actual = (Usuario)session.getAttribute("USUARIO_ACTUAL");
            
            int result = port.reservarServicioRuta(usuario_actual.getCod_user(), codServicio);

            if (result != 0) {
                request.setAttribute("RESERVA", "Su reserva se ha realizado satisfactoriamente.");
                RequestDispatcher rd = request.getRequestDispatcher("/confirmarReserva.jsp");
                rd.forward(request, response);
            } else {
                RequestDispatcher rd = request.getRequestDispatcher("/error.jsp");
                rd.forward(request, response);
            }
            
            
        } catch (Exception e) {
            // request.setAttribute("REPRESENTANTES", "errorEX");
            
        }
    }

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        this.processRequest(request, response);
    }

    protected void processRequest(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
    }
}
