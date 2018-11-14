
package com.mastermaq.integracrm;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ContaSF complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ContaSF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Segmento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContatoPrincipal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TelefoneContato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailContato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContaPai" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Anexos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Endereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Complemento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Codempresa" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ValorContratoAtivo" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ClienteDesde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Inadimplente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodCat" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NomeCat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataUltCompra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataUltCancelamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PossuiDos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContaSF", propOrder = {
    "nome",
    "tipoCliente",
    "segmento",
    "site",
    "contatoPrincipal",
    "telefoneContato",
    "emailContato",
    "contaPai",
    "anexos",
    "pais",
    "endereco",
    "complemento",
    "cidade",
    "estado",
    "cep",
    "codempresa",
    "valorContratoAtivo",
    "clienteDesde",
    "inadimplente",
    "codCat",
    "nomeCat",
    "dataUltCompra",
    "dataUltCancelamento",
    "possuiDos"
})
public class ContaSF {

    @XmlElement(name = "Nome")
    protected String nome;
    @XmlElement(name = "TipoCliente")
    protected String tipoCliente;
    @XmlElement(name = "Segmento")
    protected String segmento;
    @XmlElement(name = "Site")
    protected String site;
    @XmlElement(name = "ContatoPrincipal")
    protected String contatoPrincipal;
    @XmlElement(name = "TelefoneContato")
    protected String telefoneContato;
    @XmlElement(name = "EmailContato")
    protected String emailContato;
    @XmlElement(name = "ContaPai")
    protected String contaPai;
    @XmlElement(name = "Anexos")
    protected String anexos;
    @XmlElement(name = "Pais")
    protected String pais;
    @XmlElement(name = "Endereco")
    protected String endereco;
    @XmlElement(name = "Complemento")
    protected String complemento;
    @XmlElement(name = "Cidade")
    protected String cidade;
    @XmlElement(name = "Estado")
    protected String estado;
    @XmlElement(name = "Cep")
    protected String cep;
    @XmlElement(name = "Codempresa")
    protected int codempresa;
    @XmlElement(name = "ValorContratoAtivo", required = true)
    protected BigDecimal valorContratoAtivo;
    @XmlElement(name = "ClienteDesde")
    protected String clienteDesde;
    @XmlElement(name = "Inadimplente")
    protected String inadimplente;
    @XmlElement(name = "CodCat")
    protected int codCat;
    @XmlElement(name = "NomeCat")
    protected String nomeCat;
    @XmlElement(name = "DataUltCompra")
    protected String dataUltCompra;
    @XmlElement(name = "DataUltCancelamento")
    protected String dataUltCancelamento;
    @XmlElement(name = "PossuiDos")
    protected String possuiDos;

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade tipoCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCliente() {
        return tipoCliente;
    }

    /**
     * Define o valor da propriedade tipoCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCliente(String value) {
        this.tipoCliente = value;
    }

    /**
     * Obtém o valor da propriedade segmento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmento() {
        return segmento;
    }

    /**
     * Define o valor da propriedade segmento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmento(String value) {
        this.segmento = value;
    }

    /**
     * Obtém o valor da propriedade site.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSite() {
        return site;
    }

    /**
     * Define o valor da propriedade site.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSite(String value) {
        this.site = value;
    }

    /**
     * Obtém o valor da propriedade contatoPrincipal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContatoPrincipal() {
        return contatoPrincipal;
    }

    /**
     * Define o valor da propriedade contatoPrincipal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContatoPrincipal(String value) {
        this.contatoPrincipal = value;
    }

    /**
     * Obtém o valor da propriedade telefoneContato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefoneContato() {
        return telefoneContato;
    }

    /**
     * Define o valor da propriedade telefoneContato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefoneContato(String value) {
        this.telefoneContato = value;
    }

    /**
     * Obtém o valor da propriedade emailContato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailContato() {
        return emailContato;
    }

    /**
     * Define o valor da propriedade emailContato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailContato(String value) {
        this.emailContato = value;
    }

    /**
     * Obtém o valor da propriedade contaPai.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContaPai() {
        return contaPai;
    }

    /**
     * Define o valor da propriedade contaPai.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContaPai(String value) {
        this.contaPai = value;
    }

    /**
     * Obtém o valor da propriedade anexos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnexos() {
        return anexos;
    }

    /**
     * Define o valor da propriedade anexos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnexos(String value) {
        this.anexos = value;
    }

    /**
     * Obtém o valor da propriedade pais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPais() {
        return pais;
    }

    /**
     * Define o valor da propriedade pais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPais(String value) {
        this.pais = value;
    }

    /**
     * Obtém o valor da propriedade endereco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o valor da propriedade endereco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndereco(String value) {
        this.endereco = value;
    }

    /**
     * Obtém o valor da propriedade complemento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * Define o valor da propriedade complemento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplemento(String value) {
        this.complemento = value;
    }

    /**
     * Obtém o valor da propriedade cidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Define o valor da propriedade cidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidade(String value) {
        this.cidade = value;
    }

    /**
     * Obtém o valor da propriedade estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define o valor da propriedade estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtém o valor da propriedade cep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCep() {
        return cep;
    }

    /**
     * Define o valor da propriedade cep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCep(String value) {
        this.cep = value;
    }

    /**
     * Obtém o valor da propriedade codempresa.
     * 
     */
    public int getCodempresa() {
        return codempresa;
    }

    /**
     * Define o valor da propriedade codempresa.
     * 
     */
    public void setCodempresa(int value) {
        this.codempresa = value;
    }

    /**
     * Obtém o valor da propriedade valorContratoAtivo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorContratoAtivo() {
        return valorContratoAtivo;
    }

    /**
     * Define o valor da propriedade valorContratoAtivo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorContratoAtivo(BigDecimal value) {
        this.valorContratoAtivo = value;
    }

    /**
     * Obtém o valor da propriedade clienteDesde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClienteDesde() {
        return clienteDesde;
    }

    /**
     * Define o valor da propriedade clienteDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClienteDesde(String value) {
        this.clienteDesde = value;
    }

    /**
     * Obtém o valor da propriedade inadimplente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInadimplente() {
        return inadimplente;
    }

    /**
     * Define o valor da propriedade inadimplente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInadimplente(String value) {
        this.inadimplente = value;
    }

    /**
     * Obtém o valor da propriedade codCat.
     * 
     */
    public int getCodCat() {
        return codCat;
    }

    /**
     * Define o valor da propriedade codCat.
     * 
     */
    public void setCodCat(int value) {
        this.codCat = value;
    }

    /**
     * Obtém o valor da propriedade nomeCat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCat() {
        return nomeCat;
    }

    /**
     * Define o valor da propriedade nomeCat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCat(String value) {
        this.nomeCat = value;
    }

    /**
     * Obtém o valor da propriedade dataUltCompra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataUltCompra() {
        return dataUltCompra;
    }

    /**
     * Define o valor da propriedade dataUltCompra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataUltCompra(String value) {
        this.dataUltCompra = value;
    }

    /**
     * Obtém o valor da propriedade dataUltCancelamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataUltCancelamento() {
        return dataUltCancelamento;
    }

    /**
     * Define o valor da propriedade dataUltCancelamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataUltCancelamento(String value) {
        this.dataUltCancelamento = value;
    }

    /**
     * Obtém o valor da propriedade possuiDos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPossuiDos() {
        return possuiDos;
    }

    /**
     * Define o valor da propriedade possuiDos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPossuiDos(String value) {
        this.possuiDos = value;
    }

}
