
package com.mastermaq.integracrm;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OportunidadeSF complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OportunidadeSF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoConta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Responsavel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PossibilidadeGanho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Anexos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataPrevisaoFechamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataCriacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MotivoPerdaGanho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Moeda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValorTotal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PrincipalCompetidor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CanalDeVenda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoProcesso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fonte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoOportunidade" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NomeDemonstradorAtual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataDemonstracao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataParecer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusDemonstracao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoDemonstracao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdutoLista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValorMensalidade" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ValorServico" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ValorAdesao" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="NumeroParcelamentoProduto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroParcelamentoServico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataPagamentoTaxaAdesao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PercDescontoTaxaAdesao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataPrimeiroEnvioProposta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataUltumoEnvioProposta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QtdPropostaEnviada" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DataUltimoComentarioConsultor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataAgendadaParaRetorno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataAceite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MotivoAceite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataFechamentoNegativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MotivoFechamentoNegativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NomeContato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContatoDecisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OportunidadeSF", propOrder = {
    "codigoConta",
    "cliente",
    "responsavel",
    "possibilidadeGanho",
    "anexos",
    "dataPrevisaoFechamento",
    "dataCriacao",
    "status",
    "motivoPerdaGanho",
    "moeda",
    "valorTotal",
    "principalCompetidor",
    "canalDeVenda",
    "tipoProcesso",
    "fonte",
    "codigoOportunidade",
    "nomeDemonstradorAtual",
    "dataDemonstracao",
    "dataParecer",
    "statusDemonstracao",
    "tipoDemonstracao",
    "tipo",
    "produtoLista",
    "valorMensalidade",
    "valorServico",
    "valorAdesao",
    "numeroParcelamentoProduto",
    "numeroParcelamentoServico",
    "dataPagamentoTaxaAdesao",
    "percDescontoTaxaAdesao",
    "dataPrimeiroEnvioProposta",
    "dataUltumoEnvioProposta",
    "qtdPropostaEnviada",
    "dataUltimoComentarioConsultor",
    "dataAgendadaParaRetorno",
    "dataAceite",
    "motivoAceite",
    "dataFechamentoNegativo",
    "motivoFechamentoNegativo",
    "nomeContato",
    "contatoDecisor"
})
public class OportunidadeSF {

