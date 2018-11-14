
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
 *         &lt;element name="EL_DadosContatosResult" type="{http://tempuri.org/}ArrayOfContatoEL" minOccurs="0"/>
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
    "elDadosContatosResult"
})
@XmlRootElement(name = "EL_DadosContatosResponse")
public class ELDadosContatosResponse {

    @XmlElement(name = "EL_DadosContatosResult")
    protected ArrayOfContatoEL elDadosContatosResult;

    /**
     * Obtém o valor da propriedade elDadosContatosResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContatoEL }
     *     
     */
    public ArrayOfContatoEL getELDadosContatosResult() {
        return elDadosContatosResult;
    }

    /**
     * Define o valor da propriedade elDadosContatosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContatoEL }
     *     
     */
    public void setELDadosContatosResult(ArrayOfContatoEL value) {
        this.elDadosContatosResult = value;
    }

}
