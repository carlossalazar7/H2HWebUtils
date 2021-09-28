//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v2.3.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.09.28 a las 03:48:57 PM CST 
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
 *         &lt;element name="GLOBAL_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="CUSTOMER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="BATCHES"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BATCH"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="BANK_BATCH_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="CUSTOMER_BATCH_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
    "globalid",
    "customerid",
    "batches"
})
@XmlRootElement(name = "pagosMasivosResponse")
public class PagosMasivosResponse {

    @XmlElement(name = "GLOBAL_ID", required = true)
    protected BigInteger globalid;
    @XmlElement(name = "CUSTOMER_ID", required = true)
    protected BigInteger customerid;
    @XmlElement(name = "BATCHES", required = true)
    protected PagosMasivosResponse.BATCHES batches;

    /**
     * Obtiene el valor de la propiedad globalid.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGLOBALID() {
        return globalid;
    }

    /**
     * Define el valor de la propiedad globalid.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGLOBALID(BigInteger value) {
        this.globalid = value;
    }

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
     * Obtiene el valor de la propiedad batches.
     * 
     * @return
     *     possible object is
     *     {@link PagosMasivosResponse.BATCHES }
     *     
     */
    public PagosMasivosResponse.BATCHES getBATCHES() {
        return batches;
    }

    /**
     * Define el valor de la propiedad batches.
     * 
     * @param value
     *     allowed object is
     *     {@link PagosMasivosResponse.BATCHES }
     *     
     */
    public void setBATCHES(PagosMasivosResponse.BATCHES value) {
        this.batches = value;
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
     *         &lt;element name="BATCH"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="BANK_BATCH_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="CUSTOMER_BATCH_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "batch"
    })
    public static class BATCHES {

        @XmlElement(name = "BATCH", required = true)
        protected PagosMasivosResponse.BATCHES.BATCH batch;

        /**
         * Obtiene el valor de la propiedad batch.
         * 
         * @return
         *     possible object is
         *     {@link PagosMasivosResponse.BATCHES.BATCH }
         *     
         */
        public PagosMasivosResponse.BATCHES.BATCH getBATCH() {
            return batch;
        }

        /**
         * Define el valor de la propiedad batch.
         * 
         * @param value
         *     allowed object is
         *     {@link PagosMasivosResponse.BATCHES.BATCH }
         *     
         */
        public void setBATCH(PagosMasivosResponse.BATCHES.BATCH value) {
            this.batch = value;
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
         *         &lt;element name="BANK_BATCH_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="CUSTOMER_BATCH_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "bankbatchid",
            "customerbatchid",
            "status"
        })
        public static class BATCH {

            @XmlElement(name = "BANK_BATCH_ID", required = true)
            protected BigInteger bankbatchid;
            @XmlElement(name = "CUSTOMER_BATCH_ID", required = true)
            protected BigInteger customerbatchid;
            @XmlElement(name = "STATUS", required = true)
            protected String status;

            /**
             * Obtiene el valor de la propiedad bankbatchid.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getBANKBATCHID() {
                return bankbatchid;
            }

            /**
             * Define el valor de la propiedad bankbatchid.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setBANKBATCHID(BigInteger value) {
                this.bankbatchid = value;
            }

            /**
             * Obtiene el valor de la propiedad customerbatchid.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getCUSTOMERBATCHID() {
                return customerbatchid;
            }

            /**
             * Define el valor de la propiedad customerbatchid.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setCUSTOMERBATCHID(BigInteger value) {
                this.customerbatchid = value;
            }

            /**
             * Obtiene el valor de la propiedad status.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSTATUS() {
                return status;
            }

            /**
             * Define el valor de la propiedad status.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSTATUS(String value) {
                this.status = value;
            }

        }

    }

}
