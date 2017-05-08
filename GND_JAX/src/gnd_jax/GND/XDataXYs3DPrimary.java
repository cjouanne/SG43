//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.27 at 11:31:49 AM PDT 
//


package gnd_jax.GND;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xData_XYs3d_primary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xData_XYs3d_primary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="axes" type="{}axes"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="XYs2d" type="{}xData_XYs2d"/>
 *           &lt;element name="regions2d" type="{}xData_regions_2d"/>
 *         &lt;/choice>
 *         &lt;element name="uncertainties" type="{}xData_uncertanties" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="interpolationQualifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xData_XYs3d_primary", propOrder = {
    "axes",
    "xYs2DOrRegions2D",
    "uncertainties"
})
public class XDataXYs3DPrimary {

    @XmlElement(required = true)
    protected Axes axes;
    @XmlElements({
        @XmlElement(name = "XYs2d", type = XDataXYs2D.class),
        @XmlElement(name = "regions2d", type = XDataRegions2D.class)
    })
    protected List<Object> xYs2DOrRegions2D;
    protected XDataUncertanties uncertainties;
    @XmlAttribute(name = "label")
    protected String label;
    @XmlAttribute(name = "interpolationQualifier")
    protected String interpolationQualifier;

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
     * Gets the value of the xYs2DOrRegions2D property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xYs2DOrRegions2D property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXYs2DOrRegions2D().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XDataXYs2D }
     * {@link XDataRegions2D }
     * 
     * 
     */
    public List<Object> getXYs2DOrRegions2D() {
        if (xYs2DOrRegions2D == null) {
            xYs2DOrRegions2D = new ArrayList<Object>();
        }
        return this.xYs2DOrRegions2D;
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
     * Gets the value of the interpolationQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterpolationQualifier() {
        return interpolationQualifier;
    }

    /**
     * Sets the value of the interpolationQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterpolationQualifier(String value) {
        this.interpolationQualifier = value;
    }

}
