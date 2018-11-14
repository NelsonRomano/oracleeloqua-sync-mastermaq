
package com.mastermaq.integracrm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfContaEL complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfContaEL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContaEL" type="{http://tempuri.org/}ContaEL" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfContaEL", propOrder = {
    "contaEL"
})
public class ArrayOfContaEL {

    @XmlElement(name = "ContaEL", nillable = true)
    protected List<ContaEL> contaEL;

    /**
     * Gets the value of the contaEL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contaEL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContaEL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContaEL }
     * 
     * 
     */
    public List<ContaEL> getContaEL() {
        if (contaEL == null) {
            contaEL = new ArrayList<ContaEL>();
        }
        return this.contaEL;
    }

}
