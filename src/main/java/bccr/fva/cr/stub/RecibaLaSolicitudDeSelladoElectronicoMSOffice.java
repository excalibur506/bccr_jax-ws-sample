//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.23 at 06:15:48 PM CST 
//


package bccr.fva.cr.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="laSolicitud" type="{http://bccr.fva.cr/}SolicitudDeFirma" minOccurs="0"/&gt;
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
    "laSolicitud"
})
@XmlRootElement(name = "RecibaLaSolicitudDeSelladoElectronicoMSOffice")
public class RecibaLaSolicitudDeSelladoElectronicoMSOffice {

    protected SolicitudDeFirma laSolicitud;

    /**
     * Gets the value of the laSolicitud property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitudDeFirma }
     *     
     */
    public SolicitudDeFirma getLaSolicitud() {
        return laSolicitud;
    }

    /**
     * Sets the value of the laSolicitud property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitudDeFirma }
     *     
     */
    public void setLaSolicitud(SolicitudDeFirma value) {
        this.laSolicitud = value;
    }

}
