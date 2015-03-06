
package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for yesnoready.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="yesnoready">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Yes"/>
 *     &lt;enumeration value="No"/>
 *     &lt;enumeration value="Ready"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "yesnoready")
@XmlEnum
public enum YesNoReady {

    @XmlEnumValue("Yes")
    YES("Yes"),
    @XmlEnumValue("No")
    NO("No"),
    @XmlEnumValue("Ready")
    READY("Ready");
    private final String value;

    YesNoReady(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static YesNoReady fromValue(String v) {
        for (YesNoReady c: YesNoReady.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
