package pe.edu.upc.dsd.taxiempresarial.test;

import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import static org.junit.Assert.*;

import pe.edu.upc.dsd.taxiempresarial.wsdlservice.WebServiceTaxyEmpSoap;

import org.junit.Test;

import pe.edu.upc.dsd.taxiempresarial.useful.UsefulMethods;

//Pop up jsp
//<td>
//<a href = "javascript:abrir('<%= request.getContextPath() %>/SeleccionarServicioServlet');">seleccionar</a>
//</td>

public class ServiceTest {

    UsefulMethods useful = new UsefulMethods();   
    
    @Test
    public void testConsultarServicioRutaDisponiblePorDia() {
        
        try {
            
            WebServiceTaxyEmpSoap port = useful.callWebService();

            GregorianCalendar date1 = new GregorianCalendar();

            date1.setTime(useful.fromStringToDate("01-12-2012"));	//'dd-mm-aaaa'
            XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(date1);

            int codEmp = 1;
            pe.edu.upc.dsd.taxiempresarial.wsdlservice.ArrayOfTaxyServicioEntity result = port.consultarServicioRutaDisponiblePorDia(date2, codEmp);

            assertEquals(4, result.getTaxyServicioEntity().size());
            
        } catch (Exception ex) {
        }        
    }
    
    @Test
    public void testReservarServicioRuta() {

        try {
            WebServiceTaxyEmpSoap port = useful.callWebService();

            int codUser = 1;
            int codServicio = 1;

            assertEquals(1, port.reservarServicioRuta(codUser, codServicio));

        } catch (Exception ex) {
        }
    }

    @Test
    public void testConsultarServicioRutaDisponiblePorUsuario() {

        try {
            WebServiceTaxyEmpSoap port = useful.callWebService();

            int codUser = 3;

            pe.edu.upc.dsd.taxiempresarial.wsdlservice.ArrayOfTaxyReservaEntity result = port.consultarServicioRutaDisponiblePorUsuario(codUser);

            assertEquals(1, result.getTaxyReservaEntity().size());

        } catch (Exception ex) {
        }

    }

    @Test
    public void testCancelarReservaRuta() {

        try {
            WebServiceTaxyEmpSoap port = useful.callWebService();

            int codReserva = 2;

            assertEquals(1, port.cancelarReservaRuta(codReserva));

        } catch (Exception ex) {
        }
    }   
}
