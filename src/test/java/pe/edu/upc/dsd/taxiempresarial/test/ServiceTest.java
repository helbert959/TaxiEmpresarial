package pe.edu.upc.dsd.taxiempresarial.test;

import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import static org.junit.Assert.*;

import pe.edu.upc.dsd.taxiempresarial.wsdlservice.WebServiceTaxyEmpSoap;

import org.junit.Test;

import pe.edu.upc.dsd.taxiempresarial.useful.UsefulMethods;

public class ServiceTest {

    @Test
    public void testConsultarServicioRutaDisponiblePorDia() {
        UsefulMethods formatter = new UsefulMethods();

        try {
            
            WebServiceTaxyEmpSoap port = callWebService();

            GregorianCalendar date1 = new GregorianCalendar();

            date1.setTime(formatter.fromStringToDate("02-12-2011"));
            XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(date1);

            pe.edu.upc.dsd.taxiempresarial.wsdlservice.ArrayOfTaxyServicioEntity result = port.consultarServicioRutaDisponiblePorDia(date2);

            assertEquals(2, result.getTaxyServicioEntity().size());
            
        } catch (Exception ex) {
        }
    }

    @Test
    public void testReservarServicioRuta() {

        try {
            WebServiceTaxyEmpSoap port = callWebService();

            int codUser = 1;
            int codServicio = 1;

            assertEquals(1, port.reservarServicioRuta(codUser, codServicio));

        } catch (Exception ex) {
        }
    }

    @Test
    public void testConsultarServicioRutaDisponiblePorUsuario() {

        try {
            WebServiceTaxyEmpSoap port = callWebService();

            int codUser = 1;

            pe.edu.upc.dsd.taxiempresarial.wsdlservice.ArrayOfTaxyReservaEntity result = port.consultarServicioRutaDisponiblePorUsuario(codUser);

            assertEquals(2, result.getTaxyReservaEntity().size());

        } catch (Exception ex) {
        }

    }

    @Test
    public void testCancelarReservaRuta() {

        try {
            WebServiceTaxyEmpSoap port = callWebService();

            int codReserva = 2;

            assertEquals(1, port.cancelarReservaRuta(codReserva));

        } catch (Exception ex) {
        }

    }

    public WebServiceTaxyEmpSoap callWebService() {
        // Call Web Service Operation
        pe.edu.upc.dsd.taxiempresarial.wsdlservice.WebServiceTaxyEmp service = new pe.edu.upc.dsd.taxiempresarial.wsdlservice.WebServiceTaxyEmp();
        pe.edu.upc.dsd.taxiempresarial.wsdlservice.WebServiceTaxyEmpSoap port = service.getWebServiceTaxyEmpSoap();
        return port;
    }
}
