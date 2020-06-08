
package com.cdyne.ws.weatherws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para POP complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="POP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Nighttime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Daytime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POP", propOrder = {
    "nighttime",
    "daytime"
})
public class POP {

    @XmlElement(name = "Nighttime")
    protected String nighttime;
    @XmlElement(name = "Daytime")
    protected String daytime;

    /**
     * Obtiene el valor de la propiedad nighttime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNighttime() {
        return nighttime;
    }

    /**
     * Define el valor de la propiedad nighttime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNighttime(String value) {
        this.nighttime = value;
    }

    /**
     * Obtiene el valor de la propiedad daytime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaytime() {
        return daytime;
    }

    /**
     * Define el valor de la propiedad daytime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaytime(String value) {
        this.daytime = value;
    }

}
