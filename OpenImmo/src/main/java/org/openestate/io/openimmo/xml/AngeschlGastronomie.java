
package org.openestate.io.openimmo.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * Java class for &lt;angeschl_gastronomie&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "angeschl_gastronomie")
public class AngeschlGastronomie
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "HOTELRESTAURANT")
    protected Boolean hotelrestaurant;
    @XmlAttribute(name = "BAR")
    protected Boolean bar;

    /**
     * Gets the value of the hotelrestaurant property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHOTELRESTAURANT() {
        return hotelrestaurant;
    }

    /**
     * Sets the value of the hotelrestaurant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHOTELRESTAURANT(Boolean value) {
        this.hotelrestaurant = value;
    }

    /**
     * Gets the value of the bar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBAR() {
        return bar;
    }

    /**
     * Sets the value of the bar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBAR(Boolean value) {
        this.bar = value;
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
            Boolean theHOTELRESTAURANT;
            theHOTELRESTAURANT = this.isHOTELRESTAURANT();
            strategy.appendField(locator, this, "hotelrestaurant", buffer, theHOTELRESTAURANT);
        }
        {
            Boolean theBAR;
            theBAR = this.isBAR();
            strategy.appendField(locator, this, "bar", buffer, theBAR);
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
        if (draftCopy instanceof AngeschlGastronomie) {
            final AngeschlGastronomie copy = ((AngeschlGastronomie) draftCopy);
            if (this.hotelrestaurant!= null) {
                Boolean sourceHOTELRESTAURANT;
                sourceHOTELRESTAURANT = this.isHOTELRESTAURANT();
                Boolean copyHOTELRESTAURANT = ((Boolean) strategy.copy(LocatorUtils.property(locator, "hotelrestaurant", sourceHOTELRESTAURANT), sourceHOTELRESTAURANT));
                copy.setHOTELRESTAURANT(copyHOTELRESTAURANT);
            } else {
                copy.hotelrestaurant = null;
            }
            if (this.bar!= null) {
                Boolean sourceBAR;
                sourceBAR = this.isBAR();
                Boolean copyBAR = ((Boolean) strategy.copy(LocatorUtils.property(locator, "bar", sourceBAR), sourceBAR));
                copy.setBAR(copyBAR);
            } else {
                copy.bar = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new AngeschlGastronomie();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AngeschlGastronomie)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AngeschlGastronomie that = ((AngeschlGastronomie) object);
        {
            Boolean lhsHOTELRESTAURANT;
            lhsHOTELRESTAURANT = this.isHOTELRESTAURANT();
            Boolean rhsHOTELRESTAURANT;
            rhsHOTELRESTAURANT = that.isHOTELRESTAURANT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hotelrestaurant", lhsHOTELRESTAURANT), LocatorUtils.property(thatLocator, "hotelrestaurant", rhsHOTELRESTAURANT), lhsHOTELRESTAURANT, rhsHOTELRESTAURANT)) {
                return false;
            }
        }
        {
            Boolean lhsBAR;
            lhsBAR = this.isBAR();
            Boolean rhsBAR;
            rhsBAR = that.isBAR();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bar", lhsBAR), LocatorUtils.property(thatLocator, "bar", rhsBAR), lhsBAR, rhsBAR)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
