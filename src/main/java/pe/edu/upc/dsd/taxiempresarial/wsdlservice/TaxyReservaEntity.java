
package pe.edu.upc.dsd.taxiempresarial.wsdlservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TaxyReservaEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxyReservaEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodReserva" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CodUser" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CodServicio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FecReserva" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CostoRuta" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="EstReserva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NomUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DesRutaIni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DesRutaFin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "TaxyReservaEntity", propOrder = {
    "codReserva",
    "codUser",
    "codServicio",
    "fecReserva",
    "costoRuta",
    "estReserva",
    "nomUser",
    "desRutaIni",
    "desRutaFin",
    "fecServicio"
})
public class TaxyReservaEntity {

    @XmlElement(name = "CodReserva")
    protected int codReserva;
    @XmlElement(name = "CodUser")
    protected int codUser;
    @XmlElement(name = "CodServicio")
    protected int codServicio;
    @XmlElement(name = "FecReserva", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecReserva;
    @XmlElement(name = "CostoRuta", required = true)
    protected BigDecimal costoRuta;
    @XmlElement(name = "EstReserva")
    protected String estReserva;
    @XmlElement(name = "NomUser")
    protected String nomUser;
    @XmlElement(name = "DesRutaIni")
    protected String desRutaIni;
    @XmlElement(name = "DesRutaFin")
    protected String desRutaFin;
    @XmlElement(name = "FecServicio", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecServicio;

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
     * Gets the value of the fecReserva property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecReserva() {
        return fecReserva;
    }

    /**
     * Sets the value of the fecReserva property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecReserva(XMLGregorianCalendar value) {
        this.fecReserva = value;
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
     * Gets the value of the estReserva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstReserva() {
        return estReserva;
    }

    /**
     * Sets the value of the estReserva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstReserva(String value) {
        this.estReserva = value;
    }

    /**
     * Gets the value of the nomUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomUser() {
        return nomUser;
    }

    /**
     * Sets the value of the nomUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomUser(String value) {
        this.nomUser = value;
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
