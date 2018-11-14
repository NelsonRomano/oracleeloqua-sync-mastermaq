
package com.mastermaq.integracrm;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ContaEL complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ContaEL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AreaAtuacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NPSUltimaDemonstracao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MotivoNPSUltimaDemonstracao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NPSUltimaCotacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MotivoNPSUltimaCotacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NpsUltimaVenda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MotivoNpsUltimaVenda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoSiEmpresa" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RamoDeAtividade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceitaAnual" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="QuantidadeFuncionarios" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Porte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AmplitudeGeográfica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClienteDesde" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ChamadoCancelamentoEmAberto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChamadoCancelamentoUltSeisMeses" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChamadoReclamacaoEmAberto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescricaoCnae" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NomeClasse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Classe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CpfCnpj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValorContrato" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DosPuro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QtdSistemaMasterCont" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QtdSistemaMasterOne" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QtdSistemaMasterErp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QtdSistemaMasterCorporate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QtdSistemaMasterConnect" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QtdSistemaMasterAppWeb" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QtdSistemaMasterMobile" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QtdSistemaMasterApi" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniquePremiumNGMonitorado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Perfil1Clientes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Perfil2Clientes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Perfil3Clientes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Perfil4Clientes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Perfil5Clientes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Perfil6Clientes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Endereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Complemento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataUltAtualizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContaEL", propOrder = {
    "company",
    "address1",
    "city",
    "areaAtuacao",
    "npsUltimaDemonstracao",
    "motivoNPSUltimaDemonstracao",
    "npsUltimaCotacao",
    "motivoNPSUltimaCotacao",
    "npsUltimaVenda",
    "motivoNpsUltimaVenda",
    "codigoSiEmpresa",
    "ramoDeAtividade",
    "receitaAnual",
    "quantidadeFuncionarios",
    "porte",
    "amplitudeGeogr\u00e1fica",
    "clienteDesde",
    "chamadoCancelamentoEmAberto",
    "chamadoCancelamentoUltSeisMeses",
    "chamadoReclamacaoEmAberto",
    "descricaoCnae",
    "nomeClasse",
    "classe",
    "cpfCnpj",
    "valorContrato",
    "dosPuro",
    "qtdSistemaMasterCont",
    "qtdSistemaMasterOne",
    "qtdSistemaMasterErp",
    "qtdSistemaMasterCorporate",
    "qtdSistemaMasterConnect",
    "qtdSistemaMasterAppWeb",
    "qtdSistemaMasterMobile",
    "qtdSistemaMasterApi",
    "uniquePremiumNGMonitorado",
    "perfil1Clientes",
    "perfil2Clientes",
    "perfil3Clientes",
    "perfil4Clientes",
    "perfil5Clientes",
    "perfil6Clientes",
    "pais",
    "endereco",
    "complemento",
    "cidade",
    "estado",
    "cep",
    "dataUltAtualizacao"
})
public class ContaEL {

