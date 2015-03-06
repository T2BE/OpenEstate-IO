
package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nationcode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="nationcode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="it"/>
 *     &lt;enumeration value="en"/>
 *     &lt;enumeration value="de"/>
 *     &lt;enumeration value="fr"/>
 *     &lt;enumeration value="es"/>
 *     &lt;enumeration value="pt"/>
 *     &lt;enumeration value="ru"/>
 *     &lt;enumeration value="gr"/>
 *     &lt;enumeration value="el"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "nationcode")
@XmlEnum
public enum NationCode {

    @XmlEnumValue("it")
    IT("it"),
    @XmlEnumValue("en")
    EN("en"),
    @XmlEnumValue("de")
    DE("de"),
    @XmlEnumValue("fr")
    FR("fr"),
    @XmlEnumValue("es")
    ES("es"),
    @XmlEnumValue("pt")
    PT("pt"),
    @XmlEnumValue("ru")
    RU("ru"),
    @XmlEnumValue("gr")
    GR("gr"),
    @XmlEnumValue("el")
    EL("el");
    private final String value;

    NationCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NationCode fromValue(String v) {
        for (NationCode c: NationCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
