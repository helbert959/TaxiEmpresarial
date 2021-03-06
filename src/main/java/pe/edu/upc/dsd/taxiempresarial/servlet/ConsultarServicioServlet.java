package pe.edu.upc.dsd.taxiempresarial.servlet;

import java.io.IOException;
import java.util.Collection;
import java.util.GregorianCalendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import localhost.webservicetaxyemp.TaxyServicioEntity;

import pe.edu.upc.dsd.taxiempresarial.useful.UsefulMethods;
import localhost.webservicetaxyemp.WebServiceTaxyEmpSoap;

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

        UsefulMethods useful = new UsefulMethods();

        try {
            String codEmp = request.getParameter("cboEmpresa").substring(0, 1);
            String fecha = request.getParameter("cboDia") + "-"
                    + request.getParameter("cboMes") + "-"
                    + request.getParameter("cboAnio");


            WebServiceTaxyEmpSoap port = useful.callWebService();

            GregorianCalendar date1 = new GregorianCalendar();

            date1.setTime(useful.fromStringToDate(fecha));	//'dd-mm-aaaa'
            XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(date1);

            localhost.webservicetaxyemp.ArrayOfTaxyServicioEntity listaArray = port.consultarServicioRutaDisponiblePorDia(date2, Integer.parseInt(codEmp));

            Collection<TaxyServicioEntity> servicios = listaArray.getTaxyServicioEntity();
            
            request.setAttribute("SERVICIOS", servicios);
            RequestDispatcher rd = request.getRequestDispatcher("/consultarServicioTaxi.jsp");
            rd.forward(request, response);

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
