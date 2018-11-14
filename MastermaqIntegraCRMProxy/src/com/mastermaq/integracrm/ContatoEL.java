
package com.mastermaq.integracrm;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ContatoEL complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ContatoEL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Salesperson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Celular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Funcao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NivelHierarquico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NivelInfluencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Afinidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DecisaoParaCompra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContatoPreferencial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiaNascimento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MesNascimento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AnoNascimento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Escolaridade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EstadoCivil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NaturezaOcupacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Apelido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hobby" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DetalhamentoHobby" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaixaSalarial" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CadastroNaUniversidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TamanhoCamiseta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeFutebol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoMusicaFavorita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CursoFormacaoSuperiorTecnica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InstituicaoFormacaoSuperiorTecnica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SiteBlog" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoSiEmpresa" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "ContatoEL", propOrder = {
    "emailAddress",
    "firstName",
    "lastName",
    "title",
    "businessPhone",
    "salesperson",
    "celular",
    "funcao",
    "nivelHierarquico",
    "nivelInfluencia",
    "afinidade",
    "decisaoParaCompra",
    "contatoPreferencial",
    "diaNascimento",
    "mesNascimento",
    "anoNascimento",
    "escolaridade",
    "sexo",
    "estadoCivil",
    "naturezaOcupacao",
    "apelido",
    "hobby",
    "detalhamentoHobby",
    "faixaSalarial",
    "cadastroNaUniversidade",
    "tamanhoCamiseta",
    "timeFutebol",
    "tipoMusicaFavorita",
    "cursoFormacaoSuperiorTecnica",
    "instituicaoFormacaoSuperiorTecnica",
    "siteBlog",
    "codigoSiEmpresa",
    "dataUltAtualizacao"
})
public class ContatoEL {

    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "BusinessPhone")
    protected String businessPhone;
    @XmlElement(name = "Salesperson")
    protected String salesperson;
    @XmlElement(name = "Celular")
    protected String celular;
    @XmlElement(name = "Funcao")
    protected String funcao;
    @XmlElement(name = "NivelHierarquico")
    protected String nivelHierarquico;
    @XmlElement(name = "NivelInfluencia")
    protected String nivelInfluencia;
    @XmlElement(name = "Afinidade")
    protected String afinidade;
    @XmlElement(name = "DecisaoParaCompra")
    protected String decisaoParaCompra;
    @XmlElement(name = "ContatoPreferencial")
    protected String contatoPreferencial;
    @XmlElement(name = "DiaNascimento")
    protected int diaNascimento;
    @XmlElement(name = "MesNascimento")
    protected int mesNascimento;
    @XmlElement(name = "AnoNascimento")
    protected int anoNascimento;
    @XmlElement(name = "Escolaridade")
    protected String escolaridade;
    @XmlElement(name = "Sexo")
    protected String sexo;
    @XmlElement(name = "EstadoCivil")
    protected String estadoCivil;
    @XmlElement(name = "NaturezaOcupacao")
    protected String naturezaOcupacao;
    @XmlElement(name = "Apelido")
    protected String apelido;
    @XmlElement(name = "Hobby")
    protected String hobby;
    @XmlElement(name = "DetalhamentoHobby")
    protected String detalhamentoHobby;
    @XmlElement(name = "FaixaSalarial", required = true)
    protected BigDecimal faixaSalarial;
    @XmlElement(name = "CadastroNaUniversidade")
    protected String cadastroNaUniversidade;
    @XmlElement(name = "TamanhoCamiseta")
    protected String tamanhoCamiseta;
    @XmlElement(name = "TimeFutebol")
    protected String timeFutebol;
    @XmlElement(name = "TipoMusicaFavorita")
    protected String tipoMusicaFavorita;
    @XmlElement(name = "CursoFormacaoSuperiorTecnica")
    protected String cursoFormacaoSuperiorTecnica;
    @XmlElement(name = "InstituicaoFormacaoSuperiorTecnica")
    protected String instituicaoFormacaoSuperiorTecnica;
    @XmlElement(name = "SiteBlog")
    protected String siteBlog;
    @XmlElement(name = "CodigoSiEmpresa")
    protected int codigoSiEmpresa;
    @XmlElement(name = "DataUltAtualizacao", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataUltAtualizacao;

    /**
     * Obtém o valor da propriedade emailAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Define o valor da propriedade emailAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Obtém o valor da propriedade firstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Define o valor da propriedade firstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Obtém o valor da propriedade lastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Define o valor da propriedade lastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Obtém o valor da propriedade title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Define o valor da propriedade title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Obtém o valor da propriedade businessPhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPhone() {
        return businessPhone;
    }

    /**
     * Define o valor da propriedade businessPhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPhone(String value) {
        this.businessPhone = value;
    }

    /**
     * Obtém o valor da propriedade salesperson.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesperson() {
        return salesperson;
    }

    /**
     * Define o valor da propriedade salesperson.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesperson(String value) {
        this.salesperson = value;
    }

    /**
     * Obtém o valor da propriedade celular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCelular() {
        return celular;
    }

    /**
     * Define o valor da propriedade celular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCelular(String value) {
        this.celular = value;
    }

    /**
     * Obtém o valor da propriedade funcao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuncao() {
        return funcao;
    }

    /**
     * Define o valor da propriedade funcao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuncao(String value) {
        this.funcao = value;
    }

    /**
     * Obtém o valor da propriedade nivelHierarquico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNivelHierarquico() {
        return nivelHierarquico;
    }

    /**
     * Define o valor da propriedade nivelHierarquico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNivelHierarquico(String value) {
        this.nivelHierarquico = value;
    }

    /**
     * Obtém o valor da propriedade nivelInfluencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNivelInfluencia() {
        return nivelInfluencia;
    }

    /**
     * Define o valor da propriedade nivelInfluencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNivelInfluencia(String value) {
        this.nivelInfluencia = value;
    }

    /**
     * Obtém o valor da propriedade afinidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfinidade() {
        return afinidade;
    }

    /**
     * Define o valor da propriedade afinidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfinidade(String value) {
        this.afinidade = value;
    }

    /**
     * Obtém o valor da propriedade decisaoParaCompra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisaoParaCompra() {
        return decisaoParaCompra;
    }

    /**
     * Define o valor da propriedade decisaoParaCompra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisaoParaCompra(String value) {
        this.decisaoParaCompra = value;
    }

    /**
     * Obtém o valor da propriedade contatoPreferencial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContatoPreferencial() {
        return contatoPreferencial;
    }

    /**
     * Define o valor da propriedade contatoPreferencial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContatoPreferencial(String value) {
        this.contatoPreferencial = value;
    }

    /**
     * Obtém o valor da propriedade diaNascimento.
     * 
     */
    public int getDiaNascimento() {
        return diaNascimento;
    }

    /**
     * Define o valor da propriedade diaNascimento.
     * 
     */
    public void setDiaNascimento(int value) {
        this.diaNascimento = value;
    }

    /**
     * Obtém o valor da propriedade mesNascimento.
     * 
     */
    public int getMesNascimento() {
        return mesNascimento;
    }

    /**
     * Define o valor da propriedade mesNascimento.
     * 
     */
    public void setMesNascimento(int value) {
        this.mesNascimento = value;
    }

    /**
     * Obtém o valor da propriedade anoNascimento.
     * 
     */
    public int getAnoNascimento() {
        return anoNascimento;
    }

    /**
     * Define o valor da propriedade anoNascimento.
     * 
     */
    public void setAnoNascimento(int value) {
        this.anoNascimento = value;
    }

    /**
     * Obtém o valor da propriedade escolaridade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscolaridade() {
        return escolaridade;
    }

    /**
     * Define o valor da propriedade escolaridade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscolaridade(String value) {
        this.escolaridade = value;
    }

    /**
     * Obtém o valor da propriedade sexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Define o valor da propriedade sexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexo(String value) {
        this.sexo = value;
    }

    /**
     * Obtém o valor da propriedade estadoCivil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * Define o valor da propriedade estadoCivil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoCivil(String value) {
        this.estadoCivil = value;
    }

    /**
     * Obtém o valor da propriedade naturezaOcupacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaturezaOcupacao() {
        return naturezaOcupacao;
    }

    /**
     * Define o valor da propriedade naturezaOcupacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaturezaOcupacao(String value) {
        this.naturezaOcupacao = value;
    }

    /**
     * Obtém o valor da propriedade apelido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApelido() {
        return apelido;
    }

    /**
     * Define o valor da propriedade apelido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApelido(String value) {
        this.apelido = value;
    }

    /**
     * Obtém o valor da propriedade hobby.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHobby() {
        return hobby;
    }

    /**
     * Define o valor da propriedade hobby.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHobby(String value) {
        this.hobby = value;
    }

    /**
     * Obtém o valor da propriedade detalhamentoHobby.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetalhamentoHobby() {
        return detalhamentoHobby;
    }

    /**
     * Define o valor da propriedade detalhamentoHobby.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetalhamentoHobby(String value) {
        this.detalhamentoHobby = value;
    }

    /**
     * Obtém o valor da propriedade faixaSalarial.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFaixaSalarial() {
        return faixaSalarial;
    }

    /**
     * Define o valor da propriedade faixaSalarial.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFaixaSalarial(BigDecimal value) {
        this.faixaSalarial = value;
    }

    /**
     * Obtém o valor da propriedade cadastroNaUniversidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCadastroNaUniversidade() {
        return cadastroNaUniversidade;
    }

    /**
     * Define o valor da propriedade cadastroNaUniversidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCadastroNaUniversidade(String value) {
        this.cadastroNaUniversidade = value;
    }

    /**
     * Obtém o valor da propriedade tamanhoCamiseta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTamanhoCamiseta() {
        return tamanhoCamiseta;
    }

    /**
     * Define o valor da propriedade tamanhoCamiseta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTamanhoCamiseta(String value) {
        this.tamanhoCamiseta = value;
    }

    /**
     * Obtém o valor da propriedade timeFutebol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeFutebol() {
        return timeFutebol;
    }

    /**
     * Define o valor da propriedade timeFutebol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeFutebol(String value) {
        this.timeFutebol = value;
    }

    /**
     * Obtém o valor da propriedade tipoMusicaFavorita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoMusicaFavorita() {
        return tipoMusicaFavorita;
    }

    /**
     * Define o valor da propriedade tipoMusicaFavorita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoMusicaFavorita(String value) {
        this.tipoMusicaFavorita = value;
    }

    /**
     * Obtém o valor da propriedade cursoFormacaoSuperiorTecnica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCursoFormacaoSuperiorTecnica() {
        return cursoFormacaoSuperiorTecnica;
    }

    /**
     * Define o valor da propriedade cursoFormacaoSuperiorTecnica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCursoFormacaoSuperiorTecnica(String value) {
        this.cursoFormacaoSuperiorTecnica = value;
    }

    /**
     * Obtém o valor da propriedade instituicaoFormacaoSuperiorTecnica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstituicaoFormacaoSuperiorTecnica() {
        return instituicaoFormacaoSuperiorTecnica;
    }

    /**
     * Define o valor da propriedade instituicaoFormacaoSuperiorTecnica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstituicaoFormacaoSuperiorTecnica(String value) {
        this.instituicaoFormacaoSuperiorTecnica = value;
    }

    /**
     * Obtém o valor da propriedade siteBlog.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteBlog() {
        return siteBlog;
    }

    /**
     * Define o valor da propriedade siteBlog.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteBlog(String value) {
        this.siteBlog = value;
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
