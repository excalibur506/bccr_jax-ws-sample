//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.23 at 06:15:48 PM CST 
//


package bccr.fva.cr.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SolicitudDeFirmaPdf complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SolicitudDeFirmaPdf"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://bccr.fva.cr/}SolicitudDeFirma"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Razon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Lugar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SolicitudDeFirmaPdf", propOrder = {
    "razon",
    "lugar"
})
public class SolicitudDeFirmaPdf
    extends SolicitudDeFirma
{

    @XmlElement(name = "Razon")
    protected String razon;
    @XmlElement(name = "Lugar")
    protected String lugar;

    /**
     * Gets the value of the razon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazon() {
        return razon;
    }

    /**
     * Sets the value of the razon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazon(String value) {
        this.razon = value;
    }

    /**
     * Gets the value of the lugar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * Sets the value of the lugar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugar(String value) {
        this.lugar = value;
    }

}