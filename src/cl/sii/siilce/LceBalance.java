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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3._2000._09.xmldsig_.SignatureType;


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
 *         &lt;element name="DocumentoBalance">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Identificacion">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RutContribuyente" type="{http://www.sii.cl/SiiLce}RUTType"/>
 *                             &lt;element name="PeriodoTributario" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/>
 *                             &lt;element name="Moneda" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="10"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Rectificatoria" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Cuenta" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CodigoCuenta">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Debe" type="{http://www.sii.cl/SiiLce}MontoType"/>
 *                             &lt;element name="Haber" type="{http://www.sii.cl/SiiLce}MontoType"/>
 *                             &lt;element name="SaldoDeudor" type="{http://www.sii.cl/SiiLce}MontoType" minOccurs="0"/>
 *                             &lt;element name="SaldoAcreedor" type="{http://www.sii.cl/SiiLce}MontoType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="RutFirma" type="{http://www.sii.cl/SiiLce}RUTType"/>
 *                   &lt;element name="TmstFirma">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
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
    "documentoBalance",
    "signature"
})
@XmlRootElement(name = "LceBalance")
public class LceBalance {

    @XmlElement(name = "DocumentoBalance", required = true)
    protected LceBalance.DocumentoBalance documentoBalance;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;
    @XmlAttribute(required = true)
    protected BigDecimal version;

    /**
     * Gets the value of the documentoBalance property.
     * 
     * @return
     *     possible object is
     *     {@link LceBalance.DocumentoBalance }
     *     
     */
    public LceBalance.DocumentoBalance getDocumentoBalance() {
        return documentoBalance;
    }

    /**
     * Sets the value of the documentoBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link LceBalance.DocumentoBalance }
     *     
     */
    public void setDocumentoBalance(LceBalance.DocumentoBalance value) {
        this.documentoBalance = value;
    }

    /**
     * Firma Digital del Envio del Libro Electronico
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
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
     *         &lt;element name="Identificacion">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RutContribuyente" type="{http://www.sii.cl/SiiLce}RUTType"/>
     *                   &lt;element name="PeriodoTributario" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/>
     *                   &lt;element name="Moneda" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="10"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Rectificatoria" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Cuenta" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CodigoCuenta">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Debe" type="{http://www.sii.cl/SiiLce}MontoType"/>
     *                   &lt;element name="Haber" type="{http://www.sii.cl/SiiLce}MontoType"/>
     *                   &lt;element name="SaldoDeudor" type="{http://www.sii.cl/SiiLce}MontoType" minOccurs="0"/>
     *                   &lt;element name="SaldoAcreedor" type="{http://www.sii.cl/SiiLce}MontoType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="RutFirma" type="{http://www.sii.cl/SiiLce}RUTType"/>
     *         &lt;element name="TmstFirma">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "identificacion",
        "cuenta",
        "rutFirma",
        "tmstFirma"
    })
    public static class DocumentoBalance {

        @XmlElement(name = "Identificacion", required = true)
        protected LceBalance.DocumentoBalance.Identificacion identificacion;
        @XmlElement(name = "Cuenta")
        protected List<LceBalance.DocumentoBalance.Cuenta> cuenta;
        @XmlElement(name = "RutFirma", required = true)
        protected String rutFirma;
        @XmlElement(name = "TmstFirma", required = true)
        protected XMLGregorianCalendar tmstFirma;
        @XmlAttribute(name = "ID", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;

        /**
         * Gets the value of the identificacion property.
         * 
         * @return
         *     possible object is
         *     {@link LceBalance.DocumentoBalance.Identificacion }
         *     
         */
        public LceBalance.DocumentoBalance.Identificacion getIdentificacion() {
            return identificacion;
        }

        /**
         * Sets the value of the identificacion property.
         * 
         * @param value
         *     allowed object is
         *     {@link LceBalance.DocumentoBalance.Identificacion }
         *     
         */
        public void setIdentificacion(LceBalance.DocumentoBalance.Identificacion value) {
            this.identificacion = value;
        }

        /**
         * Gets the value of the cuenta property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cuenta property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCuenta().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LceBalance.DocumentoBalance.Cuenta }
         * 
         * 
         */
        public List<LceBalance.DocumentoBalance.Cuenta> getCuenta() {
            if (cuenta == null) {
                cuenta = new ArrayList<LceBalance.DocumentoBalance.Cuenta>();
            }
            return this.cuenta;
        }

