//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.27 at 11:31:49 AM PDT 
//


package gnd_jax.GND;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for resolved complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resolved">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="SingleLevel_BreitWigner" type="{}SingleLevel_BreitWigner"/>
 *         &lt;element name="MultiLevel_BreitWigner" type="{}MultiLevel_BreitWigner"/>
 *         &lt;element name="Reich_Moore" type="{}Reich_Moore"/>
 *         &lt;element name="R_Matrix_Limited" type="{}R_Matrix_Limited"/>
 *         &lt;element name="region" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="SingleLevel_BreitWigner" type="{}SingleLevel_BreitWigner"/>
 *                   &lt;element name="MultiLevel_BreitWigner" type="{}MultiLevel_BreitWigner"/>
 *                   &lt;element name="Reich_Moore" type="{}Reich_Moore"/>
 *                   &lt;element name="R_Matrix_Limited" type="{}R_Matrix_Limited"/>
 *                 &lt;/choice>
 *                 &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="domainMin" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="domainMax" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="domainUnit" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="formalism" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *       &lt;attribute name="multipleRegions" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="domainMin" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="domainMax" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="domainUnit" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="reconstructCrossSection" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="formalism" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resolved", propOrder = {
    "singleLevelBreitWigner",
    "multiLevelBreitWigner",
    "reichMoore",
    "rMatrixLimited",
    "region"
})
public class Resolved {

    @XmlElement(name = "SingleLevel_BreitWigner")
    protected SingleLevelBreitWigner singleLevelBreitWigner;
    @XmlElement(name = "MultiLevel_BreitWigner")
    protected MultiLevelBreitWigner multiLevelBreitWigner;
    @XmlElement(name = "Reich_Moore")
    protected ReichMoore reichMoore;
    @XmlElement(name = "R_Matrix_Limited")
    protected RMatrixLimited rMatrixLimited;
    protected List<Resolved.Region> region;
    @XmlAttribute(name = "multipleRegions")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String multipleRegions;
    @XmlAttribute(name = "domainMin", required = true)
    protected double domainMin;
    @XmlAttribute(name = "domainMax", required = true)
    protected double domainMax;
    @XmlAttribute(name = "domainUnit", required = true)
    protected String domainUnit;
    @XmlAttribute(name = "reconstructCrossSection")
    protected Boolean reconstructCrossSection;
    @XmlAttribute(name = "formalism")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String formalism;

    /**
     * Gets the value of the singleLevelBreitWigner property.
     * 
     * @return
     *     possible object is
     *     {@link SingleLevelBreitWigner }
     *     
     */
    public SingleLevelBreitWigner getSingleLevelBreitWigner() {
        return singleLevelBreitWigner;
    }

    /**
     * Sets the value of the singleLevelBreitWigner property.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleLevelBreitWigner }
     *     
     */
    public void setSingleLevelBreitWigner(SingleLevelBreitWigner value) {
        this.singleLevelBreitWigner = value;
    }

    /**
     * Gets the value of the multiLevelBreitWigner property.
     * 
     * @return
     *     possible object is
     *     {@link MultiLevelBreitWigner }
     *     
     */
    public MultiLevelBreitWigner getMultiLevelBreitWigner() {
        return multiLevelBreitWigner;
    }

    /**
     * Sets the value of the multiLevelBreitWigner property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLevelBreitWigner }
     *     
     */
    public void setMultiLevelBreitWigner(MultiLevelBreitWigner value) {
        this.multiLevelBreitWigner = value;
    }

    /**
     * Gets the value of the reichMoore property.
     * 
     * @return
     *     possible object is
     *     {@link ReichMoore }
     *     
     */
    public ReichMoore getReichMoore() {
        return reichMoore;
    }

    /**
     * Sets the value of the reichMoore property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReichMoore }
     *     
     */
    public void setReichMoore(ReichMoore value) {
        this.reichMoore = value;
    }

    /**
     * Gets the value of the rMatrixLimited property.
     * 
     * @return
     *     possible object is
     *     {@link RMatrixLimited }
     *     
     */
    public RMatrixLimited getRMatrixLimited() {
        return rMatrixLimited;
    }

    /**
     * Sets the value of the rMatrixLimited property.
     * 
     * @param value
     *     allowed object is
     *     {@link RMatrixLimited }
     *     
     */
    public void setRMatrixLimited(RMatrixLimited value) {
        this.rMatrixLimited = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the region property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Resolved.Region }
     * 
     * 
     */
    public List<Resolved.Region> getRegion() {
        if (region == null) {
            region = new ArrayList<Resolved.Region>();
        }
        return this.region;
    }

    /**
     * Gets the value of the multipleRegions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultipleRegions() {
        return multipleRegions;
    }

    /**
     * Sets the value of the multipleRegions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultipleRegions(String value) {
        this.multipleRegions = value;
    }

    /**
     * Gets the value of the domainMin property.
     * 
     */
    public double getDomainMin() {
        return domainMin;
    }

    /**
     * Sets the value of the domainMin property.
     * 
     */
    public void setDomainMin(double value) {
        this.domainMin = value;
    }

    /**
     * Gets the value of the domainMax property.
     * 
     */
    public double getDomainMax() {
        return domainMax;
    }

    /**
     * Sets the value of the domainMax property.
     * 
     */
    public void setDomainMax(double value) {
        this.domainMax = value;
    }

