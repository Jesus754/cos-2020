//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.12.12 a las 10:36:07 AM ART 
//


package com.cos.soap.model.dto;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cow" type="{http://com/cos/soap/model/dto}Cow" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="bcs_promedio" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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
    "id",
    "location",
    "cow",
    "bcsPromedio"
})
@XmlRootElement(name = "getHerdResponse")
public class GetHerdResponse {

    protected int id;
    @XmlElement(required = true)
    protected String location;
    protected List<Cow> cow;
    @XmlElement(name = "bcs_promedio")
    protected double bcsPromedio;

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
     * Obtiene el valor de la propiedad location.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Define el valor de la propiedad location.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the cow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cow }
     * 
     * 
     */
    public List<Cow> getCow() {
        if (cow == null) {
            cow = new ArrayList<Cow>();
        }
        return this.cow;
    }

    /**
     * Obtiene el valor de la propiedad bcsPromedio.
     * 
     */
    public double getBcsPromedio() {
        return bcsPromedio;
    }

    /**
     * Define el valor de la propiedad bcsPromedio.
     * 
     */
    public void setBcsPromedio(double value) {
        this.bcsPromedio = value;
    }

	public void setCow(List<Cow> cow) {
		this.cow = cow;
	}
    
    
}
