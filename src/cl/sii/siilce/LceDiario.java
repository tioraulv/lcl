//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.24 at 09:18:21 PM CLST 
//


package cl.sii.siilce;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sii.cl/SiiLce}LceDiarioRes"/>
 *         &lt;element name="ValorApertura" type="{http://www.sii.cl/SiiLce}MontoType" minOccurs="0"/>
 *         &lt;element name="Comprobante" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TpoComp">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                         &lt;maxLength value="4"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="NumComp">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                         &lt;maxLength value="18"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="FechaContable" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="GlosaAnalisis" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="120"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Movimientos" maxOccurs="unbounded" minOccurs="2">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CodigoCuenta" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                             &lt;element name="Rut" type="{http://www.sii.cl/SiiLce}RUTType" minOccurs="0"/>
 *                             &lt;element name="Nombre" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="120"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="TpoDocum" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="60"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Numero" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
 *                                   &lt;totalDigits value="18"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="FchEmision" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="FchVencimiento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="GlosaRef" maxOccurs="4" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Glosa">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="30"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="Ref">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="20"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;choice>
 *                               &lt;element name="Debe" type="{http://www.sii.cl/SiiLce}MontoType" minOccurs="0"/>
 *                               &lt;element name="Haber" type="{http://www.sii.cl/SiiLce}MontoType" minOccurs="0"/>
 *                             &lt;/choice>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ValorComprobante" type="{http://www.sii.cl/SiiLce}MontoType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" fixed="1.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lceDiarioRes",
    "valorApertura",
    "comprobante"
})
@XmlRootElement(name = "LceDiario")
public class LceDiario {

    @XmlElement(name = "LceDiarioRes", required = true)
    protected LceDiarioRes lceDiarioRes;
    @XmlElement(name = "ValorApertura")
    protected BigDecimal valorApertura;
    @XmlElement(name = "Comprobante")
    protected List<LceDiario.Comprobante> comprobante;
    @XmlAttribute(required = true)
    protected BigDecimal version;

    /**
     * Gets the value of the lceDiarioRes property.
     * 
     * @return
     *     possible object is
     *     {@link LceDiarioRes }
     *     
     */
    public LceDiarioRes getLceDiarioRes() {
        return lceDiarioRes;
    }

    /**
     * Sets the value of the lceDiarioRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link LceDiarioRes }
     *     
     */
    public void setLceDiarioRes(LceDiarioRes value) {
        this.lceDiarioRes = value;
    }