    /**
     * Gets the value of the domainUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainUnit() {
        return domainUnit;
    }

    /**
     * Sets the value of the domainUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainUnit(String value) {
        this.domainUnit = value;
    }

    /**
     * Gets the value of the reconstructCrossSection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReconstructCrossSection() {
        return reconstructCrossSection;
    }

    /**
     * Sets the value of the reconstructCrossSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReconstructCrossSection(Boolean value) {
        this.reconstructCrossSection = value;
    }

    /**
     * Gets the value of the formalism property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormalism() {
        return formalism;
    }

    /**
     * Sets the value of the formalism property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormalism(String value) {
        this.formalism = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="SingleLevel_BreitWigner" type="{}SingleLevel_BreitWigner"/>
     *         &lt;element name="MultiLevel_BreitWigner" type="{}MultiLevel_BreitWigner"/>
     *         &lt;element name="Reich_Moore" type="{}Reich_Moore"/>
     *         &lt;element name="R_Matrix_Limited" type="{}R_Matrix_Limited"/>
     *       &lt;/choice>
     *       &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="domainMin" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="domainMax" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="domainUnit" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="formalism" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "singleLevelBreitWigner",
        "multiLevelBreitWigner",
        "reichMoore",
        "rMatrixLimited"
    })
    public static class Region {

        @XmlElement(name = "SingleLevel_BreitWigner")
        protected SingleLevelBreitWigner singleLevelBreitWigner;
        @XmlElement(name = "MultiLevel_BreitWigner")
        protected MultiLevelBreitWigner multiLevelBreitWigner;
        @XmlElement(name = "Reich_Moore")
        protected ReichMoore reichMoore;
        @XmlElement(name = "R_Matrix_Limited")
        protected RMatrixLimited rMatrixLimited;
        @XmlAttribute(name = "index", required = true)
        protected BigInteger index;
        @XmlAttribute(name = "domainMin", required = true)
        protected double domainMin;
        @XmlAttribute(name = "domainMax", required = true)
        protected double domainMax;
        @XmlAttribute(name = "domainUnit", required = true)
        protected String domainUnit;
        @XmlAttribute(name = "formalism", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String formalism;

        /**
         * Gets the value of the singleLevelBreitWigner property.
         * 
         * @return
         *     possible object is
         *     {@link SingleLevelBreitWigner }
         *     
         */
        public SingleLevelBreitWigner getSingleLevelBreitWigner() {
            return singleLevelBreitWigner;
        }

        /**
         * Sets the value of the singleLevelBreitWigner property.
         * 
         * @param value
         *     allowed object is
         *     {@link SingleLevelBreitWigner }
         *     
         */
        public void setSingleLevelBreitWigner(SingleLevelBreitWigner value) {
            this.singleLevelBreitWigner = value;
        }

        /**
         * Gets the value of the multiLevelBreitWigner property.
         * 
         * @return
         *     possible object is
         *     {@link MultiLevelBreitWigner }
         *     
         */
        public MultiLevelBreitWigner getMultiLevelBreitWigner() {
            return multiLevelBreitWigner;
        }

        /**
         * Sets the value of the multiLevelBreitWigner property.
         * 
         * @param value
         *     allowed object is
         *     {@link MultiLevelBreitWigner }
         *     
         */
        public void setMultiLevelBreitWigner(MultiLevelBreitWigner value) {
            this.multiLevelBreitWigner = value;
        }

        /**
         * Gets the value of the reichMoore property.
         * 
         * @return
         *     possible object is
         *     {@link ReichMoore }
         *     
         */
        public ReichMoore getReichMoore() {
            return reichMoore;
        }

        /**
         * Sets the value of the reichMoore property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReichMoore }
         *     
         */
        public void setReichMoore(ReichMoore value) {
            this.reichMoore = value;
        }

        /**
         * Gets the value of the rMatrixLimited property.
         * 
         * @return
         *     possible object is
         *     {@link RMatrixLimited }
         *     
         */
        public RMatrixLimited getRMatrixLimited() {
            return rMatrixLimited;
        }

        /**
         * Sets the value of the rMatrixLimited property.
         * 
         * @param value
         *     allowed object is
         *     {@link RMatrixLimited }
         *     
         */
        public void setRMatrixLimited(RMatrixLimited value) {
            this.rMatrixLimited = value;
        }

        /**
         * Gets the value of the index property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIndex() {
            return index;
        }

        /**
         * Sets the value of the index property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIndex(BigInteger value) {
            this.index = value;
        }

        /**
         * Gets the value of the domainMin property.
         * 
         */
        public double getDomainMin() {
            return domainMin;
        }

        /**
         * Sets the value of the domainMin property.
         * 
         */
        public void setDomainMin(double value) {
            this.domainMin = value;
        }

        /**
         * Gets the value of the domainMax property.
         * 
         */
        public double getDomainMax() {
            return domainMax;
        }

        /**
         * Sets the value of the domainMax property.
         * 
         */
        public void setDomainMax(double value) {
            this.domainMax = value;
        }

        /**
         * Gets the value of the domainUnit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDomainUnit() {
            return domainUnit;
        }

        /**
         * Sets the value of the domainUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDomainUnit(String value) {
            this.domainUnit = value;
        }

        /**
         * Gets the value of the formalism property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFormalism() {
            return formalism;
        }

        /**
         * Sets the value of the formalism property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFormalism(String value) {
            this.formalism = value;
        }

    }

}
