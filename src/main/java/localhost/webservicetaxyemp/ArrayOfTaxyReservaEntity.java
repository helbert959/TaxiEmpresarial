
package localhost.webservicetaxyemp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTaxyReservaEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTaxyReservaEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxyReservaEntity" type="{http://localhost/WebServiceTaxyEmp}TaxyReservaEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTaxyReservaEntity", propOrder = {
    "taxyReservaEntity"
})
public class ArrayOfTaxyReservaEntity {

    @XmlElement(name = "TaxyReservaEntity", nillable = true)
    protected List<TaxyReservaEntity> taxyReservaEntity;

    /**
     * Gets the value of the taxyReservaEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxyReservaEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxyReservaEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxyReservaEntity }
     * 
     * 
     */
    public List<TaxyReservaEntity> getTaxyReservaEntity() {
        if (taxyReservaEntity == null) {
            taxyReservaEntity = new ArrayList<TaxyReservaEntity>();
        }
        return this.taxyReservaEntity;
    }

}
