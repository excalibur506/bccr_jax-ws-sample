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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SolicitudDeFirma complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SolicitudDeFirma"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Documento" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="FechaDeReferenciaDeLaEntidad" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="HashDocumento" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="IDAlgoritmoHash" type="{http://bccr.fva.cr/}AlgoritmoDeHash"/&gt;
 *         &lt;element name="CodNegocio" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IdFuncionalidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SolicitudDeFirma", propOrder = {
    "documento",
    "fechaDeReferenciaDeLaEntidad",
    "hashDocumento",
    "idAlgoritmoHash",
    "codNegocio",
    "idFuncionalidad"
})
@XmlSeeAlso({
    SolicitudDeFirmaPdf.class
})
public class SolicitudDeFirma {

    @XmlElement(name = "Documento")
    protected byte[] documento;
    @XmlElement(name = "FechaDeReferenciaDeLaEntidad", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaDeReferenciaDeLaEntidad;
    @XmlElement(name = "HashDocumento")
    protected byte[] hashDocumento;
    @XmlElement(name = "IDAlgoritmoHash", required = true)
    @XmlSchemaType(name = "string")
    protected AlgoritmoDeHash idAlgoritmoHash;
    @XmlElement(name = "CodNegocio")
    protected int codNegocio;
    @XmlElement(name = "IdFuncionalidad")
    protected int idFuncionalidad;

    /**
     * Gets the value of the documento property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDocumento() {
        return documento;
    }

    /**
     * Sets the value of the documento property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDocumento(byte[] value) {
        this.documento = value;
    }

    /**
     * Gets the value of the fechaDeReferenciaDeLaEntidad property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaDeReferenciaDeLaEntidad() {
        return fechaDeReferenciaDeLaEntidad;
    }

    /**
     * Sets the value of the fechaDeReferenciaDeLaEntidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaDeReferenciaDeLaEntidad(XMLGregorianCalendar value) {
        this.fechaDeReferenciaDeLaEntidad = value;
    }

    /**
     * Gets the value of the hashDocumento property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getHashDocumento() {
        return hashDocumento;
    }

    /**
     * Sets the value of the hashDocumento property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setHashDocumento(byte[] value) {
        this.hashDocumento = value;
    }

    /**
     * Gets the value of the idAlgoritmoHash property.
     * 
     * @return
     *     possible object is
     *     {@link AlgoritmoDeHash }
     *     
     */
    public AlgoritmoDeHash getIDAlgoritmoHash() {
        return idAlgoritmoHash;
    }

    /**
     * Sets the value of the idAlgoritmoHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgoritmoDeHash }
     *     
     */
    public void setIDAlgoritmoHash(AlgoritmoDeHash value) {
        this.idAlgoritmoHash = value;
    }

    /**
     * Gets the value of the codNegocio property.
     * 
     */
    public int getCodNegocio() {
        return codNegocio;
    }

    /**
     * Sets the value of the codNegocio property.
     * 
     */
    public void setCodNegocio(int value) {
        this.codNegocio = value;
    }

    /**
     * Gets the value of the idFuncionalidad property.
     * 
     */
    public int getIdFuncionalidad() {
        return idFuncionalidad;
    }

    /**
     * Sets the value of the idFuncionalidad property.
     * 
     */
    public void setIdFuncionalidad(int value) {
        this.idFuncionalidad = value;
    }

}
