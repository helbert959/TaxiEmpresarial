
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
 *         &lt;element name="codUser" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "codUser"
})
@XmlRootElement(name = "ConsultarServicioRutaDisponiblePorUsuario")
public class ConsultarServicioRutaDisponiblePorUsuario {

    protected int codUser;

    /**
     * Gets the value of the codUser property.
     * 
     */
    public int getCodUser() {
        return codUser;
    }

    /**
     * Sets the value of the codUser property.
     * 
     */
    public void setCodUser(int value) {
        this.codUser = value;
    }

}
