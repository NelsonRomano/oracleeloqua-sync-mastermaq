
package com.mastermaq.integracrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Oportunidade complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Oportunidade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodCliente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Assunto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Oportunidade", propOrder = {
    "codCliente",
    "assunto",
    "descricao",
    "tipo"
})
public class Oportunidade {

    @XmlElement(name = "CodCliente")
    protected int codCliente;
    @XmlElement(name = "Assunto")
    protected String assunto;
    @XmlElement(name = "Descricao")
    protected String descricao;
    @XmlElement(name = "Tipo")
    protected int tipo;

    /**
     * Obtém o valor da propriedade codCliente.
     * 
     */
    public int getCodCliente() {
        return codCliente;
    }

    /**
     * Define o valor da propriedade codCliente.
     * 
     */
    public void setCodCliente(int value) {
        this.codCliente = value;
    }

    /**
     * Obtém o valor da propriedade assunto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssunto() {
        return assunto;
    }

    /**
     * Define o valor da propriedade assunto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssunto(String value) {
        this.assunto = value;
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
     * Obtém o valor da propriedade tipo.
     * 
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * Define o valor da propriedade tipo.
     * 
     */
    public void setTipo(int value) {
        this.tipo = value;
    }

}
