
package localhost.webservicetaxyemp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTaxyServicioEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTaxyServicioEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxyServicioEntity" type="{http://localhost/WebServiceTaxyEmp}TaxyServicioEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTaxyServicioEntity", propOrder = {
    "taxyServicioEntity"
})
public class ArrayOfTaxyServicioEntity {

    @XmlElement(name = "TaxyServicioEntity", nillable = true)
    protected List<TaxyServicioEntity> taxyServicioEntity;

    /**
     * Gets the value of the taxyServicioEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxyServicioEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxyServicioEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxyServicioEntity }
     * 
     * 
     */
    public List<TaxyServicioEntity> getTaxyServicioEntity() {
        if (taxyServicioEntity == null) {
            taxyServicioEntity = new ArrayList<TaxyServicioEntity>();
        }
        return this.taxyServicioEntity;
    }

}
