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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HerdAlert complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HerdAlert"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="herd_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="bcs_threshold" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HerdAlert", propOrder = {
    "id",
    "herdId",
    "bcsThreshold"
})
public class HerdAlert {

    protected int id;
    @XmlElement(name = "herd_id")
    protected int herdId;
    @XmlElement(name = "bcs_threshold")
    protected int bcsThreshold;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad herdId.
     * 
     */
    public int getHerdId() {
        return herdId;
    }

    /**
     * Define el valor de la propiedad herdId.
     * 
     */
    public void setHerdId(int value) {
        this.herdId = value;
    }

    /**
     * Obtiene el valor de la propiedad bcsThreshold.
     * 
     */
    public int getBcsThreshold() {
        return bcsThreshold;
    }

    /**
     * Define el valor de la propiedad bcsThreshold.
     * 
     */
    public void setBcsThreshold(int value) {
        this.bcsThreshold = value;
    }

}
