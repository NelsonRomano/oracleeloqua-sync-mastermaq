
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
 *         &lt;element name="SF_OportunidadeInfoResult" type="{http://tempuri.org/}ArrayOfOportunidadeSF" minOccurs="0"/>
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
    "sfOportunidadeInfoResult"
})
@XmlRootElement(name = "SF_OportunidadeInfoResponse")
public class SFOportunidadeInfoResponse {

    @XmlElement(name = "SF_OportunidadeInfoResult")
    protected ArrayOfOportunidadeSF sfOportunidadeInfoResult;

    /**
     * Obtém o valor da propriedade sfOportunidadeInfoResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOportunidadeSF }
     *     
     */
    public ArrayOfOportunidadeSF getSFOportunidadeInfoResult() {
        return sfOportunidadeInfoResult;
    }

    /**
     * Define o valor da propriedade sfOportunidadeInfoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOportunidadeSF }
     *     
     */
    public void setSFOportunidadeInfoResult(ArrayOfOportunidadeSF value) {
        this.sfOportunidadeInfoResult = value;
    }

}
