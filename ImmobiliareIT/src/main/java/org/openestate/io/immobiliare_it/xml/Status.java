
package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="status">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="in costruzione"/>
 *     &lt;enumeration value="nuovo"/>
 *     &lt;enumeration value="abitabile"/>
 *     &lt;enumeration value="ottimo"/>
 *     &lt;enumeration value="buono"/>
 *     &lt;enumeration value="ristrutturato"/>
 *     &lt;enumeration value="da ristrutturare"/>
 *     &lt;enumeration value="discreto"/>
 *     &lt;enumeration value="nd"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "status")
@XmlEnum
public enum Status {

    @XmlEnumValue("in costruzione")
    IN_COSTRUZIONE("in costruzione"),
    @XmlEnumValue("nuovo")
    NUOVO("nuovo"),
    @XmlEnumValue("abitabile")
    ABITABILE("abitabile"),
    @XmlEnumValue("ottimo")
    OTTIMO("ottimo"),
    @XmlEnumValue("buono")
    BUONO("buono"),
    @XmlEnumValue("ristrutturato")
    RISTRUTTURATO("ristrutturato"),
    @XmlEnumValue("da ristrutturare")
    DA_RISTRUTTURARE("da ristrutturare"),
    @XmlEnumValue("discreto")
    DISCRETO("discreto"),
    @XmlEnumValue("nd")
    ND("nd");
    private final String value;

    Status(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Status fromValue(String v) {
        for (Status c: Status.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
