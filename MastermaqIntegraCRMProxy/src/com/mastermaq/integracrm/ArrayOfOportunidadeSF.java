
package com.mastermaq.integracrm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfOportunidadeSF complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOportunidadeSF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OportunidadeSF" type="{http://tempuri.org/}OportunidadeSF" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOportunidadeSF", propOrder = {
    "oportunidadeSF"
})
public class ArrayOfOportunidadeSF {

    @XmlElement(name = "OportunidadeSF", nillable = true)
    protected List<OportunidadeSF> oportunidadeSF;

    /**
     * Gets the value of the oportunidadeSF property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oportunidadeSF property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOportunidadeSF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OportunidadeSF }
     * 
     * 
     */
    public List<OportunidadeSF> getOportunidadeSF() {
        if (oportunidadeSF == null) {
            oportunidadeSF = new ArrayList<OportunidadeSF>();
        }
        return this.oportunidadeSF;
    }

}
