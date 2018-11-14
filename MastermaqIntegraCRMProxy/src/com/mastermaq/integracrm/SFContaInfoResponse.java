
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
 *         &lt;element name="SF_ContaInfoResult" type="{http://tempuri.org/}ArrayOfContaSF" minOccurs="0"/>
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
    "sfContaInfoResult"
})
@XmlRootElement(name = "SF_ContaInfoResponse")
public class SFContaInfoResponse {

    @XmlElement(name = "SF_ContaInfoResult")
    protected ArrayOfContaSF sfContaInfoResult;

    /**
     * Obtém o valor da propriedade sfContaInfoResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContaSF }
     *     
     */
    public ArrayOfContaSF getSFContaInfoResult() {
        return sfContaInfoResult;
    }

    /**
     * Define o valor da propriedade sfContaInfoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContaSF }
     *     
     */
    public void setSFContaInfoResult(ArrayOfContaSF value) {
        this.sfContaInfoResult = value;
    }

}
