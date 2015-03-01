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
 * <p>Java class for terrainType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="terrainType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="seminativo"/>
 *     &lt;enumeration value="seminativo irriguo"/>
 *     &lt;enumeration value="seminativo arborato"/>
 *     &lt;enumeration value="seminativo arborato irriguo"/>
 *     &lt;enumeration value="prato"/>
 *     &lt;enumeration value="prato irriguo"/>
 *     &lt;enumeration value="prato arborato"/>
 *     &lt;enumeration value="prato a marcita"/>
 *     &lt;enumeration value="risaia stabile"/>
 *     &lt;enumeration value="pascolo"/>
 *     &lt;enumeration value="pascolo arborato"/>
 *     &lt;enumeration value="pascolo cespugliato"/>
 *     &lt;enumeration value="giardino"/>
 *     &lt;enumeration value="orto"/>
 *     &lt;enumeration value="orto irriguo"/>
 *     &lt;enumeration value="agrumeto"/>
 *     &lt;enumeration value="vigneto"/>
 *     &lt;enumeration value="uliveto"/>
 *     &lt;enumeration value="frutteto"/>
 *     &lt;enumeration value="gelseto"/>
 *     &lt;enumeration value="colture speciali"/>
 *     &lt;enumeration value="castagneto da frutto"/>
 *     &lt;enumeration value="canneto"/>
 *     &lt;enumeration value="bosco alto fusto"/>
 *     &lt;enumeration value="bosco ceduo"/>
 *     &lt;enumeration value="bosco misto"/>
 *     &lt;enumeration value="incolto produttivo"/>
 *     &lt;enumeration value="incolto sterile"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "terrainType")
@XmlEnum
public enum TerrainType {

    @XmlEnumValue("seminativo")
    SEMINATIVO("seminativo"),
    @XmlEnumValue("seminativo irriguo")
    SEMINATIVO_IRRIGUO("seminativo irriguo"),
    @XmlEnumValue("seminativo arborato")
    SEMINATIVO_ARBORATO("seminativo arborato"),
    @XmlEnumValue("seminativo arborato irriguo")
    SEMINATIVO_ARBORATO_IRRIGUO("seminativo arborato irriguo"),
    @XmlEnumValue("prato")
    PRATO("prato"),
    @XmlEnumValue("prato irriguo")
    PRATO_IRRIGUO("prato irriguo"),
    @XmlEnumValue("prato arborato")
    PRATO_ARBORATO("prato arborato"),
    @XmlEnumValue("prato a marcita")
    PRATO_A_MARCITA("prato a marcita"),
    @XmlEnumValue("risaia stabile")
    RISAIA_STABILE("risaia stabile"),
    @XmlEnumValue("pascolo")
    PASCOLO("pascolo"),
    @XmlEnumValue("pascolo arborato")
    PASCOLO_ARBORATO("pascolo arborato"),
    @XmlEnumValue("pascolo cespugliato")
    PASCOLO_CESPUGLIATO("pascolo cespugliato"),
    @XmlEnumValue("giardino")
    GIARDINO("giardino"),
    @XmlEnumValue("orto")
    ORTO("orto"),
    @XmlEnumValue("orto irriguo")
    ORTO_IRRIGUO("orto irriguo"),
    @XmlEnumValue("agrumeto")
    AGRUMETO("agrumeto"),
    @XmlEnumValue("vigneto")
    VIGNETO("vigneto"),
    @XmlEnumValue("uliveto")
    ULIVETO("uliveto"),
    @XmlEnumValue("frutteto")
    FRUTTETO("frutteto"),
    @XmlEnumValue("gelseto")
    GELSETO("gelseto"),
    @XmlEnumValue("colture speciali")
    COLTURE_SPECIALI("colture speciali"),
    @XmlEnumValue("castagneto da frutto")
    CASTAGNETO_DA_FRUTTO("castagneto da frutto"),
    @XmlEnumValue("canneto")
    CANNETO("canneto"),
    @XmlEnumValue("bosco alto fusto")
    BOSCO_ALTO_FUSTO("bosco alto fusto"),
    @XmlEnumValue("bosco ceduo")
    BOSCO_CEDUO("bosco ceduo"),
    @XmlEnumValue("bosco misto")
    BOSCO_MISTO("bosco misto"),
    @XmlEnumValue("incolto produttivo")
    INCOLTO_PRODUTTIVO("incolto produttivo"),
    @XmlEnumValue("incolto sterile")
    INCOLTO_STERILE("incolto sterile");
    private final String value;

    TerrainType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TerrainType fromValue(String v) {
        for (TerrainType c: TerrainType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
