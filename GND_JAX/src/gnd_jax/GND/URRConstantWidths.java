//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.27 at 11:31:49 AM PDT 
//


package gnd_jax.GND;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for URR_constantWidths complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="URR_constantWidths">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="neutronWidth" type="{}PhysicalQuantityAttribute" />
 *       &lt;attribute name="captureWidth" type="{}PhysicalQuantityAttribute" />
 *       &lt;attribute name="fissionWidthA" type="{}PhysicalQuantityAttribute" />
 *       &lt;attribute name="levelSpacing" type="{}PhysicalQuantityAttribute" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "URR_constantWidths")
public class URRConstantWidths {

    @XmlAttribute(name = "neutronWidth")
    protected String neutronWidth;
    @XmlAttribute(name = "captureWidth")
    protected String captureWidth;
    @XmlAttribute(name = "fissionWidthA")
    protected String fissionWidthA;
    @XmlAttribute(name = "levelSpacing")
    protected String levelSpacing;

    /**
     * Gets the value of the neutronWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeutronWidth() {
        return neutronWidth;
    }

    /**
     * Sets the value of the neutronWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeutronWidth(String value) {
        this.neutronWidth = value;
    }

    /**
     * Gets the value of the captureWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptureWidth() {
        return captureWidth;
    }

    /**
     * Sets the value of the captureWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptureWidth(String value) {
        this.captureWidth = value;
    }

    /**
     * Gets the value of the fissionWidthA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFissionWidthA() {
        return fissionWidthA;
    }

    /**
     * Sets the value of the fissionWidthA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFissionWidthA(String value) {
        this.fissionWidthA = value;
    }

    /**
     * Gets the value of the levelSpacing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelSpacing() {
        return levelSpacing;
    }

    /**
     * Sets the value of the levelSpacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelSpacing(String value) {
        this.levelSpacing = value;
    }

}
