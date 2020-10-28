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
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;element name="DocumentoEnvioLibros">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RutEnvia" type="{http://www.sii.cl/SiiLce}RUTType"/>
 *                   &lt;element name="RutContribuyente" type="{http://www.sii.cl/SiiLce}RUTType"/>
 *                   &lt;element name="Notificacion">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Tipo">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Folio" type="{http://www.sii.cl/SiiLce}FolioType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TmstFirmaEnv" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
 *         &lt;element name="LCE" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                     &lt;choice>
 *                       &lt;element ref="{http://www.sii.cl/SiiLce}LceMayor"/>
 *                       &lt;element ref="{http://www.sii.cl/SiiLce}LceDiario"/>
 *                     &lt;/choice>
 *                     &lt;element name="Parcial" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;/sequence>
 *                   &lt;element name="NoCerrado" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.sii.cl/SiiLce}LceBalance" minOccurs="0"/>
 *                             &lt;element ref="{http://www.sii.cl/SiiLce}LceDiccionario" minOccurs="0"/>
 *                             &lt;choice>
 *                               &lt;element ref="{http://www.sii.cl/SiiLce}LceCoCertif"/>
 *                               &lt;element ref="{http://www.sii.cl/SiiLce}LceCal"/>
 *                             &lt;/choice>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
    "documentoEnvioLibros",
    "signature",
    "lce"
})
@XmlRootElement(name = "LceEnvioLibros")
public class LceEnvioLibros {

    @XmlElement(name = "DocumentoEnvioLibros", required = true)
    protected LceEnvioLibros.DocumentoEnvioLibros documentoEnvioLibros;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;
    @XmlElement(name = "LCE", required = true)
    protected List<LceEnvioLibros.LCE> lce;
    @XmlAttribute(required = true)
    protected BigDecimal version;

    /**
     * Gets the value of the documentoEnvioLibros property.
     * 
     * @return
     *     possible object is
     *     {@link LceEnvioLibros.DocumentoEnvioLibros }
     *     
     */
    public LceEnvioLibros.DocumentoEnvioLibros getDocumentoEnvioLibros() {
        return documentoEnvioLibros;
    }

    /**
     * Sets the value of the documentoEnvioLibros property.
     * 
     * @param value
     *     allowed object is
     *     {@link LceEnvioLibros.DocumentoEnvioLibros }
     *     
     */
    public void setDocumentoEnvioLibros(LceEnvioLibros.DocumentoEnvioLibros value) {
        this.documentoEnvioLibros = value;
    }

