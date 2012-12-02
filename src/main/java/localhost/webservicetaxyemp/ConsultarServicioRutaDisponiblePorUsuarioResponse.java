
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
 *         &lt;element name="ConsultarServicioRutaDisponiblePorUsuarioResult" type="{http://localhost/WebServiceTaxyEmp}ArrayOfTaxyReservaEntity" minOccurs="0"/>
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
    "consultarServicioRutaDisponiblePorUsuarioResult"
})
@XmlRootElement(name = "ConsultarServicioRutaDisponiblePorUsuarioResponse")
public class ConsultarServicioRutaDisponiblePorUsuarioResponse {

    @XmlElement(name = "ConsultarServicioRutaDisponiblePorUsuarioResult")
    protected ArrayOfTaxyReservaEntity consultarServicioRutaDisponiblePorUsuarioResult;

    /**
     * Gets the value of the consultarServicioRutaDisponiblePorUsuarioResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTaxyReservaEntity }
     *     
     */
    public ArrayOfTaxyReservaEntity getConsultarServicioRutaDisponiblePorUsuarioResult() {
        return consultarServicioRutaDisponiblePorUsuarioResult;
    }

    /**
     * Sets the value of the consultarServicioRutaDisponiblePorUsuarioResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTaxyReservaEntity }
     *     
     */
    public void setConsultarServicioRutaDisponiblePorUsuarioResult(ArrayOfTaxyReservaEntity value) {
        this.consultarServicioRutaDisponiblePorUsuarioResult = value;
    }

}
