//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.24 at 01:30:47 PM IDT 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;all>
 *         &lt;element ref="{}ETT-Name"/>
 *         &lt;element ref="{}ETT-Teaching"/>
 *       &lt;/all>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "ETT-Teacher")
public class ETTTeacher {

    @XmlElement(name = "ETT-Name", required = true)
    protected String ettName;
    @XmlElement(name = "ETT-Teaching", required = true)
    protected ETTTeaching ettTeaching;
    @XmlAttribute(name = "id", required = true)
    protected int id;

    /**
     * Gets the value of the ettName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETTName() {
        return ettName;
    }

    /**
     * Sets the value of the ettName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETTName(String value) {
        this.ettName = value;
    }

    /**
     * Gets the value of the ettTeaching property.
     * 
     * @return
     *     possible object is
     *     {@link ETTTeaching }
     *     
     */
    public ETTTeaching getETTTeaching() {
        return ettTeaching;
    }

    /**
     * Sets the value of the ettTeaching property.
     * 
     * @param value
     *     allowed object is
     *     {@link ETTTeaching }
     *     
     */
    public void setETTTeaching(ETTTeaching value) {
        this.ettTeaching = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

}
