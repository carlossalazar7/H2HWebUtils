//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v2.3.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.09.28 a las 03:50:07 PM CST 
//


package com.consiti.h2h.bean;

import java.math.BigInteger;
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
 *         &lt;element name="CUSTOMER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="QUERY_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="QUERY_VALUE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="PAGING_INFO"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PAGING" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="INITIAL_RECORD" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="RECORD_COUNT" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
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
    "querytype",
    "queryvalue",
    "paginginfo"
})
@XmlRootElement(name = "consultaDetalleLote")
public class ConsultaDetalleLote {

    @XmlElement(name = "CUSTOMER_ID", required = true)
    protected BigInteger customerid;
    @XmlElement(name = "QUERY_TYPE", required = true)
    protected String querytype;
    @XmlElement(name = "QUERY_VALUE", required = true)
    protected BigInteger queryvalue;
    @XmlElement(name = "PAGING_INFO", required = true)
    protected ConsultaDetalleLote.PAGINGINFO paginginfo;

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
     * Obtiene el valor de la propiedad querytype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQUERYTYPE() {
        return querytype;
    }

    /**
     * Define el valor de la propiedad querytype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQUERYTYPE(String value) {
        this.querytype = value;
    }

    /**
     * Obtiene el valor de la propiedad queryvalue.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQUERYVALUE() {
        return queryvalue;
    }

    /**
     * Define el valor de la propiedad queryvalue.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQUERYVALUE(BigInteger value) {
        this.queryvalue = value;
    }

    /**
     * Obtiene el valor de la propiedad paginginfo.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaDetalleLote.PAGINGINFO }
     *     
     */
    public ConsultaDetalleLote.PAGINGINFO getPAGINGINFO() {
        return paginginfo;
    }

    /**
     * Define el valor de la propiedad paginginfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaDetalleLote.PAGINGINFO }
     *     
     */
    public void setPAGINGINFO(ConsultaDetalleLote.PAGINGINFO value) {
        this.paginginfo = value;
    }


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
     *         &lt;element name="PAGING" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="INITIAL_RECORD" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="RECORD_COUNT" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
        "paging",
        "initialrecord",
        "recordcount"
    })
    public static class PAGINGINFO {

        @XmlElement(name = "PAGING", required = true)
        protected String paging;
        @XmlElement(name = "INITIAL_RECORD", required = true)
        protected BigInteger initialrecord;
        @XmlElement(name = "RECORD_COUNT", required = true)
        protected BigInteger recordcount;

        /**
         * Obtiene el valor de la propiedad paging.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAGING() {
            return paging;
        }

        /**
         * Define el valor de la propiedad paging.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAGING(String value) {
            this.paging = value;
        }

        /**
         * Obtiene el valor de la propiedad initialrecord.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getINITIALRECORD() {
            return initialrecord;
        }

        /**
         * Define el valor de la propiedad initialrecord.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setINITIALRECORD(BigInteger value) {
            this.initialrecord = value;
        }

        /**
         * Obtiene el valor de la propiedad recordcount.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRECORDCOUNT() {
            return recordcount;
        }

        /**
         * Define el valor de la propiedad recordcount.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRECORDCOUNT(BigInteger value) {
            this.recordcount = value;
        }

    }

}
