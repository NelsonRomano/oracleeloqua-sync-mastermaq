
package com.mastermaq.integracrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataAtualizacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "dataAtualizacao"
})
@XmlRootElement(name = "DadosContatos")
public class DadosContatos {

    protected String dataAtualizacao;

    /**
     * Gets the value of the dataAtualizacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAtualizacao() {
        return dataAtualizacao;
    }

    /**
     * Sets the value of the dataAtualizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAtualizacao(String value) {
        this.dataAtualizacao = value;
    }

}
