
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
 *         &lt;element name="SF_ProdutoInfoResult" type="{http://tempuri.org/}ArrayOfProdutoSF" minOccurs="0"/>
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
    "sfProdutoInfoResult"
})
@XmlRootElement(name = "SF_ProdutoInfoResponse")
public class SFProdutoInfoResponse {

    @XmlElement(name = "SF_ProdutoInfoResult")
    protected ArrayOfProdutoSF sfProdutoInfoResult;

    /**
     * Obtém o valor da propriedade sfProdutoInfoResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProdutoSF }
     *     
     */
    public ArrayOfProdutoSF getSFProdutoInfoResult() {
        return sfProdutoInfoResult;
    }

    /**
     * Define o valor da propriedade sfProdutoInfoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProdutoSF }
     *     
     */
    public void setSFProdutoInfoResult(ArrayOfProdutoSF value) {
        this.sfProdutoInfoResult = value;
    }

}
