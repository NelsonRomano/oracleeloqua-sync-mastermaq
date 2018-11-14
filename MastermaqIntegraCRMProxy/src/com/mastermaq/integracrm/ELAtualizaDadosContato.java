
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
 *         &lt;element name="contato" type="{http://tempuri.org/}ContatoEL" minOccurs="0"/>
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
    "contato"
})
@XmlRootElement(name = "EL_AtualizaDadosContato")
public class ELAtualizaDadosContato {

    protected ContatoEL contato;

    /**
     * Obtém o valor da propriedade contato.
     * 
     * @return
     *     possible object is
     *     {@link ContatoEL }
     *     
     */
    public ContatoEL getContato() {
        return contato;
    }

    /**
     * Define o valor da propriedade contato.
     * 
     * @param value
     *     allowed object is
     *     {@link ContatoEL }
     *     
     */
    public void setContato(ContatoEL value) {
        this.contato = value;
    }

}
