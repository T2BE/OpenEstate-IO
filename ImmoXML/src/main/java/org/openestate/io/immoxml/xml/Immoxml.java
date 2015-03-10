
package org.openestate.io.immoxml.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * Java class for &lt;immoxml&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "uebertragung",
    "anbieter",
    "userDefinedSimplefield",
    "userDefinedAnyfield"
})
@XmlRootElement(name = "immoxml")
public class Immoxml
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    protected Uebertragung uebertragung;
    @XmlElement(required = true)
    protected List<Anbieter> anbieter;
    @XmlElement(name = "user_defined_simplefield")
    protected List<UserDefinedSimplefield> userDefinedSimplefield;
    @XmlElement(name = "user_defined_anyfield")
    protected List<UserDefinedAnyfield> userDefinedAnyfield;

    /**
     * Gets the value of the uebertragung property.
     * 
     * @return
     *     possible object is
     *     {@link Uebertragung }
     *     
     */
    public Uebertragung getUebertragung() {
        return uebertragung;
    }

    /**
     * Sets the value of the uebertragung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uebertragung }
     *     
     */
    public void setUebertragung(Uebertragung value) {
        this.uebertragung = value;
    }

    /**
     * Gets the value of the anbieter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anbieter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnbieter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Anbieter }
     * 
     * 
     */
    public List<Anbieter> getAnbieter() {
        if (anbieter == null) {
            anbieter = new ArrayList<Anbieter>();
        }
        return this.anbieter;
    }

    /**
     * Gets the value of the userDefinedSimplefield property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userDefinedSimplefield property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserDefinedSimplefield().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDefinedSimplefield }
     * 
     * 
     */
    public List<UserDefinedSimplefield> getUserDefinedSimplefield() {
        if (userDefinedSimplefield == null) {
            userDefinedSimplefield = new ArrayList<UserDefinedSimplefield>();
        }
        return this.userDefinedSimplefield;
    }

    /**
     * Gets the value of the userDefinedAnyfield property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userDefinedAnyfield property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserDefinedAnyfield().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDefinedAnyfield }
     * 
     * 
     */
    public List<UserDefinedAnyfield> getUserDefinedAnyfield() {
        if (userDefinedAnyfield == null) {
            userDefinedAnyfield = new ArrayList<UserDefinedAnyfield>();
        }
        return this.userDefinedAnyfield;
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
            Uebertragung theUebertragung;
            theUebertragung = this.getUebertragung();
            strategy.appendField(locator, this, "uebertragung", buffer, theUebertragung);
        }
        {
            List<Anbieter> theAnbieter;
            theAnbieter = (((this.anbieter!= null)&&(!this.anbieter.isEmpty()))?this.getAnbieter():null);
            strategy.appendField(locator, this, "anbieter", buffer, theAnbieter);
        }
        {
            List<UserDefinedSimplefield> theUserDefinedSimplefield;
            theUserDefinedSimplefield = (((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty()))?this.getUserDefinedSimplefield():null);
            strategy.appendField(locator, this, "userDefinedSimplefield", buffer, theUserDefinedSimplefield);
        }
        {
            List<UserDefinedAnyfield> theUserDefinedAnyfield;
            theUserDefinedAnyfield = (((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty()))?this.getUserDefinedAnyfield():null);
            strategy.appendField(locator, this, "userDefinedAnyfield", buffer, theUserDefinedAnyfield);
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
        if (draftCopy instanceof Immoxml) {
            final Immoxml copy = ((Immoxml) draftCopy);
            if (this.uebertragung!= null) {
                Uebertragung sourceUebertragung;
                sourceUebertragung = this.getUebertragung();
                Uebertragung copyUebertragung = ((Uebertragung) strategy.copy(LocatorUtils.property(locator, "uebertragung", sourceUebertragung), sourceUebertragung));
                copy.setUebertragung(copyUebertragung);
            } else {
                copy.uebertragung = null;
            }
            if ((this.anbieter!= null)&&(!this.anbieter.isEmpty())) {
                List<Anbieter> sourceAnbieter;
                sourceAnbieter = (((this.anbieter!= null)&&(!this.anbieter.isEmpty()))?this.getAnbieter():null);
                @SuppressWarnings("unchecked")
                List<Anbieter> copyAnbieter = ((List<Anbieter> ) strategy.copy(LocatorUtils.property(locator, "anbieter", sourceAnbieter), sourceAnbieter));
                copy.anbieter = null;
                if (copyAnbieter!= null) {
                    List<Anbieter> uniqueAnbieterl = copy.getAnbieter();
                    uniqueAnbieterl.addAll(copyAnbieter);
                }
            } else {
                copy.anbieter = null;
            }
            if ((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty())) {
                List<UserDefinedSimplefield> sourceUserDefinedSimplefield;
                sourceUserDefinedSimplefield = (((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty()))?this.getUserDefinedSimplefield():null);
                @SuppressWarnings("unchecked")
                List<UserDefinedSimplefield> copyUserDefinedSimplefield = ((List<UserDefinedSimplefield> ) strategy.copy(LocatorUtils.property(locator, "userDefinedSimplefield", sourceUserDefinedSimplefield), sourceUserDefinedSimplefield));
                copy.userDefinedSimplefield = null;
                if (copyUserDefinedSimplefield!= null) {
                    List<UserDefinedSimplefield> uniqueUserDefinedSimplefieldl = copy.getUserDefinedSimplefield();
                    uniqueUserDefinedSimplefieldl.addAll(copyUserDefinedSimplefield);
                }
            } else {
                copy.userDefinedSimplefield = null;
            }
            if ((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty())) {
                List<UserDefinedAnyfield> sourceUserDefinedAnyfield;
                sourceUserDefinedAnyfield = (((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty()))?this.getUserDefinedAnyfield():null);
                @SuppressWarnings("unchecked")
                List<UserDefinedAnyfield> copyUserDefinedAnyfield = ((List<UserDefinedAnyfield> ) strategy.copy(LocatorUtils.property(locator, "userDefinedAnyfield", sourceUserDefinedAnyfield), sourceUserDefinedAnyfield));
                copy.userDefinedAnyfield = null;
                if (copyUserDefinedAnyfield!= null) {
                    List<UserDefinedAnyfield> uniqueUserDefinedAnyfieldl = copy.getUserDefinedAnyfield();
                    uniqueUserDefinedAnyfieldl.addAll(copyUserDefinedAnyfield);
                }
            } else {
                copy.userDefinedAnyfield = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Immoxml();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Immoxml)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Immoxml that = ((Immoxml) object);
        {
            Uebertragung lhsUebertragung;
            lhsUebertragung = this.getUebertragung();
            Uebertragung rhsUebertragung;
            rhsUebertragung = that.getUebertragung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uebertragung", lhsUebertragung), LocatorUtils.property(thatLocator, "uebertragung", rhsUebertragung), lhsUebertragung, rhsUebertragung)) {
                return false;
            }
        }
        {
            List<Anbieter> lhsAnbieter;
            lhsAnbieter = (((this.anbieter!= null)&&(!this.anbieter.isEmpty()))?this.getAnbieter():null);
            List<Anbieter> rhsAnbieter;
            rhsAnbieter = (((that.anbieter!= null)&&(!that.anbieter.isEmpty()))?that.getAnbieter():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anbieter", lhsAnbieter), LocatorUtils.property(thatLocator, "anbieter", rhsAnbieter), lhsAnbieter, rhsAnbieter)) {
                return false;
            }
        }
        {
            List<UserDefinedSimplefield> lhsUserDefinedSimplefield;
            lhsUserDefinedSimplefield = (((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty()))?this.getUserDefinedSimplefield():null);
            List<UserDefinedSimplefield> rhsUserDefinedSimplefield;
            rhsUserDefinedSimplefield = (((that.userDefinedSimplefield!= null)&&(!that.userDefinedSimplefield.isEmpty()))?that.getUserDefinedSimplefield():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userDefinedSimplefield", lhsUserDefinedSimplefield), LocatorUtils.property(thatLocator, "userDefinedSimplefield", rhsUserDefinedSimplefield), lhsUserDefinedSimplefield, rhsUserDefinedSimplefield)) {
                return false;
            }
        }
        {
            List<UserDefinedAnyfield> lhsUserDefinedAnyfield;
            lhsUserDefinedAnyfield = (((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty()))?this.getUserDefinedAnyfield():null);
            List<UserDefinedAnyfield> rhsUserDefinedAnyfield;
            rhsUserDefinedAnyfield = (((that.userDefinedAnyfield!= null)&&(!that.userDefinedAnyfield.isEmpty()))?that.getUserDefinedAnyfield():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userDefinedAnyfield", lhsUserDefinedAnyfield), LocatorUtils.property(thatLocator, "userDefinedAnyfield", rhsUserDefinedAnyfield), lhsUserDefinedAnyfield, rhsUserDefinedAnyfield)) {
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
