//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.12.12 a las 10:36:07 AM ART 
//


package com.cos.soap.model.dto;

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
 *         &lt;element name="cow" type="{http://com/cos/soap/model/dto}Cow"/&gt;
 *         &lt;element name="lastBcs" type="{http://com/cos/soap/model/dto}CowBcs"/&gt;
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
    "cow",
    "lastBcs"
})
@XmlRootElement(name = "getCowResponse")
public class GetCowResponse {

    @XmlElement(required = true)
    protected Cow cow;
    @XmlElement(required = true)
    protected CowBcs lastBcs;

    /**
     * Obtiene el valor de la propiedad cow.
     * 
     * @return
     *     possible object is
     *     {@link Cow }
     *     
     */
    public Cow getCow() {
        return cow;
    }

    /**
     * Define el valor de la propiedad cow.
     * 
     * @param value
     *     allowed object is
     *     {@link Cow }
     *     
     */
    public void setCow(Cow value) {
        this.cow = value;
    }

    /**
     * Obtiene el valor de la propiedad lastBcs.
     * 
     * @return
     *     possible object is
     *     {@link CowBcs }
     *     
     */
    public CowBcs getLastBcs() {
        return lastBcs;
    }

    /**
     * Define el valor de la propiedad lastBcs.
     * 
     * @param value
     *     allowed object is
     *     {@link CowBcs }
     *     
     */
    public void setLastBcs(CowBcs value) {
        this.lastBcs = value;
    }

}
