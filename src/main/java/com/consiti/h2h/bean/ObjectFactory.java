//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v2.3.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.09.28 a las 03:18:07 PM CST 
//


package com.consiti.h2h.bean;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.consiti.h2h.bean package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.consiti.h2h.bean
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestHeader }
     * 
     */
    public RequestHeader createRequestHeader() {
        return new RequestHeader();
    }

    /**
     * Create an instance of {@link RequestHeader.Authentication }
     * 
     */
    public RequestHeader.Authentication createRequestHeaderAuthentication() {
        return new RequestHeader.Authentication();
    }

    /**
     * Create an instance of {@link RequestHeader.Region }
     * 
     */
    public RequestHeader.Region createRequestHeaderRegion() {
        return new RequestHeader.Region();
    }

}