    @XmlElement(name = "CodigoConta")
    protected int codigoConta;
    @XmlElement(name = "Cliente")
    protected String cliente;
    @XmlElement(name = "Responsavel")
    protected String responsavel;
    @XmlElement(name = "PossibilidadeGanho")
    protected String possibilidadeGanho;
    @XmlElement(name = "Anexos")
    protected String anexos;
    @XmlElement(name = "DataPrevisaoFechamento")
    protected String dataPrevisaoFechamento;
    @XmlElement(name = "DataCriacao")
    protected String dataCriacao;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "MotivoPerdaGanho")
    protected String motivoPerdaGanho;
    @XmlElement(name = "Moeda")
    protected String moeda;
    @XmlElement(name = "ValorTotal", required = true)
    protected BigDecimal valorTotal;
    @XmlElement(name = "PrincipalCompetidor")
    protected String principalCompetidor;
    @XmlElement(name = "CanalDeVenda")
    protected String canalDeVenda;
    @XmlElement(name = "TipoProcesso")
    protected String tipoProcesso;
    @XmlElement(name = "Fonte")
    protected String fonte;
    @XmlElement(name = "CodigoOportunidade")
    protected int codigoOportunidade;
    @XmlElement(name = "NomeDemonstradorAtual")
    protected String nomeDemonstradorAtual;
    @XmlElement(name = "DataDemonstracao")
    protected String dataDemonstracao;
    @XmlElement(name = "DataParecer")
    protected String dataParecer;
    @XmlElement(name = "StatusDemonstracao")
    protected String statusDemonstracao;
    @XmlElement(name = "TipoDemonstracao")
    protected String tipoDemonstracao;
    @XmlElement(name = "Tipo")
    protected String tipo;
    @XmlElement(name = "ProdutoLista")
    protected String produtoLista;
    @XmlElement(name = "ValorMensalidade", required = true)
    protected BigDecimal valorMensalidade;
    @XmlElement(name = "ValorServico", required = true)
    protected BigDecimal valorServico;
    @XmlElement(name = "ValorAdesao", required = true)
    protected BigDecimal valorAdesao;
    @XmlElement(name = "NumeroParcelamentoProduto")
    protected String numeroParcelamentoProduto;
    @XmlElement(name = "NumeroParcelamentoServico")
    protected String numeroParcelamentoServico;
    @XmlElement(name = "DataPagamentoTaxaAdesao")
    protected String dataPagamentoTaxaAdesao;
    @XmlElement(name = "PercDescontoTaxaAdesao")
    protected String percDescontoTaxaAdesao;
    @XmlElement(name = "DataPrimeiroEnvioProposta")
    protected String dataPrimeiroEnvioProposta;
    @XmlElement(name = "DataUltumoEnvioProposta")
    protected String dataUltumoEnvioProposta;
    @XmlElement(name = "QtdPropostaEnviada")
    protected int qtdPropostaEnviada;
    @XmlElement(name = "DataUltimoComentarioConsultor")
    protected String dataUltimoComentarioConsultor;
    @XmlElement(name = "DataAgendadaParaRetorno")
    protected String dataAgendadaParaRetorno;
    @XmlElement(name = "DataAceite")
    protected String dataAceite;
    @XmlElement(name = "MotivoAceite")
    protected String motivoAceite;
    @XmlElement(name = "DataFechamentoNegativo")
    protected String dataFechamentoNegativo;
    @XmlElement(name = "MotivoFechamentoNegativo")
    protected String motivoFechamentoNegativo;
    @XmlElement(name = "NomeContato")
    protected String nomeContato;
    @XmlElement(name = "ContatoDecisor")
    protected String contatoDecisor;

    /**
     * Obtém o valor da propriedade codigoConta.
     * 
     */
    public int getCodigoConta() {
        return codigoConta;
    }

    /**
     * Define o valor da propriedade codigoConta.
     * 
     */
    public void setCodigoConta(int value) {
        this.codigoConta = value;
    }

    /**
     * Obtém o valor da propriedade cliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * Define o valor da propriedade cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCliente(String value) {
        this.cliente = value;
    }

    /**
     * Obtém o valor da propriedade responsavel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsavel() {
        return responsavel;
    }

    /**
     * Define o valor da propriedade responsavel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsavel(String value) {
        this.responsavel = value;
    }

    /**
     * Obtém o valor da propriedade possibilidadeGanho.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPossibilidadeGanho() {
        return possibilidadeGanho;
    }

    /**
     * Define o valor da propriedade possibilidadeGanho.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPossibilidadeGanho(String value) {
        this.possibilidadeGanho = value;
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
     * Obtém o valor da propriedade dataPrevisaoFechamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataPrevisaoFechamento() {
        return dataPrevisaoFechamento;
    }

    /**
     * Define o valor da propriedade dataPrevisaoFechamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataPrevisaoFechamento(String value) {
        this.dataPrevisaoFechamento = value;
    }

    /**
     * Obtém o valor da propriedade dataCriacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataCriacao() {
        return dataCriacao;
    }

    /**
     * Define o valor da propriedade dataCriacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCriacao(String value) {
        this.dataCriacao = value;
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtém o valor da propriedade motivoPerdaGanho.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoPerdaGanho() {
        return motivoPerdaGanho;
    }

    /**
     * Define o valor da propriedade motivoPerdaGanho.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoPerdaGanho(String value) {
        this.motivoPerdaGanho = value;
    }

    /**
     * Obtém o valor da propriedade moeda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoeda() {
        return moeda;
    }

    /**
     * Define o valor da propriedade moeda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoeda(String value) {
        this.moeda = value;
    }

    /**
     * Obtém o valor da propriedade valorTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    /**
     * Define o valor da propriedade valorTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotal(BigDecimal value) {
        this.valorTotal = value;
    }

    /**
     * Obtém o valor da propriedade principalCompetidor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipalCompetidor() {
        return principalCompetidor;
    }

    /**
     * Define o valor da propriedade principalCompetidor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipalCompetidor(String value) {
        this.principalCompetidor = value;
    }

    /**
     * Obtém o valor da propriedade canalDeVenda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanalDeVenda() {
        return canalDeVenda;
    }

    /**
     * Define o valor da propriedade canalDeVenda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanalDeVenda(String value) {
        this.canalDeVenda = value;
    }

    /**
     * Obtém o valor da propriedade tipoProcesso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoProcesso() {
        return tipoProcesso;
    }

    /**
     * Define o valor da propriedade tipoProcesso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoProcesso(String value) {
        this.tipoProcesso = value;
    }

    /**
     * Obtém o valor da propriedade fonte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFonte() {
        return fonte;
    }

    /**
     * Define o valor da propriedade fonte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFonte(String value) {
        this.fonte = value;
    }

    /**
     * Obtém o valor da propriedade codigoOportunidade.
     * 
     */
    public int getCodigoOportunidade() {
        return codigoOportunidade;
    }

    /**
     * Define o valor da propriedade codigoOportunidade.
     * 
     */
    public void setCodigoOportunidade(int value) {
        this.codigoOportunidade = value;
    }

    /**
     * Obtém o valor da propriedade nomeDemonstradorAtual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeDemonstradorAtual() {
        return nomeDemonstradorAtual;
    }

    /**
     * Define o valor da propriedade nomeDemonstradorAtual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeDemonstradorAtual(String value) {
        this.nomeDemonstradorAtual = value;
    }

    /**
     * Obtém o valor da propriedade dataDemonstracao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataDemonstracao() {
        return dataDemonstracao;
    }

    /**
     * Define o valor da propriedade dataDemonstracao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDemonstracao(String value) {
        this.dataDemonstracao = value;
    }

    /**
     * Obtém o valor da propriedade dataParecer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataParecer() {
        return dataParecer;
    }

    /**
     * Define o valor da propriedade dataParecer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataParecer(String value) {
        this.dataParecer = value;
    }

    /**
     * Obtém o valor da propriedade statusDemonstracao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDemonstracao() {
        return statusDemonstracao;
    }

    /**
     * Define o valor da propriedade statusDemonstracao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDemonstracao(String value) {
        this.statusDemonstracao = value;
    }

    /**
     * Obtém o valor da propriedade tipoDemonstracao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDemonstracao() {
        return tipoDemonstracao;
    }

    /**
     * Define o valor da propriedade tipoDemonstracao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDemonstracao(String value) {
        this.tipoDemonstracao = value;
    }

    /**
     * Obtém o valor da propriedade tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define o valor da propriedade tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Obtém o valor da propriedade produtoLista.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdutoLista() {
        return produtoLista;
    }

    /**
     * Define o valor da propriedade produtoLista.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdutoLista(String value) {
        this.produtoLista = value;
    }

    /**
     * Obtém o valor da propriedade valorMensalidade.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorMensalidade() {
        return valorMensalidade;
    }

    /**
     * Define o valor da propriedade valorMensalidade.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorMensalidade(BigDecimal value) {
        this.valorMensalidade = value;
    }

    /**
     * Obtém o valor da propriedade valorServico.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorServico() {
        return valorServico;
    }

    /**
     * Define o valor da propriedade valorServico.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorServico(BigDecimal value) {
        this.valorServico = value;
    }

    /**
     * Obtém o valor da propriedade valorAdesao.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorAdesao() {
        return valorAdesao;
    }

    /**
     * Define o valor da propriedade valorAdesao.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorAdesao(BigDecimal value) {
        this.valorAdesao = value;
    }

    /**
     * Obtém o valor da propriedade numeroParcelamentoProduto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroParcelamentoProduto() {
        return numeroParcelamentoProduto;
    }

    /**
     * Define o valor da propriedade numeroParcelamentoProduto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroParcelamentoProduto(String value) {
        this.numeroParcelamentoProduto = value;
    }

    /**
     * Obtém o valor da propriedade numeroParcelamentoServico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroParcelamentoServico() {
        return numeroParcelamentoServico;
    }

    /**
     * Define o valor da propriedade numeroParcelamentoServico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroParcelamentoServico(String value) {
        this.numeroParcelamentoServico = value;
    }

    /**
     * Obtém o valor da propriedade dataPagamentoTaxaAdesao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataPagamentoTaxaAdesao() {
        return dataPagamentoTaxaAdesao;
    }

    /**
     * Define o valor da propriedade dataPagamentoTaxaAdesao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataPagamentoTaxaAdesao(String value) {
        this.dataPagamentoTaxaAdesao = value;
    }

    /**
     * Obtém o valor da propriedade percDescontoTaxaAdesao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercDescontoTaxaAdesao() {
        return percDescontoTaxaAdesao;
    }

    /**
     * Define o valor da propriedade percDescontoTaxaAdesao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercDescontoTaxaAdesao(String value) {
        this.percDescontoTaxaAdesao = value;
    }

    /**
     * Obtém o valor da propriedade dataPrimeiroEnvioProposta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataPrimeiroEnvioProposta() {
        return dataPrimeiroEnvioProposta;
    }

    /**
     * Define o valor da propriedade dataPrimeiroEnvioProposta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataPrimeiroEnvioProposta(String value) {
        this.dataPrimeiroEnvioProposta = value;
    }

    /**
     * Obtém o valor da propriedade dataUltumoEnvioProposta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataUltumoEnvioProposta() {
        return dataUltumoEnvioProposta;
    }

    /**
     * Define o valor da propriedade dataUltumoEnvioProposta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataUltumoEnvioProposta(String value) {
        this.dataUltumoEnvioProposta = value;
    }

    /**
     * Obtém o valor da propriedade qtdPropostaEnviada.
     * 
     */
    public int getQtdPropostaEnviada() {
        return qtdPropostaEnviada;
    }

    /**
     * Define o valor da propriedade qtdPropostaEnviada.
     * 
     */
    public void setQtdPropostaEnviada(int value) {
        this.qtdPropostaEnviada = value;
    }

    /**
     * Obtém o valor da propriedade dataUltimoComentarioConsultor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataUltimoComentarioConsultor() {
        return dataUltimoComentarioConsultor;
    }

    /**
     * Define o valor da propriedade dataUltimoComentarioConsultor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataUltimoComentarioConsultor(String value) {
        this.dataUltimoComentarioConsultor = value;
    }

    /**
     * Obtém o valor da propriedade dataAgendadaParaRetorno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAgendadaParaRetorno() {
        return dataAgendadaParaRetorno;
    }

    /**
     * Define o valor da propriedade dataAgendadaParaRetorno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAgendadaParaRetorno(String value) {
        this.dataAgendadaParaRetorno = value;
    }

    /**
     * Obtém o valor da propriedade dataAceite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAceite() {
        return dataAceite;
    }

    /**
     * Define o valor da propriedade dataAceite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAceite(String value) {
        this.dataAceite = value;
    }

    /**
     * Obtém o valor da propriedade motivoAceite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoAceite() {
        return motivoAceite;
    }

    /**
     * Define o valor da propriedade motivoAceite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoAceite(String value) {
        this.motivoAceite = value;
    }

    /**
     * Obtém o valor da propriedade dataFechamentoNegativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataFechamentoNegativo() {
        return dataFechamentoNegativo;
    }

    /**
     * Define o valor da propriedade dataFechamentoNegativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataFechamentoNegativo(String value) {
        this.dataFechamentoNegativo = value;
    }

    /**
     * Obtém o valor da propriedade motivoFechamentoNegativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoFechamentoNegativo() {
        return motivoFechamentoNegativo;
    }

    /**
     * Define o valor da propriedade motivoFechamentoNegativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoFechamentoNegativo(String value) {
        this.motivoFechamentoNegativo = value;
    }

    /**
     * Obtém o valor da propriedade nomeContato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeContato() {
        return nomeContato;
    }

    /**
     * Define o valor da propriedade nomeContato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeContato(String value) {
        this.nomeContato = value;
    }

    /**
     * Obtém o valor da propriedade contatoDecisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContatoDecisor() {
        return contatoDecisor;
    }

    /**
     * Define o valor da propriedade contatoDecisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContatoDecisor(String value) {
        this.contatoDecisor = value;
    }

}
