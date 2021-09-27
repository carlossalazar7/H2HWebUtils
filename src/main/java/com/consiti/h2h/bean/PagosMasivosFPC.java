//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v2.3.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.09.27 a las 05:03:02 PM CST 
//


package com.consiti.h2h.bean;

import java.math.BigInteger;
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
 *         &lt;element name="GLOBAL_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="CUSTOMER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="USERNAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *                             &lt;element name="CUSTOMER_BATCH_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="DATA_STRUCTURE"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="VALIDATIONS"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="DEBIT_ACCT_BALANCE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="DEBIT_ACCT_STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="NUMBER_OF_TRANSACTIONS" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                                                 &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="FIELDS"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="FIELD" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="DELIMITER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="TRANSACTIONS"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="TRANSACTION" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
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
    "username",
    "batches"
})
@XmlRootElement(name = "pagosMasivosFPC")
public class PagosMasivosFPC {

    @XmlElement(name = "GLOBAL_ID", required = true)
    protected BigInteger globalid;
    @XmlElement(name = "CUSTOMER_ID", required = true)
    protected BigInteger customerid;
    @XmlElement(name = "USERNAME", required = true)
    protected String username;
    @XmlElement(name = "BATCHES", required = true)
    protected PagosMasivosFPC.BATCHES batches;

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
     * Obtiene el valor de la propiedad username.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSERNAME() {
        return username;
    }

    /**
     * Define el valor de la propiedad username.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSERNAME(String value) {
        this.username = value;
    }

    /**
     * Obtiene el valor de la propiedad batches.
     * 
     * @return
     *     possible object is
     *     {@link PagosMasivosFPC.BATCHES }
     *     
     */
    public PagosMasivosFPC.BATCHES getBATCHES() {
        return batches;
    }