    @XmlElement(name = "Company")
    protected String company;
    @XmlElement(name = "Address1")
    protected String address1;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "AreaAtuacao")
    protected String areaAtuacao;
    @XmlElement(name = "NPSUltimaDemonstracao")
    protected String npsUltimaDemonstracao;
    @XmlElement(name = "MotivoNPSUltimaDemonstracao")
    protected String motivoNPSUltimaDemonstracao;
    @XmlElement(name = "NPSUltimaCotacao")
    protected String npsUltimaCotacao;
    @XmlElement(name = "MotivoNPSUltimaCotacao")
    protected String motivoNPSUltimaCotacao;
    @XmlElement(name = "NpsUltimaVenda")
    protected String npsUltimaVenda;
    @XmlElement(name = "MotivoNpsUltimaVenda")
    protected String motivoNpsUltimaVenda;
    @XmlElement(name = "CodigoSiEmpresa")
    protected int codigoSiEmpresa;
    @XmlElement(name = "RamoDeAtividade")
    protected String ramoDeAtividade;
    @XmlElement(name = "ReceitaAnual", required = true)
    protected BigDecimal receitaAnual;
    @XmlElement(name = "QuantidadeFuncionarios")
    protected int quantidadeFuncionarios;
    @XmlElement(name = "Porte")
    protected String porte;
    @XmlElement(name = "AmplitudeGeogr\u00e1fica")
    protected String amplitudeGeográfica;
    @XmlElement(name = "ClienteDesde", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clienteDesde;
    @XmlElement(name = "ChamadoCancelamentoEmAberto")
    protected String chamadoCancelamentoEmAberto;
    @XmlElement(name = "ChamadoCancelamentoUltSeisMeses")
    protected String chamadoCancelamentoUltSeisMeses;
    @XmlElement(name = "ChamadoReclamacaoEmAberto")
    protected String chamadoReclamacaoEmAberto;
    @XmlElement(name = "DescricaoCnae")
    protected String descricaoCnae;
    @XmlElement(name = "NomeClasse")
    protected String nomeClasse;
    @XmlElement(name = "Classe")
    protected String classe;
    @XmlElement(name = "CpfCnpj")
    protected String cpfCnpj;
    @XmlElement(name = "ValorContrato", required = true)
    protected BigDecimal valorContrato;
    @XmlElement(name = "DosPuro")
    protected String dosPuro;
    @XmlElement(name = "QtdSistemaMasterCont")
    protected int qtdSistemaMasterCont;
    @XmlElement(name = "QtdSistemaMasterOne")
    protected int qtdSistemaMasterOne;
    @XmlElement(name = "QtdSistemaMasterErp")
    protected int qtdSistemaMasterErp;
    @XmlElement(name = "QtdSistemaMasterCorporate")
    protected int qtdSistemaMasterCorporate;
    @XmlElement(name = "QtdSistemaMasterConnect")
    protected int qtdSistemaMasterConnect;
    @XmlElement(name = "QtdSistemaMasterAppWeb")
    protected int qtdSistemaMasterAppWeb;
    @XmlElement(name = "QtdSistemaMasterMobile")
    protected int qtdSistemaMasterMobile;
    @XmlElement(name = "QtdSistemaMasterApi")
    protected int qtdSistemaMasterApi;
    @XmlElement(name = "UniquePremiumNGMonitorado")
    protected String uniquePremiumNGMonitorado;
    @XmlElement(name = "Perfil1Clientes")
    protected String perfil1Clientes;
    @XmlElement(name = "Perfil2Clientes")
    protected String perfil2Clientes;
    @XmlElement(name = "Perfil3Clientes")
    protected String perfil3Clientes;
    @XmlElement(name = "Perfil4Clientes")
    protected String perfil4Clientes;
    @XmlElement(name = "Perfil5Clientes")
    protected String perfil5Clientes;
    @XmlElement(name = "Perfil6Clientes")
    protected String perfil6Clientes;
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
    @XmlElement(name = "DataUltAtualizacao", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataUltAtualizacao;

    /**
     * Obtém o valor da propriedade company.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Define o valor da propriedade company.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Obtém o valor da propriedade address1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Define o valor da propriedade address1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Obtém o valor da propriedade city.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Define o valor da propriedade city.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Obtém o valor da propriedade areaAtuacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    /**
     * Define o valor da propriedade areaAtuacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaAtuacao(String value) {
        this.areaAtuacao = value;
    }

    /**
     * Obtém o valor da propriedade npsUltimaDemonstracao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPSUltimaDemonstracao() {
        return npsUltimaDemonstracao;
    }

    /**
     * Define o valor da propriedade npsUltimaDemonstracao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPSUltimaDemonstracao(String value) {
        this.npsUltimaDemonstracao = value;
    }

    /**
     * Obtém o valor da propriedade motivoNPSUltimaDemonstracao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoNPSUltimaDemonstracao() {
        return motivoNPSUltimaDemonstracao;
    }

    /**
     * Define o valor da propriedade motivoNPSUltimaDemonstracao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoNPSUltimaDemonstracao(String value) {
        this.motivoNPSUltimaDemonstracao = value;
    }

    /**
     * Obtém o valor da propriedade npsUltimaCotacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPSUltimaCotacao() {
        return npsUltimaCotacao;
    }

    /**
     * Define o valor da propriedade npsUltimaCotacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPSUltimaCotacao(String value) {
        this.npsUltimaCotacao = value;
    }

    /**
     * Obtém o valor da propriedade motivoNPSUltimaCotacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoNPSUltimaCotacao() {
        return motivoNPSUltimaCotacao;
    }

    /**
     * Define o valor da propriedade motivoNPSUltimaCotacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoNPSUltimaCotacao(String value) {
        this.motivoNPSUltimaCotacao = value;
    }

    /**
     * Obtém o valor da propriedade npsUltimaVenda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNpsUltimaVenda() {
        return npsUltimaVenda;
    }

    /**
     * Define o valor da propriedade npsUltimaVenda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNpsUltimaVenda(String value) {
        this.npsUltimaVenda = value;
    }

    /**
     * Obtém o valor da propriedade motivoNpsUltimaVenda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoNpsUltimaVenda() {
        return motivoNpsUltimaVenda;
    }

    /**
     * Define o valor da propriedade motivoNpsUltimaVenda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoNpsUltimaVenda(String value) {
        this.motivoNpsUltimaVenda = value;
    }

    /**
     * Obtém o valor da propriedade codigoSiEmpresa.
     * 
     */
    public int getCodigoSiEmpresa() {
        return codigoSiEmpresa;
    }

    /**
     * Define o valor da propriedade codigoSiEmpresa.
     * 
     */
    public void setCodigoSiEmpresa(int value) {
        this.codigoSiEmpresa = value;
    }

    /**
     * Obtém o valor da propriedade ramoDeAtividade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRamoDeAtividade() {
        return ramoDeAtividade;
    }

    /**
     * Define o valor da propriedade ramoDeAtividade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRamoDeAtividade(String value) {
        this.ramoDeAtividade = value;
    }

    /**
     * Obtém o valor da propriedade receitaAnual.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReceitaAnual() {
        return receitaAnual;
    }

    /**
     * Define o valor da propriedade receitaAnual.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReceitaAnual(BigDecimal value) {
        this.receitaAnual = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeFuncionarios.
     * 
     */
    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    /**
     * Define o valor da propriedade quantidadeFuncionarios.
     * 
     */
    public void setQuantidadeFuncionarios(int value) {
        this.quantidadeFuncionarios = value;
    }

    /**
     * Obtém o valor da propriedade porte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPorte() {
        return porte;
    }

    /**
     * Define o valor da propriedade porte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPorte(String value) {
        this.porte = value;
    }

    /**
     * Obtém o valor da propriedade amplitudeGeográfica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmplitudeGeográfica() {
        return amplitudeGeográfica;
    }

    /**
     * Define o valor da propriedade amplitudeGeográfica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmplitudeGeográfica(String value) {
        this.amplitudeGeográfica = value;
    }

    /**
     * Obtém o valor da propriedade clienteDesde.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClienteDesde() {
        return clienteDesde;
    }

    /**
     * Define o valor da propriedade clienteDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClienteDesde(XMLGregorianCalendar value) {
        this.clienteDesde = value;
    }

    /**
     * Obtém o valor da propriedade chamadoCancelamentoEmAberto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChamadoCancelamentoEmAberto() {
        return chamadoCancelamentoEmAberto;
    }

    /**
     * Define o valor da propriedade chamadoCancelamentoEmAberto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChamadoCancelamentoEmAberto(String value) {
        this.chamadoCancelamentoEmAberto = value;
    }

    /**
     * Obtém o valor da propriedade chamadoCancelamentoUltSeisMeses.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChamadoCancelamentoUltSeisMeses() {
        return chamadoCancelamentoUltSeisMeses;
    }

    /**
     * Define o valor da propriedade chamadoCancelamentoUltSeisMeses.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChamadoCancelamentoUltSeisMeses(String value) {
        this.chamadoCancelamentoUltSeisMeses = value;
    }

    /**
     * Obtém o valor da propriedade chamadoReclamacaoEmAberto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChamadoReclamacaoEmAberto() {
        return chamadoReclamacaoEmAberto;
    }

    /**
     * Define o valor da propriedade chamadoReclamacaoEmAberto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChamadoReclamacaoEmAberto(String value) {
        this.chamadoReclamacaoEmAberto = value;
    }

    /**
     * Obtém o valor da propriedade descricaoCnae.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoCnae() {
        return descricaoCnae;
    }

    /**
     * Define o valor da propriedade descricaoCnae.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoCnae(String value) {
        this.descricaoCnae = value;
    }

    /**
     * Obtém o valor da propriedade nomeClasse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeClasse() {
        return nomeClasse;
    }

    /**
     * Define o valor da propriedade nomeClasse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeClasse(String value) {
        this.nomeClasse = value;
    }

    /**
     * Obtém o valor da propriedade classe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClasse() {
        return classe;
    }

    /**
     * Define o valor da propriedade classe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClasse(String value) {
        this.classe = value;
    }

    /**
     * Obtém o valor da propriedade cpfCnpj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpfCnpj() {
        return cpfCnpj;
    }

    /**
     * Define o valor da propriedade cpfCnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpfCnpj(String value) {
        this.cpfCnpj = value;
    }

    /**
     * Obtém o valor da propriedade valorContrato.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorContrato() {
        return valorContrato;
    }

    /**
     * Define o valor da propriedade valorContrato.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorContrato(BigDecimal value) {
        this.valorContrato = value;
    }

    /**
     * Obtém o valor da propriedade dosPuro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDosPuro() {
        return dosPuro;
    }

    /**
     * Define o valor da propriedade dosPuro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDosPuro(String value) {
        this.dosPuro = value;
    }

    /**
     * Obtém o valor da propriedade qtdSistemaMasterCont.
     * 
     */
    public int getQtdSistemaMasterCont() {
        return qtdSistemaMasterCont;
    }

    /**
     * Define o valor da propriedade qtdSistemaMasterCont.
     * 
     */
    public void setQtdSistemaMasterCont(int value) {
        this.qtdSistemaMasterCont = value;
    }

    /**
     * Obtém o valor da propriedade qtdSistemaMasterOne.
     * 
     */
    public int getQtdSistemaMasterOne() {
        return qtdSistemaMasterOne;
    }

    /**
     * Define o valor da propriedade qtdSistemaMasterOne.
     * 
     */
    public void setQtdSistemaMasterOne(int value) {
        this.qtdSistemaMasterOne = value;
    }

    /**
     * Obtém o valor da propriedade qtdSistemaMasterErp.
     * 
     */
    public int getQtdSistemaMasterErp() {
        return qtdSistemaMasterErp;
    }

    /**
     * Define o valor da propriedade qtdSistemaMasterErp.
     * 
     */
    public void setQtdSistemaMasterErp(int value) {
        this.qtdSistemaMasterErp = value;
    }

    /**
     * Obtém o valor da propriedade qtdSistemaMasterCorporate.
     * 
     */
    public int getQtdSistemaMasterCorporate() {
        return qtdSistemaMasterCorporate;
    }

    /**
     * Define o valor da propriedade qtdSistemaMasterCorporate.
     * 
     */
    public void setQtdSistemaMasterCorporate(int value) {
        this.qtdSistemaMasterCorporate = value;
    }

    /**
     * Obtém o valor da propriedade qtdSistemaMasterConnect.
     * 
     */
    public int getQtdSistemaMasterConnect() {
        return qtdSistemaMasterConnect;
    }

    /**
     * Define o valor da propriedade qtdSistemaMasterConnect.
     * 
     */
    public void setQtdSistemaMasterConnect(int value) {
        this.qtdSistemaMasterConnect = value;
    }

    /**
     * Obtém o valor da propriedade qtdSistemaMasterAppWeb.
     * 
     */
    public int getQtdSistemaMasterAppWeb() {
        return qtdSistemaMasterAppWeb;
    }

    /**
     * Define o valor da propriedade qtdSistemaMasterAppWeb.
     * 
     */
    public void setQtdSistemaMasterAppWeb(int value) {
        this.qtdSistemaMasterAppWeb = value;
    }

    /**
     * Obtém o valor da propriedade qtdSistemaMasterMobile.
     * 
     */
    public int getQtdSistemaMasterMobile() {
        return qtdSistemaMasterMobile;
    }

    /**
     * Define o valor da propriedade qtdSistemaMasterMobile.
     * 
     */
    public void setQtdSistemaMasterMobile(int value) {
        this.qtdSistemaMasterMobile = value;
    }

    /**
     * Obtém o valor da propriedade qtdSistemaMasterApi.
     * 
     */
    public int getQtdSistemaMasterApi() {
        return qtdSistemaMasterApi;
    }

    /**
     * Define o valor da propriedade qtdSistemaMasterApi.
     * 
     */
    public void setQtdSistemaMasterApi(int value) {
        this.qtdSistemaMasterApi = value;
    }

    /**
     * Obtém o valor da propriedade uniquePremiumNGMonitorado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniquePremiumNGMonitorado() {
        return uniquePremiumNGMonitorado;
    }

    /**
     * Define o valor da propriedade uniquePremiumNGMonitorado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniquePremiumNGMonitorado(String value) {
        this.uniquePremiumNGMonitorado = value;
    }

    /**
     * Obtém o valor da propriedade perfil1Clientes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerfil1Clientes() {
        return perfil1Clientes;
    }

    /**
     * Define o valor da propriedade perfil1Clientes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerfil1Clientes(String value) {
        this.perfil1Clientes = value;
    }

    /**
     * Obtém o valor da propriedade perfil2Clientes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerfil2Clientes() {
        return perfil2Clientes;
    }

    /**
     * Define o valor da propriedade perfil2Clientes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerfil2Clientes(String value) {
        this.perfil2Clientes = value;
    }

    /**
     * Obtém o valor da propriedade perfil3Clientes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerfil3Clientes() {
        return perfil3Clientes;
    }

    /**
     * Define o valor da propriedade perfil3Clientes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerfil3Clientes(String value) {
        this.perfil3Clientes = value;
    }

    /**
     * Obtém o valor da propriedade perfil4Clientes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerfil4Clientes() {
        return perfil4Clientes;
    }

    /**
     * Define o valor da propriedade perfil4Clientes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerfil4Clientes(String value) {
        this.perfil4Clientes = value;
    }

    /**
     * Obtém o valor da propriedade perfil5Clientes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerfil5Clientes() {
        return perfil5Clientes;
    }

    /**
     * Define o valor da propriedade perfil5Clientes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerfil5Clientes(String value) {
        this.perfil5Clientes = value;
    }

    /**
     * Obtém o valor da propriedade perfil6Clientes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerfil6Clientes() {
        return perfil6Clientes;
    }

    /**
     * Define o valor da propriedade perfil6Clientes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerfil6Clientes(String value) {
        this.perfil6Clientes = value;
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
     * Obtém o valor da propriedade dataUltAtualizacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataUltAtualizacao() {
        return dataUltAtualizacao;
    }

    /**
     * Define o valor da propriedade dataUltAtualizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataUltAtualizacao(XMLGregorianCalendar value) {
        this.dataUltAtualizacao = value;
    }

}
