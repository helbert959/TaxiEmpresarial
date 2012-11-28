
package pe.edu.upc.dsd.taxiempresarial.wsdlservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codReserva" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "codReserva"
})
@XmlRootElement(name = "CancelarReservaRuta")
public class CancelarReservaRuta {

    protected int codReserva;

    /**
     * Gets the value of the codReserva property.
     * 
     */
    public int getCodReserva() {
        return codReserva;
    }

    /**
     * Sets the value of the codReserva property.
     * 
     */
    public void setCodReserva(int value) {
        this.codReserva = value;
    }

}
