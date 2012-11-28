
package pe.edu.upc.dsd.taxiempresarial.wsdlservice;

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
 *         &lt;element name="ConsultarServicioRutaDisponiblePorDiaResult" type="{http://localhost/WebServiceTaxyEmp}ArrayOfTaxyServicioEntity" minOccurs="0"/>
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
    "consultarServicioRutaDisponiblePorDiaResult"
})
@XmlRootElement(name = "ConsultarServicioRutaDisponiblePorDiaResponse")
public class ConsultarServicioRutaDisponiblePorDiaResponse {

    @XmlElement(name = "ConsultarServicioRutaDisponiblePorDiaResult")
    protected ArrayOfTaxyServicioEntity consultarServicioRutaDisponiblePorDiaResult;

    /**
     * Gets the value of the consultarServicioRutaDisponiblePorDiaResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTaxyServicioEntity }
     *     
     */
    public ArrayOfTaxyServicioEntity getConsultarServicioRutaDisponiblePorDiaResult() {
        return consultarServicioRutaDisponiblePorDiaResult;
    }

    /**
     * Sets the value of the consultarServicioRutaDisponiblePorDiaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTaxyServicioEntity }
     *     
     */
    public void setConsultarServicioRutaDisponiblePorDiaResult(ArrayOfTaxyServicioEntity value) {
        this.consultarServicioRutaDisponiblePorDiaResult = value;
    }

}
