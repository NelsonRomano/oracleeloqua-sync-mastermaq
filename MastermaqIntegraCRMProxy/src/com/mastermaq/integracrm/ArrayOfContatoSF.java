
package com.mastermaq.integracrm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfContatoSF complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfContatoSF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContatoSF" type="{http://tempuri.org/}ContatoSF" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfContatoSF", propOrder = {
    "contatoSF"
})
public class ArrayOfContatoSF {

    @XmlElement(name = "ContatoSF", nillable = true)
    protected List<ContatoSF> contatoSF;

    /**
     * Gets the value of the contatoSF property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contatoSF property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContatoSF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContatoSF }
     * 
     * 
     */
    public List<ContatoSF> getContatoSF() {
        if (contatoSF == null) {
            contatoSF = new ArrayList<ContatoSF>();
        }
        return this.contatoSF;
    }

}
