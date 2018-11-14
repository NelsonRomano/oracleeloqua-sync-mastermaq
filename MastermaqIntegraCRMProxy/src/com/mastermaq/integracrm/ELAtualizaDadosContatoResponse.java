
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
 *         &lt;element name="EL_AtualizaDadosContatoResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "elAtualizaDadosContatoResult"
})
@XmlRootElement(name = "EL_AtualizaDadosContatoResponse")
public class ELAtualizaDadosContatoResponse {

    @XmlElement(name = "EL_AtualizaDadosContatoResult")
    protected String elAtualizaDadosContatoResult;

    /**
     * Obtém o valor da propriedade elAtualizaDadosContatoResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELAtualizaDadosContatoResult() {
        return elAtualizaDadosContatoResult;
    }

    /**
     * Define o valor da propriedade elAtualizaDadosContatoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELAtualizaDadosContatoResult(String value) {
        this.elAtualizaDadosContatoResult = value;
    }

}
