
package localhost.webservicetaxyemp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="ReservarServicioRutaResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "reservarServicioRutaResult"
})
@XmlRootElement(name = "ReservarServicioRutaResponse")
public class ReservarServicioRutaResponse {

    @XmlElement(name = "ReservarServicioRutaResult")
    protected int reservarServicioRutaResult;

    /**
     * Gets the value of the reservarServicioRutaResult property.
     * 
     */
    public int getReservarServicioRutaResult() {
        return reservarServicioRutaResult;
    }

    /**
     * Sets the value of the reservarServicioRutaResult property.
     * 
     */
    public void setReservarServicioRutaResult(int value) {
        this.reservarServicioRutaResult = value;
    }

}
