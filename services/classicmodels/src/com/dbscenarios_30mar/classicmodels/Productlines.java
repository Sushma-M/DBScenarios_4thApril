/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.dbscenarios_30mar.classicmodels;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;



/**
 * Productlines generated by hbm2java
 */
@Entity
@Table(name="`productlines`"
)

public class Productlines  implements java.io.Serializable {

    
    private String productLine;
    
    private String textDescriptio;
    
    private String htmlDescription;
    
    private byte[] image;
    
    private String textDescription;
    
    private Set<Products> productses = new HashSet<Products>(0);

    public Productlines() {
    }


    @Id 
    

    @Column(name="`productLine`", length=50)
    public String getProductLine() {
        return this.productLine;
    }
    
    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    

    @Column(name="`textDescriptio`", length=4000)
    public String getTextDescriptio() {
        return this.textDescriptio;
    }
    
    public void setTextDescriptio(String textDescriptio) {
        this.textDescriptio = textDescriptio;
    }

    

    @Column(name="`htmlDescription`", length=16777215)
    public String getHtmlDescription() {
        return this.htmlDescription;
    }
    
    public void setHtmlDescription(String htmlDescription) {
        this.htmlDescription = htmlDescription;
    }

    

    @Column(name="`image`")
    public byte[] getImage() {
        return this.image;
    }
    
    public void setImage(byte[] image) {
        this.image = image;
    }

    

    @Column(name="`textDescription`", length=4000)
    public String getTextDescription() {
        return this.textDescription;
    }
    
    public void setTextDescription(String textDescription) {
        this.textDescription = textDescription;
    }

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="productlines")
    public Set<Products> getProductses() {
        return this.productses;
    }
    
    public void setProductses(Set<Products> productses) {
        this.productses = productses;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof Productlines) )
		    return false;

		 Productlines that = (Productlines) o;

		 return ( (this.getProductLine()==that.getProductLine()) || ( this.getProductLine()!=null && that.getProductLine()!=null && this.getProductLine().equals(that.getProductLine()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getProductLine() == null ? 0 : this.getProductLine().hashCode() );

         return result;
    }


}

