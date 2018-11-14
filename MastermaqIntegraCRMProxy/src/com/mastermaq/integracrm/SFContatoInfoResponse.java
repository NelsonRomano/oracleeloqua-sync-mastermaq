
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
 *         &lt;element name="SF_ContatoInfoResult" type="{http://tempuri.org/}ArrayOfContatoSF" minOccurs="0"/>
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
    "sfContatoInfoResult"
})
@XmlRootElement(name = "SF_ContatoInfoResponse")
public class SFContatoInfoResponse {

    @XmlElement(name = "SF_ContatoInfoResult")
    protected ArrayOfContatoSF sfContatoInfoResult;

    /**
     * Obtém o valor da propriedade sfContatoInfoResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContatoSF }
     *     
     */
    public ArrayOfContatoSF getSFContatoInfoResult() {
        return sfContatoInfoResult;
    }

    /**
     * Define o valor da propriedade sfContatoInfoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContatoSF }
     *     
     */
    public void setSFContatoInfoResult(ArrayOfContatoSF value) {
        this.sfContatoInfoResult = value;
    }

}
