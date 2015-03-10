
package org.openestate.io.openimmo.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Java class for &lt;hallen_lager_prod&gt; element.
 *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "hallen_lager_prod")
public class HallenLagerProd
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "hallen_typ")
    protected HallenLagerProd.HallenTyp hallenTyp;

    /**
     * Gets the value of the hallenTyp property.
     *
     * @return
     *     possible object is
     *     {@link HallenLagerProd.HallenTyp }
     *
     */
    public HallenLagerProd.HallenTyp getHallenTyp() {
        return hallenTyp;
    }

    /**
     * Sets the value of the hallenTyp property.
     *
     * @param value
     *     allowed object is
     *     {@link HallenLagerProd.HallenTyp }
     *
     */
    public void setHallenTyp(HallenLagerProd.HallenTyp value) {
        this.hallenTyp = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            HallenLagerProd.HallenTyp theHallenTyp;
            theHallenTyp = this.getHallenTyp();
            strategy.appendField(locator, this, "hallenTyp", buffer, theHallenTyp);
        }
        return buffer;
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof HallenLagerProd) {
            final HallenLagerProd copy = ((HallenLagerProd) draftCopy);
            if (this.hallenTyp!= null) {
                HallenLagerProd.HallenTyp sourceHallenTyp;
                sourceHallenTyp = this.getHallenTyp();
                HallenLagerProd.HallenTyp copyHallenTyp = ((HallenLagerProd.HallenTyp) strategy.copy(LocatorUtils.property(locator, "hallenTyp", sourceHallenTyp), sourceHallenTyp));
                copy.setHallenTyp(copyHallenTyp);
            } else {
                copy.hallenTyp = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new HallenLagerProd();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof HallenLagerProd)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final HallenLagerProd that = ((HallenLagerProd) object);
        {
            HallenLagerProd.HallenTyp lhsHallenTyp;
            lhsHallenTyp = this.getHallenTyp();
            HallenLagerProd.HallenTyp rhsHallenTyp;
            rhsHallenTyp = that.getHallenTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hallenTyp", lhsHallenTyp), LocatorUtils.property(thatLocator, "hallenTyp", rhsHallenTyp), lhsHallenTyp, rhsHallenTyp)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }


    /**
     * Java enum for <em>hallen_typ</em> attribute in &lt;hallen_lager_prod&gt; elements.

     */
    @XmlType(name = "")
    @XmlEnum
    public enum HallenTyp {

        HALLE,
        INDUSTRIEHALLE,
        LAGER,
        LAGERFLAECHEN,
        LAGER_MIT_FREIFLAECHE,
        HOCHREGALLAGER,
        SPEDITIONSLAGER,
        PRODUKTION,
        WERKSTATT,
        SERVICE,
        FREIFLAECHEN,
        KUEHLHAUS;

        public String value() {
            return name();
        }

        public static HallenLagerProd.HallenTyp fromValue(String v) {
            return valueOf(v);
        }

    }

}