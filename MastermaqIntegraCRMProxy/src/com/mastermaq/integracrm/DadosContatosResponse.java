
package com.mastermaq.integracrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="DadosContatosResult" type="{http://tempuri.org/}ArrayOfContatoEL" minOccurs="0"/>
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
    "dadosContatosResult"
})
@XmlRootElement(name = "DadosContatosResponse")
public class DadosContatosResponse {

    @XmlElement(name = "DadosContatosResult")
    protected ArrayOfContatoEL dadosContatosResult;

    /**
     * Gets the value of the dadosContatosResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContatoEL }
     *     
     */
    public ArrayOfContatoEL getDadosContatosResult() {
        return dadosContatosResult;
    }

    /**
     * Sets the value of the dadosContatosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContatoEL }
     *     
     */
    public void setDadosContatosResult(ArrayOfContatoEL value) {
        this.dadosContatosResult = value;
    }

}
