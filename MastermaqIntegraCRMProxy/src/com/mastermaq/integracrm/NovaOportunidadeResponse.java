
package com.mastermaq.integracrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NovaOportunidadeResult" type="{http://tempuri.org/}RetornoOportunidade" minOccurs="0"/>
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
    "novaOportunidadeResult"
})
@XmlRootElement(name = "NovaOportunidadeResponse")
public class NovaOportunidadeResponse {

    @XmlElement(name = "NovaOportunidadeResult")
    protected RetornoOportunidade novaOportunidadeResult;

    /**
     * Obtém o valor da propriedade novaOportunidadeResult.
     * 
     * @return
     *     possible object is
     *     {@link RetornoOportunidade }
     *     
     */
    public RetornoOportunidade getNovaOportunidadeResult() {
        return novaOportunidadeResult;
    }

    /**
     * Define o valor da propriedade novaOportunidadeResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RetornoOportunidade }
     *     
     */
    public void setNovaOportunidadeResult(RetornoOportunidade value) {
        this.novaOportunidadeResult = value;
    }

}
