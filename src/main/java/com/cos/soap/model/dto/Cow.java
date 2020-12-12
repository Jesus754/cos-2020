//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.12.01 a las 06:15:43 PM ART 
//


package com.cos.soap.model.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para Cow complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Cow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fecha_nacimiento" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="electronic-id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ultima_fecha_parto" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="cantidad_partos" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="peso" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="cowBcs" type="{http://com/cos/soap/model/dto}CowBcs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cow", propOrder = {
    "id",
    "fechaNacimiento",
    "electronicId",
    "ultimaFechaParto",
    "cantidadPartos",
    "peso",
    "cowBcs"
})
public class Cow {

    protected int id;
    @XmlElement(name = "fecha_nacimiento", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaNacimiento;
    @XmlElement(name = "electronic-id")
    protected int electronicId;
    @XmlElement(name = "ultima_fecha_parto", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ultimaFechaParto;
    @XmlElement(name = "cantidad_partos")
    protected int cantidadPartos;
    protected float peso;
    protected CowBcs cowBcs;

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
     * Obtiene el valor de la propiedad fechaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Define el valor de la propiedad fechaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaNacimiento(XMLGregorianCalendar value) {
        this.fechaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad electronicId.
     * 
     */
    public int getElectronicId() {
        return electronicId;
    }

    /**
     * Define el valor de la propiedad electronicId.
     * 
     */
    public void setElectronicId(int value) {
        this.electronicId = value;
    }

    /**
     * Obtiene el valor de la propiedad ultimaFechaParto.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUltimaFechaParto() {
        return ultimaFechaParto;
    }

    /**
     * Define el valor de la propiedad ultimaFechaParto.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUltimaFechaParto(XMLGregorianCalendar value) {
        this.ultimaFechaParto = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadPartos.
     * 
     */
    public int getCantidadPartos() {
        return cantidadPartos;
    }

    /**
     * Define el valor de la propiedad cantidadPartos.
     * 
     */
    public void setCantidadPartos(int value) {
        this.cantidadPartos = value;
    }

    /**
     * Obtiene el valor de la propiedad peso.
     * 
     */
    public float getPeso() {
        return peso;
    }

    /**
     * Define el valor de la propiedad peso.
     * 
     */
    public void setPeso(float value) {
        this.peso = value;
    }

    /**
     * Obtiene el valor de la propiedad cowBcs.
     * 
     * @return
     *     possible object is
     *     {@link CowBcs }
     *     
     */
    public CowBcs getCowBcs() {
        return cowBcs;
    }

    /**
     * Define el valor de la propiedad cowBcs.
     * 
     * @param value
     *     allowed object is
     *     {@link CowBcs }
     *     
     */
    public void setCowBcs(CowBcs value) {
        this.cowBcs = value;
    }

}
