//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.04 at 10:29:03 PM BRST 
//


package br.com.ntk.transacao;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoTransacao.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoTransacao">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEBITO"/>
 *     &lt;enumeration value="CREDITO"/>
 *     &lt;enumeration value="BOLETO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoTransacao")
@XmlEnum
public enum TipoTransacao {

    DEBITO,
    CREDITO,
    BOLETO;

    public String value() {
        return name();
    }

    public static TipoTransacao fromValue(String v) {
        return valueOf(v);
    }

}
