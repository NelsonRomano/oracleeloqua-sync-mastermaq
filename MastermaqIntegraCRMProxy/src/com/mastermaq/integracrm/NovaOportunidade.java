
package com.mastermaq.integracrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="oportunidade" type="{http://tempuri.org/}Oportunidade" minOccurs="0"/>
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
    "oportunidade"
})
@XmlRootElement(name = "NovaOportunidade")
public class NovaOportunidade {

    protected Oportunidade oportunidade;

    /**
     * Obtém o valor da propriedade oportunidade.
     * 
     * @return
     *     possible object is
     *     {@link Oportunidade }
     *     
     */
    public Oportunidade getOportunidade() {
        return oportunidade;
    }

    /**
     * Define o valor da propriedade oportunidade.
     * 
     * @param value
     *     allowed object is
     *     {@link Oportunidade }
     *     
     */
    public void setOportunidade(Oportunidade value) {
        this.oportunidade = value;
    }

}
