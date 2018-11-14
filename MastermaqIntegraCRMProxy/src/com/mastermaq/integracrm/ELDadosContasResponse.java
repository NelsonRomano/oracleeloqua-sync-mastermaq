
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
 *         &lt;element name="EL_DadosContasResult" type="{http://tempuri.org/}ArrayOfContaEL" minOccurs="0"/>
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
    "elDadosContasResult"
})
@XmlRootElement(name = "EL_DadosContasResponse")
public class ELDadosContasResponse {

    @XmlElement(name = "EL_DadosContasResult")
    protected ArrayOfContaEL elDadosContasResult;

    /**
     * Obtém o valor da propriedade elDadosContasResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContaEL }
     *     
     */
    public ArrayOfContaEL getELDadosContasResult() {
        return elDadosContasResult;
    }

    /**
     * Define o valor da propriedade elDadosContasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContaEL }
     *     
     */
    public void setELDadosContasResult(ArrayOfContaEL value) {
        this.elDadosContasResult = value;
    }

}