    /**
     * Firma Digital sobre Documento
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
     * Gets the value of the lce property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lce property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLCE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LceEnvioLibros.LCE }
     * 
     * 
     */
    public List<LceEnvioLibros.LCE> getLCE() {
        if (lce == null) {
            lce = new ArrayList<LceEnvioLibros.LCE>();
        }
        return this.lce;
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
     *         &lt;element name="RutEnvia" type="{http://www.sii.cl/SiiLce}RUTType"/>
     *         &lt;element name="RutContribuyente" type="{http://www.sii.cl/SiiLce}RUTType"/>
     *         &lt;element name="Notificacion">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Tipo">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Folio" type="{http://www.sii.cl/SiiLce}FolioType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TmstFirmaEnv" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
        "rutEnvia",
        "rutContribuyente",
        "notificacion",
        "tmstFirmaEnv"
    })
    public static class DocumentoEnvioLibros {

        @XmlElement(name = "RutEnvia", required = true)
        protected String rutEnvia;
        @XmlElement(name = "RutContribuyente", required = true)
        protected String rutContribuyente;
        @XmlElement(name = "Notificacion", required = true)
        protected LceEnvioLibros.DocumentoEnvioLibros.Notificacion notificacion;
        @XmlElement(name = "TmstFirmaEnv", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar tmstFirmaEnv;
        @XmlAttribute(name = "ID", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;

        /**
         * Gets the value of the rutEnvia property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRutEnvia() {
            return rutEnvia;
        }

        /**
         * Sets the value of the rutEnvia property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRutEnvia(String value) {
            this.rutEnvia = value;
        }

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
         * Gets the value of the notificacion property.
         * 
         * @return
         *     possible object is
         *     {@link LceEnvioLibros.DocumentoEnvioLibros.Notificacion }
         *     
         */
        public LceEnvioLibros.DocumentoEnvioLibros.Notificacion getNotificacion() {
            return notificacion;
        }

        /**
         * Sets the value of the notificacion property.
         * 
         * @param value
         *     allowed object is
         *     {@link LceEnvioLibros.DocumentoEnvioLibros.Notificacion }
         *     
         */
        public void setNotificacion(LceEnvioLibros.DocumentoEnvioLibros.Notificacion value) {
            this.notificacion = value;
        }

        /**
         * Gets the value of the tmstFirmaEnv property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTmstFirmaEnv() {
            return tmstFirmaEnv;
        }

        /**
         * Sets the value of the tmstFirmaEnv property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTmstFirmaEnv(XMLGregorianCalendar value) {
            this.tmstFirmaEnv = value;
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
         *         &lt;element name="Tipo">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Folio" type="{http://www.sii.cl/SiiLce}FolioType"/>
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
            "tipo",
            "folio"
        })
        public static class Notificacion {

            @XmlElement(name = "Tipo", required = true)
            protected BigInteger tipo;
            @XmlElement(name = "Folio", required = true)
            protected BigInteger folio;

            /**
             * Gets the value of the tipo property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTipo() {
                return tipo;
            }

            /**
             * Sets the value of the tipo property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTipo(BigInteger value) {
                this.tipo = value;
            }

            /**
             * Gets the value of the folio property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getFolio() {
                return folio;
            }

            /**
             * Sets the value of the folio property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setFolio(BigInteger value) {
                this.folio = value;
            }

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
     *         &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *           &lt;choice>
     *             &lt;element ref="{http://www.sii.cl/SiiLce}LceMayor"/>
     *             &lt;element ref="{http://www.sii.cl/SiiLce}LceDiario"/>
     *           &lt;/choice>
     *           &lt;element name="Parcial" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;/sequence>
     *         &lt;element name="NoCerrado" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.sii.cl/SiiLce}LceBalance" minOccurs="0"/>
     *                   &lt;element ref="{http://www.sii.cl/SiiLce}LceDiccionario" minOccurs="0"/>
     *                   &lt;choice>
     *                     &lt;element ref="{http://www.sii.cl/SiiLce}LceCoCertif"/>
     *                     &lt;element ref="{http://www.sii.cl/SiiLce}LceCal"/>
     *                   &lt;/choice>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
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
        "lceMayorOrLceDiarioAndParcial",
        "noCerrado"
    })
    public static class LCE {

        @XmlElements({
            @XmlElement(name = "Parcial", type = Boolean.class),
            @XmlElement(name = "LceMayor", type = LceMayor.class),
            @XmlElement(name = "LceDiario", type = LceDiario.class)
        })
        protected List<Object> lceMayorOrLceDiarioAndParcial;
        @XmlElement(name = "NoCerrado")
        protected LceEnvioLibros.LCE.NoCerrado noCerrado;

        /**
         * Gets the value of the lceMayorOrLceDiarioAndParcial property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lceMayorOrLceDiarioAndParcial property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLceMayorOrLceDiarioAndParcial().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Boolean }
         * {@link LceMayor }
         * {@link LceDiario }
         * 
         * 
         */
        public List<Object> getLceMayorOrLceDiarioAndParcial() {
            if (lceMayorOrLceDiarioAndParcial == null) {
                lceMayorOrLceDiarioAndParcial = new ArrayList<Object>();
            }
            return this.lceMayorOrLceDiarioAndParcial;
        }

        /**
         * Gets the value of the noCerrado property.
         * 
         * @return
         *     possible object is
         *     {@link LceEnvioLibros.LCE.NoCerrado }
         *     
         */
        public LceEnvioLibros.LCE.NoCerrado getNoCerrado() {
            return noCerrado;
        }

        /**
         * Sets the value of the noCerrado property.
         * 
         * @param value
         *     allowed object is
         *     {@link LceEnvioLibros.LCE.NoCerrado }
         *     
         */
        public void setNoCerrado(LceEnvioLibros.LCE.NoCerrado value) {
            this.noCerrado = value;
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
         *         &lt;element ref="{http://www.sii.cl/SiiLce}LceBalance" minOccurs="0"/>
         *         &lt;element ref="{http://www.sii.cl/SiiLce}LceDiccionario" minOccurs="0"/>
         *         &lt;choice>
         *           &lt;element ref="{http://www.sii.cl/SiiLce}LceCoCertif"/>
         *           &lt;element ref="{http://www.sii.cl/SiiLce}LceCal"/>
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
            "lceBalance",
            "lceDiccionario",
            "lceCoCertif",
            "lceCal"
        })
        public static class NoCerrado {

            @XmlElement(name = "LceBalance")
            protected LceBalance lceBalance;
            @XmlElement(name = "LceDiccionario")
            protected LceDiccionario lceDiccionario;
            @XmlElement(name = "LceCoCertif")
            protected LceCoCertif lceCoCertif;
            @XmlElement(name = "LceCal")
            protected LceCal lceCal;

            /**
             * Gets the value of the lceBalance property.
             * 
             * @return
             *     possible object is
             *     {@link LceBalance }
             *     
             */
            public LceBalance getLceBalance() {
                return lceBalance;
            }

            /**
             * Sets the value of the lceBalance property.
             * 
             * @param value
             *     allowed object is
             *     {@link LceBalance }
             *     
             */
            public void setLceBalance(LceBalance value) {
                this.lceBalance = value;
            }

            /**
             * Gets the value of the lceDiccionario property.
             * 
             * @return
             *     possible object is
             *     {@link LceDiccionario }
             *     
             */
            public LceDiccionario getLceDiccionario() {
                return lceDiccionario;
            }

            /**
             * Sets the value of the lceDiccionario property.
             * 
             * @param value
             *     allowed object is
             *     {@link LceDiccionario }
             *     
             */
            public void setLceDiccionario(LceDiccionario value) {
                this.lceDiccionario = value;
            }

            /**
             * Gets the value of the lceCoCertif property.
             * 
             * @return
             *     possible object is
             *     {@link LceCoCertif }
             *     
             */
            public LceCoCertif getLceCoCertif() {
                return lceCoCertif;
            }

            /**
             * Sets the value of the lceCoCertif property.
             * 
             * @param value
             *     allowed object is
             *     {@link LceCoCertif }
             *     
             */
            public void setLceCoCertif(LceCoCertif value) {
                this.lceCoCertif = value;
            }

            /**
             * Certificado Autorizacion de Libros, generado por el SII
             * 
             * @return
             *     possible object is
             *     {@link LceCal }
             *     
             */
            public LceCal getLceCal() {
                return lceCal;
            }

            /**
             * Sets the value of the lceCal property.
             * 
             * @param value
             *     allowed object is
             *     {@link LceCal }
             *     
             */
            public void setLceCal(LceCal value) {
                this.lceCal = value;
            }

        }

    }

}