    /**
     * Define el valor de la propiedad batches.
     * 
     * @param value
     *     allowed object is
     *     {@link PagosMasivosFPC.BATCHES }
     *     
     */
    public void setBATCHES(PagosMasivosFPC.BATCHES value) {
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
     *                   &lt;element name="CUSTOMER_BATCH_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="DATA_STRUCTURE"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="VALIDATIONS"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="DEBIT_ACCT_BALANCE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="DEBIT_ACCT_STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="NUMBER_OF_TRANSACTIONS" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                                       &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="FIELDS"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="FIELD" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="DELIMITER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="TRANSACTIONS"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="TRANSACTION" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
        "batch"
    })
    public static class BATCHES {

        @XmlElement(name = "BATCH", required = true)
        protected PagosMasivosFPC.BATCHES.BATCH batch;

        /**
         * Obtiene el valor de la propiedad batch.
         * 
         * @return
         *     possible object is
         *     {@link PagosMasivosFPC.BATCHES.BATCH }
         *     
         */
        public PagosMasivosFPC.BATCHES.BATCH getBATCH() {
            return batch;
        }

        /**
         * Define el valor de la propiedad batch.
         * 
         * @param value
         *     allowed object is
         *     {@link PagosMasivosFPC.BATCHES.BATCH }
         *     
         */
        public void setBATCH(PagosMasivosFPC.BATCHES.BATCH value) {
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
         *         &lt;element name="CUSTOMER_BATCH_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="DATA_STRUCTURE"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="VALIDATIONS"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="DEBIT_ACCT_BALANCE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="DEBIT_ACCT_STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="NUMBER_OF_TRANSACTIONS" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *                             &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="FIELDS"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="FIELD" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="DELIMITER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="TRANSACTIONS"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="TRANSACTION" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
            "customerbatchid",
            "type",
            "datastructure",
            "transactions"
        })
        public static class BATCH {

            @XmlElement(name = "CUSTOMER_BATCH_ID", required = true)
            protected BigInteger customerbatchid;
            @XmlElement(name = "TYPE", required = true)
            protected BigInteger type;
            @XmlElement(name = "DATA_STRUCTURE", required = true)
            protected PagosMasivosFPC.BATCHES.BATCH.DATASTRUCTURE datastructure;
            @XmlElement(name = "TRANSACTIONS", required = true)
            protected PagosMasivosFPC.BATCHES.BATCH.TRANSACTIONS transactions;

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
             * Obtiene el valor de la propiedad type.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTYPE() {
                return type;
            }

            /**
             * Define el valor de la propiedad type.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTYPE(BigInteger value) {
                this.type = value;
            }

            /**
             * Obtiene el valor de la propiedad datastructure.
             * 
             * @return
             *     possible object is
             *     {@link PagosMasivosFPC.BATCHES.BATCH.DATASTRUCTURE }
             *     
             */
            public PagosMasivosFPC.BATCHES.BATCH.DATASTRUCTURE getDATASTRUCTURE() {
                return datastructure;
            }

            /**
             * Define el valor de la propiedad datastructure.
             * 
             * @param value
             *     allowed object is
             *     {@link PagosMasivosFPC.BATCHES.BATCH.DATASTRUCTURE }
             *     
             */
            public void setDATASTRUCTURE(PagosMasivosFPC.BATCHES.BATCH.DATASTRUCTURE value) {
                this.datastructure = value;
            }

            /**
             * Obtiene el valor de la propiedad transactions.
             * 
             * @return
             *     possible object is
             *     {@link PagosMasivosFPC.BATCHES.BATCH.TRANSACTIONS }
             *     
             */
            public PagosMasivosFPC.BATCHES.BATCH.TRANSACTIONS getTRANSACTIONS() {
                return transactions;
            }

            /**
             * Define el valor de la propiedad transactions.
             * 
             * @param value
             *     allowed object is
             *     {@link PagosMasivosFPC.BATCHES.BATCH.TRANSACTIONS }
             *     
             */
            public void setTRANSACTIONS(PagosMasivosFPC.BATCHES.BATCH.TRANSACTIONS value) {
                this.transactions = value;
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
             *         &lt;element name="VALIDATIONS"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="DEBIT_ACCT_BALANCE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="DEBIT_ACCT_STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="NUMBER_OF_TRANSACTIONS" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
             *                   &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="FIELDS"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="FIELD" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="DELIMITER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "validations",
                "fields",
                "delimiter"
            })
            public static class DATASTRUCTURE {

                @XmlElement(name = "VALIDATIONS", required = true)
                protected PagosMasivosFPC.BATCHES.BATCH.DATASTRUCTURE.VALIDATIONS validations;
                @XmlElement(name = "FIELDS", required = true)
                protected PagosMasivosFPC.BATCHES.BATCH.DATASTRUCTURE.FIELDS fields;
                @XmlElement(name = "DELIMITER", required = true)
                protected String delimiter;

                /**
                 * Obtiene el valor de la propiedad validations.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PagosMasivosFPC.BATCHES.BATCH.DATASTRUCTURE.VALIDATIONS }
                 *     
                 */
                public PagosMasivosFPC.BATCHES.BATCH.DATASTRUCTURE.VALIDATIONS getVALIDATIONS() {
                    return validations;
                }

                /**
                 * Define el valor de la propiedad validations.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PagosMasivosFPC.BATCHES.BATCH.DATASTRUCTURE.VALIDATIONS }
                 *     
                 */
                public void setVALIDATIONS(PagosMasivosFPC.BATCHES.BATCH.DATASTRUCTURE.VALIDATIONS value) {
                    this.validations = value;
                }

                /**
                 * Obtiene el valor de la propiedad fields.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PagosMasivosFPC.BATCHES.BATCH.DATASTRUCTURE.FIELDS }
                 *     
                 */
                public PagosMasivosFPC.BATCHES.BATCH.DATASTRUCTURE.FIELDS getFIELDS() {
                    return fields;
                }

                /**
                 * Define el valor de la propiedad fields.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PagosMasivosFPC.BATCHES.BATCH.DATASTRUCTURE.FIELDS }
                 *     
                 */
                public void setFIELDS(PagosMasivosFPC.BATCHES.BATCH.DATASTRUCTURE.FIELDS value) {
                    this.fields = value;
                }

                /**
                 * Obtiene el valor de la propiedad delimiter.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDELIMITER() {
                    return delimiter;
                }

                /**
                 * Define el valor de la propiedad delimiter.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDELIMITER(String value) {
                    this.delimiter = value;
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
                 *         &lt;element name="FIELD" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
                    "field"
                })
                public static class FIELDS {

                    @XmlElement(name = "FIELD", required = true)
                    protected List<String> field;

                    /**
                     * Gets the value of the field property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the field property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getFIELD().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getFIELD() {
                        if (field == null) {
                            field = new ArrayList<String>();
                        }
                        return this.field;
                    }

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
                 *         &lt;element name="DEBIT_ACCT_BALANCE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="DEBIT_ACCT_STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="NUMBER_OF_TRANSACTIONS" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
                 *         &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
                    "debitacctbalance",
                    "debitacctstatus",
                    "numberoftransactions",
                    "totalamount"
                })
                public static class VALIDATIONS {

                    @XmlElement(name = "DEBIT_ACCT_BALANCE", required = true)
                    protected String debitacctbalance;
                    @XmlElement(name = "DEBIT_ACCT_STATUS", required = true)
                    protected String debitacctstatus;
                    @XmlElement(name = "NUMBER_OF_TRANSACTIONS", required = true)
                    protected BigInteger numberoftransactions;
                    @XmlElement(name = "TOTAL_AMOUNT", required = true)
                    protected BigInteger totalamount;

                    /**
                     * Obtiene el valor de la propiedad debitacctbalance.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDEBITACCTBALANCE() {
                        return debitacctbalance;
                    }

                    /**
                     * Define el valor de la propiedad debitacctbalance.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDEBITACCTBALANCE(String value) {
                        this.debitacctbalance = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad debitacctstatus.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDEBITACCTSTATUS() {
                        return debitacctstatus;
                    }

                    /**
                     * Define el valor de la propiedad debitacctstatus.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDEBITACCTSTATUS(String value) {
                        this.debitacctstatus = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad numberoftransactions.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getNUMBEROFTRANSACTIONS() {
                        return numberoftransactions;
                    }

                    /**
                     * Define el valor de la propiedad numberoftransactions.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setNUMBEROFTRANSACTIONS(BigInteger value) {
                        this.numberoftransactions = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad totalamount.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getTOTALAMOUNT() {
                        return totalamount;
                    }

                    /**
                     * Define el valor de la propiedad totalamount.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setTOTALAMOUNT(BigInteger value) {
                        this.totalamount = value;
                    }

                }

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
             *         &lt;element name="TRANSACTION" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
                "transaction"
            })
            public static class TRANSACTIONS {

                @XmlElement(name = "TRANSACTION", required = true)
                protected List<String> transaction;

                /**
                 * Gets the value of the transaction property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the transaction property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTRANSACTION().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getTRANSACTION() {
                    if (transaction == null) {
                        transaction = new ArrayList<String>();
                    }
                    return this.transaction;
                }

            }

        }

    }

}
