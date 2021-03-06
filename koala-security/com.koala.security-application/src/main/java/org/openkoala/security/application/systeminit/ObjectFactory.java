//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.23 at 04:24:31 PM CST 
//

package org.openkoala.security.application.systeminit;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the org.openkoala.security.application.systemInit package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openkoala.security.application.systemInit
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SystemInit }
     */
    public SystemInit createSystemInit() {
        return new SystemInit();
    }

    /**
     * Create an instance of {@link SystemInit.User }
     */
    public SystemInit.User createSystemInitUser() {
        return new SystemInit.User();
    }

    /**
     * Create an instance of {@link SystemInit.Role }
     */
    public SystemInit.Role createSystemInitRole() {
        return new SystemInit.Role();
    }

    /**
     * Create an instance of {@link SystemInit.MenuResource }
     */
    public SystemInit.MenuResource createSystemInitMenuResource() {
        return new SystemInit.MenuResource();
    }

    /**
     * Create an instance of {@link SystemInit.UrlAccessResource }
     */
    public SystemInit.UrlAccessResource createSystemInitUrlAccessResource() {
        return new SystemInit.UrlAccessResource();
    }

    /**
     * Create an instance of {@link SystemInit.PageElementResource }
     */
    public SystemInit.PageElementResource createSystemInitPageElementResource() {
        return new SystemInit.PageElementResource();
    }
}
