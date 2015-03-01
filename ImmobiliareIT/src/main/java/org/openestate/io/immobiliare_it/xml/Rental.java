//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.01 at 03:45:54 AM CET 
//


package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rental.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="rental">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="3+2"/>
 *     &lt;enumeration value="4+4"/>
 *     &lt;enumeration value="6+6"/>
 *     &lt;enumeration value="9+9"/>
 *     &lt;enumeration value="Transitorio"/>
 *     &lt;enumeration value="Concordato"/>
 *     &lt;enumeration value="Libero"/>
 *     &lt;enumeration value="Studenti"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "rental")
@XmlEnum
public enum Rental {

    @XmlEnumValue("3+2")
    RENT_3_PLUS_2("3+2"),
    @XmlEnumValue("4+4")
    RENT_4_PLUS_4("4+4"),
    @XmlEnumValue("6+6")
    RENT_6_PLUS_6("6+6"),
    @XmlEnumValue("9+9")
    RENT_9_PLUS_9("9+9"),
    @XmlEnumValue("Transitorio")
    TRANSITORIO("Transitorio"),
    @XmlEnumValue("Concordato")
    CONCORDATO("Concordato"),
    @XmlEnumValue("Libero")
    LIBERO("Libero"),
    @XmlEnumValue("Studenti")
    STUDENTI("Studenti");
    private final String value;

    Rental(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Rental fromValue(String v) {
        for (Rental c: Rental.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