    /**
     * Gets the value of the valorApertura property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorApertura() {
        return valorApertura;
    }

    /**
     * Sets the value of the valorApertura property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorApertura(BigDecimal value) {
        this.valorApertura = value;
    }

    /**
     * Gets the value of the comprobante property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comprobante property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComprobante().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LceDiario.Comprobante }
     * 
     * 
     */
    public List<LceDiario.Comprobante> getComprobante() {
        if (comprobante == null) {
            comprobante = new ArrayList<LceDiario.Comprobante>();
        }
        return this.comprobante;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVersion() {
        if (version == null) {
            return new BigDecimal("1.0");
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVersion(BigDecimal value) {
        this.version = value;
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
     *       &lt;sequence>
     *         &lt;element name="TpoComp">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *               &lt;maxLength value="4"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="NumComp">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *               &lt;maxLength value="18"/>
     *               &lt;minLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="FechaContable" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="GlosaAnalisis" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="120"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Movimientos" maxOccurs="unbounded" minOccurs="2">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CodigoCuenta" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                   &lt;element name="Rut" type="{http://www.sii.cl/SiiLce}RUTType" minOccurs="0"/>
     *                   &lt;element name="Nombre" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="120"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="TpoDocum" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="60"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Numero" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
     *                         &lt;totalDigits value="18"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="FchEmision" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="FchVencimiento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="GlosaRef" maxOccurs="4" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Glosa">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="30"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="Ref">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="20"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;choice>
     *                     &lt;element name="Debe" type="{http://www.sii.cl/SiiLce}MontoType" minOccurs="0"/>
     *                     &lt;element name="Haber" type="{http://www.sii.cl/SiiLce}MontoType" minOccurs="0"/>
     *                   &lt;/choice>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ValorComprobante" type="{http://www.sii.cl/SiiLce}MontoType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tpoComp",
        "numComp",
        "fechaContable",
        "glosaAnalisis",
        "movimientos",
        "valorComprobante"
    })
    public static class Comprobante {

        @XmlElement(name = "TpoComp", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String tpoComp;
        @XmlElement(name = "NumComp", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String numComp;
        @XmlElement(name = "FechaContable", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar fechaContable;
        @XmlElement(name = "GlosaAnalisis")
        protected String glosaAnalisis;
        @XmlElement(name = "Movimientos", required = true)
        protected List<LceDiario.Comprobante.Movimientos> movimientos;
        @XmlElement(name = "ValorComprobante", required = true)
        protected BigDecimal valorComprobante;

        /**
         * Gets the value of the tpoComp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTpoComp() {
            return tpoComp;
        }

        /**
         * Sets the value of the tpoComp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTpoComp(String value) {
            this.tpoComp = value;
        }

        /**
         * Gets the value of the numComp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumComp() {
            return numComp;
        }

        /**
         * Sets the value of the numComp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumComp(String value) {
            this.numComp = value;
        }

        /**
         * Gets the value of the fechaContable property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFechaContable() {
            return fechaContable;
        }

        /**
         * Sets the value of the fechaContable property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaContable(XMLGregorianCalendar value) {
            this.fechaContable = value;
        }

        /**
         * Gets the value of the glosaAnalisis property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGlosaAnalisis() {
            return glosaAnalisis;
        }

        /**
         * Sets the value of the glosaAnalisis property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGlosaAnalisis(String value) {
            this.glosaAnalisis = value;
        }

        /**
         * Gets the value of the movimientos property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the movimientos property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMovimientos().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LceDiario.Comprobante.Movimientos }
         * 
         * 
         */
        public List<LceDiario.Comprobante.Movimientos> getMovimientos() {
            if (movimientos == null) {
                movimientos = new ArrayList<LceDiario.Comprobante.Movimientos>();
            }
            return this.movimientos;
        }

        /**
         * Gets the value of the valorComprobante property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorComprobante() {
            return valorComprobante;
        }

        /**
         * Sets the value of the valorComprobante property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorComprobante(BigDecimal value) {
            this.valorComprobante = value;
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
         *       &lt;sequence>
         *         &lt;element name="CodigoCuenta" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *         &lt;element name="Rut" type="{http://www.sii.cl/SiiLce}RUTType" minOccurs="0"/>
         *         &lt;element name="Nombre" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="120"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="TpoDocum" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="60"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Numero" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
         *               &lt;totalDigits value="18"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="FchEmision" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="FchVencimiento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="GlosaRef" maxOccurs="4" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Glosa">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="30"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="Ref">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="20"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;choice>
         *           &lt;element name="Debe" type="{http://www.sii.cl/SiiLce}MontoType" minOccurs="0"/>
         *           &lt;element name="Haber" type="{http://www.sii.cl/SiiLce}MontoType" minOccurs="0"/>
         *         &lt;/choice>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "codigoCuenta",
            "rut",
            "nombre",
            "tpoDocum",
            "numero",
            "fchEmision",
            "fchVencimiento",
            "glosaRef",
            "debe",
            "haber"
        })
        public static class Movimientos {

            @XmlElement(name = "CodigoCuenta", required = true)
            protected Object codigoCuenta;
            @XmlElement(name = "Rut")
            protected String rut;
            @XmlElement(name = "Nombre")
            protected String nombre;
            @XmlElement(name = "TpoDocum")
            protected String tpoDocum;
            @XmlElement(name = "Numero")
            protected BigInteger numero;
            @XmlElement(name = "FchEmision")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar fchEmision;
            @XmlElement(name = "FchVencimiento")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar fchVencimiento;
            @XmlElement(name = "GlosaRef")
            protected List<LceDiario.Comprobante.Movimientos.GlosaRef> glosaRef;
            @XmlElement(name = "Debe")
            protected BigDecimal debe;
            @XmlElement(name = "Haber")
            protected BigDecimal haber;

            /**
             * Gets the value of the codigoCuenta property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getCodigoCuenta() {
                return codigoCuenta;
            }

            /**
             * Sets the value of the codigoCuenta property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setCodigoCuenta(Object value) {
                this.codigoCuenta = value;
            }

            /**
             * Gets the value of the rut property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRut() {
                return rut;
            }

            /**
             * Sets the value of the rut property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRut(String value) {
                this.rut = value;
            }

            /**
             * Gets the value of the nombre property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombre() {
                return nombre;
            }

            /**
             * Sets the value of the nombre property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombre(String value) {
                this.nombre = value;
            }

            /**
             * Gets the value of the tpoDocum property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTpoDocum() {
                return tpoDocum;
            }

            /**
             * Sets the value of the tpoDocum property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTpoDocum(String value) {
                this.tpoDocum = value;
            }

            /**
             * Gets the value of the numero property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNumero() {
                return numero;
            }

            /**
             * Sets the value of the numero property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNumero(BigInteger value) {
                this.numero = value;
            }

            /**
             * Gets the value of the fchEmision property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getFchEmision() {
                return fchEmision;
            }

            /**
             * Sets the value of the fchEmision property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setFchEmision(XMLGregorianCalendar value) {
                this.fchEmision = value;
            }

            /**
             * Gets the value of the fchVencimiento property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getFchVencimiento() {
                return fchVencimiento;
            }

            /**
             * Sets the value of the fchVencimiento property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setFchVencimiento(XMLGregorianCalendar value) {
                this.fchVencimiento = value;
            }

            /**
             * Gets the value of the glosaRef property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the glosaRef property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGlosaRef().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LceDiario.Comprobante.Movimientos.GlosaRef }
             * 
             * 
             */
            public List<LceDiario.Comprobante.Movimientos.GlosaRef> getGlosaRef() {
                if (glosaRef == null) {
                    glosaRef = new ArrayList<LceDiario.Comprobante.Movimientos.GlosaRef>();
                }
                return this.glosaRef;
            }

            /**
             * Gets the value of the debe property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDebe() {
                return debe;
            }

            /**
             * Sets the value of the debe property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setDebe(BigDecimal value) {
                this.debe = value;
            }

            /**
             * Gets the value of the haber property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getHaber() {
                return haber;
            }

            /**
             * Sets the value of the haber property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setHaber(BigDecimal value) {
                this.haber = value;
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
             *       &lt;sequence>
             *         &lt;element name="Glosa">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="30"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="Ref">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="20"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "glosa",
                "ref"
            })
            public static class GlosaRef {

                @XmlElement(name = "Glosa", required = true)
                protected String glosa;
                @XmlElement(name = "Ref", required = true)
                protected String ref;

                /**
                 * Gets the value of the glosa property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGlosa() {
                    return glosa;
                }

                /**
                 * Sets the value of the glosa property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGlosa(String value) {
                    this.glosa = value;
                }

                /**
                 * Gets the value of the ref property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRef() {
                    return ref;
                }

                /**
                 * Sets the value of the ref property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRef(String value) {
                    this.ref = value;
                }

            }

        }

    }

}