
package com.mastermaq.integracrm;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ProdutoSF complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ProdutoSF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodProduto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValorMinimo" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ValorMaximo" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CodSistema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pacote" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Opcional" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TipoServico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Variavel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValorVariavel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SistemasPacote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProdutoSF", propOrder = {
    "codProduto",
    "descricao",
    "valorMinimo",
    "valorMaximo",
    "codSistema",
    "pacote",
    "opcional",
    "tipoServico",
    "variavel",
    "valorVariavel",
    "sistemasPacote"
})
public class ProdutoSF {

    @XmlElement(name = "CodProduto")
    protected int codProduto;
    @XmlElement(name = "Descricao")
    protected String descricao;
    @XmlElement(name = "ValorMinimo", required = true)
    protected BigDecimal valorMinimo;
    @XmlElement(name = "ValorMaximo", required = true)
    protected BigDecimal valorMaximo;
    @XmlElement(name = "CodSistema")
    protected String codSistema;
    @XmlElement(name = "Pacote")
    protected boolean pacote;
    @XmlElement(name = "Opcional")
    protected boolean opcional;
    @XmlElement(name = "TipoServico")
    protected String tipoServico;
    @XmlElement(name = "Variavel")
    protected String variavel;
    @XmlElement(name = "ValorVariavel")
    protected String valorVariavel;
    @XmlElement(name = "SistemasPacote")
    protected String sistemasPacote;

    /**
     * Obtém o valor da propriedade codProduto.
     * 
     */
    public int getCodProduto() {
        return codProduto;
    }

    /**
     * Define o valor da propriedade codProduto.
     * 
     */
    public void setCodProduto(int value) {
        this.codProduto = value;
    }

    /**
     * Obtém o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Obtém o valor da propriedade valorMinimo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorMinimo() {
        return valorMinimo;
    }

    /**
     * Define o valor da propriedade valorMinimo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorMinimo(BigDecimal value) {
        this.valorMinimo = value;
    }

    /**
     * Obtém o valor da propriedade valorMaximo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorMaximo() {
        return valorMaximo;
    }

    /**
     * Define o valor da propriedade valorMaximo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorMaximo(BigDecimal value) {
        this.valorMaximo = value;
    }

    /**
     * Obtém o valor da propriedade codSistema.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodSistema() {
        return codSistema;
    }

    /**
     * Define o valor da propriedade codSistema.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodSistema(String value) {
        this.codSistema = value;
    }

    /**
     * Obtém o valor da propriedade pacote.
     * 
     */
    public boolean isPacote() {
        return pacote;
    }

    /**
     * Define o valor da propriedade pacote.
     * 
     */
    public void setPacote(boolean value) {
        this.pacote = value;
    }

    /**
     * Obtém o valor da propriedade opcional.
     * 
     */
    public boolean isOpcional() {
        return opcional;
    }

    /**
     * Define o valor da propriedade opcional.
     * 
     */
    public void setOpcional(boolean value) {
        this.opcional = value;
    }

    /**
     * Obtém o valor da propriedade tipoServico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoServico() {
        return tipoServico;
    }

    /**
     * Define o valor da propriedade tipoServico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoServico(String value) {
        this.tipoServico = value;
    }

    /**
     * Obtém o valor da propriedade variavel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariavel() {
        return variavel;
    }

    /**
     * Define o valor da propriedade variavel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariavel(String value) {
        this.variavel = value;
    }

    /**
     * Obtém o valor da propriedade valorVariavel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorVariavel() {
        return valorVariavel;
    }

    /**
     * Define o valor da propriedade valorVariavel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorVariavel(String value) {
        this.valorVariavel = value;
    }

    /**
     * Obtém o valor da propriedade sistemasPacote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSistemasPacote() {
        return sistemasPacote;
    }

    /**
     * Define o valor da propriedade sistemasPacote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSistemasPacote(String value) {
        this.sistemasPacote = value;
    }

}
