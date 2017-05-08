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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for xData_XYs1d_primary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xData_XYs1d_primary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="axes" type="{}axes"/>
 *         &lt;element name="values" type="{}xData_values"/>
 *         &lt;element name="uncertainties" type="{}xData_uncertanties" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="interpolation" type="{}interpolation" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xData_XYs1d_primary", propOrder = {
    "axes",
    "values",
    "uncertainties"
})
public class XDataXYs1DPrimary {

    @XmlElement(required = true)
    protected Axes axes;
    @XmlElement(required = true)
    protected XDataValues values;
    protected XDataUncertanties uncertainties;
    @XmlAttribute(name = "label")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String label;
    @XmlAttribute(name = "interpolation")
    protected Interpolation interpolation;

    /**
     * Gets the value of the axes property.
     * 
     * @return
     *     possible object is
     *     {@link Axes }
     *     
     */
    public Axes getAxes() {
        return axes;
    }

    /**
     * Sets the value of the axes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Axes }
     *     
     */
    public void setAxes(Axes value) {
        this.axes = value;
    }

    /**
     * Gets the value of the values property.
     * 
     * @return
     *     possible object is
     *     {@link XDataValues }
     *     
     */
    public XDataValues getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDataValues }
     *     
     */
    public void setValues(XDataValues value) {
        this.values = value;
    }

    /**
     * Gets the value of the uncertainties property.
     * 
     * @return
     *     possible object is
     *     {@link XDataUncertanties }
     *     
     */
    public XDataUncertanties getUncertainties() {
        return uncertainties;
    }

    /**
     * Sets the value of the uncertainties property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDataUncertanties }
     *     
     */
    public void setUncertainties(XDataUncertanties value) {
        this.uncertainties = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the interpolation property.
     * 
     * @return
     *     possible object is
     *     {@link Interpolation }
     *     
     */
    public Interpolation getInterpolation() {
        return interpolation;
    }

    /**
     * Sets the value of the interpolation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Interpolation }
     *     
     */
    public void setInterpolation(Interpolation value) {
        this.interpolation = value;
    }

}
