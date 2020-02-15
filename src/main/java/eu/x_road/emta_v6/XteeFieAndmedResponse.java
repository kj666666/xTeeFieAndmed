
package eu.x_road.emta_v6;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paring" type="{http://emta-v6.x-road.eu}PersonalIdentityCode"/&gt;
 *         &lt;element name="keha2" type="{http://emta-v6.x-road.eu}XteeFieAndmedResponseType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "paring",
    "keha2"
})
@XmlRootElement(name = "xteeFieAndmedResponse")
public class XteeFieAndmedResponse {

    @XmlElement(required = true)
    protected PersonalIdentityCode paring;
    @XmlElement(required = true)
    protected XteeFieAndmedResponseType keha2;

    /**
     * Gets the value of the paring property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalIdentityCode }
     *     
     */
    public PersonalIdentityCode getParing() {
        return paring;
    }

    /**
     * Sets the value of the paring property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalIdentityCode }
     *     
     */
    public void setParing(PersonalIdentityCode value) {
        this.paring = value;
    }

    /**
     * Gets the value of the keha2 property.
     * 
     * @return
     *     possible object is
     *     {@link XteeFieAndmedResponseType }
     *     
     */
    public XteeFieAndmedResponseType getKeha2() {
        return keha2;
    }

    /**
     * Sets the value of the keha2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XteeFieAndmedResponseType }
     *     
     */
    public void setKeha2(XteeFieAndmedResponseType value) {
        this.keha2 = value;
    }

}
