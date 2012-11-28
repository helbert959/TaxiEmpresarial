
package pe.edu.upc.dsd.taxiempresarial.wsdlservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TaxyServicioEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxyServicioEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodServicio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DesRutaIni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DesRutaFin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CostoRuta" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="FecServicio" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxyServicioEntity", propOrder = {
    "codServicio",
    "desRutaIni",
    "desRutaFin",
    "costoRuta",
    "fecServicio"
})
public class TaxyServicioEntity {

    @XmlElement(name = "CodServicio")
    protected int codServicio;
    @XmlElement(name = "DesRutaIni")
    protected String desRutaIni;
    @XmlElement(name = "DesRutaFin")
    protected String desRutaFin;
    @XmlElement(name = "CostoRuta", required = true)
    protected BigDecimal costoRuta;
    @XmlElement(name = "FecServicio", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecServicio;

    /**
     * Gets the value of the codServicio property.
     * 
     */
    public int getCodServicio() {
        return codServicio;
    }

    /**
     * Sets the value of the codServicio property.
     * 
     */
    public void setCodServicio(int value) {
        this.codServicio = value;
    }

    /**
     * Gets the value of the desRutaIni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesRutaIni() {
        return desRutaIni;
    }

    /**
     * Sets the value of the desRutaIni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesRutaIni(String value) {
        this.desRutaIni = value;
    }

    /**
     * Gets the value of the desRutaFin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesRutaFin() {
        return desRutaFin;
    }

    /**
     * Sets the value of the desRutaFin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesRutaFin(String value) {
        this.desRutaFin = value;
    }

    /**
     * Gets the value of the costoRuta property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostoRuta() {
        return costoRuta;
    }

    /**
     * Sets the value of the costoRuta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCostoRuta(BigDecimal value) {
        this.costoRuta = value;
    }

    /**
     * Gets the value of the fecServicio property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecServicio() {
        return fecServicio;
    }

    /**
     * Sets the value of the fecServicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecServicio(XMLGregorianCalendar value) {
        this.fecServicio = value;
    }

}
