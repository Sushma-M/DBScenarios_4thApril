/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.dbscenarios_30mar.allo2m_o2o;

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
 * DoubleMany2oneP generated by hbm2java
 */
@Entity
@Table(name="`Double_Many2One_P`"
)

public class DoubleMany2oneP  implements java.io.Serializable {

    
    private Double doubleId;
    
    private Double doubleCol1;
    
    private Set<DoubleMany2oneC> doubleMany2oneCs = new HashSet<DoubleMany2oneC>(0);

    public DoubleMany2oneP() {
    }


    @Id 
    

    @Column(name="`DoubleID`", precision=18, scale=8)
    public Double getDoubleId() {
        return this.doubleId;
    }
    
    public void setDoubleId(Double doubleId) {
        this.doubleId = doubleId;
    }

    

    @Column(name="`DoubleCol1`", precision=18, scale=8)
    public Double getDoubleCol1() {
        return this.doubleCol1;
    }
    
    public void setDoubleCol1(Double doubleCol1) {
        this.doubleCol1 = doubleCol1;
    }

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="doubleMany2oneP")
    public Set<DoubleMany2oneC> getDoubleMany2oneCs() {
        return this.doubleMany2oneCs;
    }
    
    public void setDoubleMany2oneCs(Set<DoubleMany2oneC> doubleMany2oneCs) {
        this.doubleMany2oneCs = doubleMany2oneCs;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof DoubleMany2oneP) )
		    return false;

		 DoubleMany2oneP that = (DoubleMany2oneP) o;

		 return ( (this.getDoubleId()==that.getDoubleId()) || ( this.getDoubleId()!=null && that.getDoubleId()!=null && this.getDoubleId().equals(that.getDoubleId()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getDoubleId() == null ? 0 : this.getDoubleId().hashCode() );

         return result;
    }


}
