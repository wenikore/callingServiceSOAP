
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
 *         &lt;element name="GetCityForecastByZIPResult" type="{http://ws.cdyne.com/WeatherWS/}ForecastReturn" minOccurs="0"/&gt;
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
    "getCityForecastByZIPResult"
})
@XmlRootElement(name = "GetCityForecastByZIPResponse")
public class GetCityForecastByZIPResponse {

    @XmlElement(name = "GetCityForecastByZIPResult")
    protected ForecastReturn getCityForecastByZIPResult;

    /**
     * Obtiene el valor de la propiedad getCityForecastByZIPResult.
     * 
     * @return
     *     possible object is
     *     {@link ForecastReturn }
     *     
     */
    public ForecastReturn getGetCityForecastByZIPResult() {
        return getCityForecastByZIPResult;
    }

    /**
     * Define el valor de la propiedad getCityForecastByZIPResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastReturn }
     *     
     */
    public void setGetCityForecastByZIPResult(ForecastReturn value) {
        this.getCityForecastByZIPResult = value;
    }

}