        /**
         * Gets the value of the rutFirma property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRutFirma() {
            return rutFirma;
        }

        /**
         * Sets the value of the rutFirma property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRutFirma(String value) {
            this.rutFirma = value;
        }

        /**
         * Gets the value of the tmstFirma property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTmstFirma() {
            return tmstFirma;
        }

        /**
         * Sets the value of the tmstFirma property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTmstFirma(XMLGregorianCalendar value) {
            this.tmstFirma = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setID(String value) {
            this.id = value;
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
         *         &lt;element name="CodigoCuenta">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="20"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Debe" type="{http://www.sii.cl/SiiLce}MontoType"/>
         *         &lt;element name="Haber" type="{http://www.sii.cl/SiiLce}MontoType"/>
         *         &lt;element name="SaldoDeudor" type="{http://www.sii.cl/SiiLce}MontoType" minOccurs="0"/>
         *         &lt;element name="SaldoAcreedor" type="{http://www.sii.cl/SiiLce}MontoType" minOccurs="0"/>
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
            "debe",
            "haber",
            "saldoDeudor",
            "saldoAcreedor"
        })
        public static class Cuenta {

            @XmlElement(name = "CodigoCuenta", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String codigoCuenta;
            @XmlElement(name = "Debe", required = true)
            protected BigDecimal debe;
            @XmlElement(name = "Haber", required = true)
            protected BigDecimal haber;
            @XmlElement(name = "SaldoDeudor")
            protected BigDecimal saldoDeudor;
            @XmlElement(name = "SaldoAcreedor")
            protected BigDecimal saldoAcreedor;

            /**
             * Gets the value of the codigoCuenta property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodigoCuenta() {
                return codigoCuenta;
            }

            /**
             * Sets the value of the codigoCuenta property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodigoCuenta(String value) {
                this.codigoCuenta = value;
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
             * Gets the value of the saldoDeudor property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSaldoDeudor() {
                return saldoDeudor;
            }

            /**
             * Sets the value of the saldoDeudor property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSaldoDeudor(BigDecimal value) {
                this.saldoDeudor = value;
            }

            /**
             * Gets the value of the saldoAcreedor property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSaldoAcreedor() {
                return saldoAcreedor;
            }

            /**
             * Sets the value of the saldoAcreedor property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSaldoAcreedor(BigDecimal value) {
                this.saldoAcreedor = value;
            }

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
         *         &lt;element name="RutContribuyente" type="{http://www.sii.cl/SiiLce}RUTType"/>
         *         &lt;element name="PeriodoTributario" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/>
         *         &lt;element name="Moneda" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="10"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Rectificatoria" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
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
            "rutContribuyente",
            "periodoTributario",
            "moneda",
            "rectificatoria"
        })
        public static class Identificacion {

            @XmlElement(name = "RutContribuyente", required = true)
            protected String rutContribuyente;
            @XmlElement(name = "PeriodoTributario", required = true)
            @XmlSchemaType(name = "gYearMonth")
            protected XMLGregorianCalendar periodoTributario;
            @XmlElement(name = "Moneda")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String moneda;
            @XmlElement(name = "Rectificatoria")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger rectificatoria;

            /**
             * Gets the value of the rutContribuyente property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRutContribuyente() {
                return rutContribuyente;
            }

            /**
             * Sets the value of the rutContribuyente property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRutContribuyente(String value) {
                this.rutContribuyente = value;
            }

            /**
             * Gets the value of the periodoTributario property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getPeriodoTributario() {
                return periodoTributario;
            }

            /**
             * Sets the value of the periodoTributario property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setPeriodoTributario(XMLGregorianCalendar value) {
                this.periodoTributario = value;
            }

            /**
             * Gets the value of the moneda property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMoneda() {
                return moneda;
            }

            /**
             * Sets the value of the moneda property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMoneda(String value) {
                this.moneda = value;
            }

            /**
             * Gets the value of the rectificatoria property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getRectificatoria() {
                return rectificatoria;
            }

            /**
             * Sets the value of the rectificatoria property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setRectificatoria(BigInteger value) {
                this.rectificatoria = value;
            }

        }

    }

}