//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v2.3.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.09.28 a las 03:50:48 PM CST 
//


package com.consiti.h2h.bean;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="CUSTOMER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="BEGIN_DATE"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;date"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="END_DATE"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;date"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "customerid",
    "begindate",
    "enddate"
})
@XmlRootElement(name = "consultaLotesCliente")
public class ConsultaLotesCliente {

    @XmlElement(name = "CUSTOMER_ID", required = true)
    protected BigInteger customerid;
    @XmlElement(name = "BEGIN_DATE", required = true)
    protected ConsultaLotesCliente.BEGINDATE begindate;
    @XmlElement(name = "END_DATE", required = true)
    protected ConsultaLotesCliente.ENDDATE enddate;

    /**
     * Obtiene el valor de la propiedad customerid.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCUSTOMERID() {
        return customerid;
    }

    /**
     * Define el valor de la propiedad customerid.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCUSTOMERID(BigInteger value) {
        this.customerid = value;
    }

    /**
     * Obtiene el valor de la propiedad begindate.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaLotesCliente.BEGINDATE }
     *     
     */
    public ConsultaLotesCliente.BEGINDATE getBEGINDATE() {
        return begindate;
    }

    /**
     * Define el valor de la propiedad begindate.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaLotesCliente.BEGINDATE }
     *     
     */
    public void setBEGINDATE(ConsultaLotesCliente.BEGINDATE value) {
        this.begindate = value;
    }

    /**
     * Obtiene el valor de la propiedad enddate.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaLotesCliente.ENDDATE }
     *     
     */
    public ConsultaLotesCliente.ENDDATE getENDDATE() {
        return enddate;
    }

    /**
     * Define el valor de la propiedad enddate.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaLotesCliente.ENDDATE }
     *     
     */
    public void setENDDATE(ConsultaLotesCliente.ENDDATE value) {
        this.enddate = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;date"&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class BEGINDATE {

        @XmlValue
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar value;

        /**
         * Obtiene el valor de la propiedad value.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getValue() {
            return value;
        }

        /**
         * Define el valor de la propiedad value.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setValue(XMLGregorianCalendar value) {
            this.value = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;date"&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ENDDATE {

        @XmlValue
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar value;

        /**
         * Obtiene el valor de la propiedad value.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getValue() {
            return value;
        }

        /**
         * Define el valor de la propiedad value.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setValue(XMLGregorianCalendar value) {
            this.value = value;
        }

    }

}
