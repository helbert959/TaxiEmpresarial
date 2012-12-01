package pe.edu.upc.dsd.taxiempresarial.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.GregorianCalendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import pe.edu.upc.dsd.taxiempresarial.exception.DaoException;
import pe.edu.upc.dsd.taxiempresarial.model.ServicioRuta;
import pe.edu.upc.dsd.taxiempresarial.useful.UsefulMethods;
import pe.edu.upc.dsd.taxiempresarial.wsdlservice.ArrayOfTaxyServicioEntity;
import pe.edu.upc.dsd.taxiempresarial.wsdlservice.TaxyServicioEntity;
import pe.edu.upc.dsd.taxiempresarial.wsdlservice.WebServiceTaxyEmpSoap;

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
			String codEmp = request.getParameter("cboEmpresa");
			String fecha = request.getParameter("cboDia") + "-" +
					 	   request.getParameter("cboMes") + "-" +
					 	   request.getParameter("cboAnio");
			
			
			WebServiceTaxyEmpSoap port = useful.callWebService();
	        
            GregorianCalendar date1 = new GregorianCalendar();

            date1.setTime(useful.fromStringToDate(fecha));	//'dd-mm-aaaa'
            XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(date1);

            pe.edu.upc.dsd.taxiempresarial.wsdlservice.ArrayOfTaxyServicioEntity listaServicios = port.consultarServicioRutaDisponiblePorDia(date2, Integer.parseInt(codEmp));
				
            request.setAttribute("SERVICIOS", listaServicios);//.getTaxyServicioEntity());
            
            ArrayList lista = ArrayList<TaxyServicioEntity>listaServicios;
            
            if ( lista != null ) { 
				for ( ServicioRuta servicio : lista ) { 		
					System.out.println(servicio.getCod_servicio());
					System.out.println(servicio.getDes_ruta_ini());
					System.out.println(servicio.getDes_ruta_fin());
					System.out.println(servicio.getCosto_ruta());
					System.out.println(servicio.getFec_servicio());
		
			}
		}
//            
//			RequestDispatcher rd = request.getRequestDispatcher("/consultarServicioTaxi.jsp");
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
