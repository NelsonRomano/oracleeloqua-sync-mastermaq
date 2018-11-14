
package com.mastermaq.integracrm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfContatoEL complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfContatoEL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContatoEL" type="{http://tempuri.org/}ContatoEL" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfContatoEL", propOrder = {
    "contatoEL"
})
public class ArrayOfContatoEL {

    @XmlElement(name = "ContatoEL", nillable = true)
    protected List<ContatoEL> contatoEL;

    /**
     * Gets the value of the contatoEL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contatoEL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContatoEL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContatoEL }
     * 
     * 
     */
    public List<ContatoEL> getContatoEL() {
        if (contatoEL == null) {
            contatoEL = new ArrayList<ContatoEL>();
        }
        return this.contatoEL;
    }

}
