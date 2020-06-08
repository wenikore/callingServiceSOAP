
package com.cdyne.ws.weatherws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetWeatherInformationResult" type="{http://ws.cdyne.com/WeatherWS/}ArrayOfWeatherDescription" minOccurs="0"/&gt;
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
    "getWeatherInformationResult"
})
@XmlRootElement(name = "GetWeatherInformationResponse")
public class GetWeatherInformationResponse {

    @XmlElement(name = "GetWeatherInformationResult")
    protected ArrayOfWeatherDescription getWeatherInformationResult;

    /**
     * Obtiene el valor de la propiedad getWeatherInformationResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWeatherDescription }
     *     
     */
    public ArrayOfWeatherDescription getGetWeatherInformationResult() {
        return getWeatherInformationResult;
    }

    /**
     * Define el valor de la propiedad getWeatherInformationResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWeatherDescription }
     *     
     */
    public void setGetWeatherInformationResult(ArrayOfWeatherDescription value) {
        this.getWeatherInformationResult = value;
    }

}
