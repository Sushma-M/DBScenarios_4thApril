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
 * FloatMany2oneP generated by hbm2java
 */
@Entity
@Table(name="`Float_Many2One_P`"
)

public class FloatMany2oneP  implements java.io.Serializable {

    
    private Double id;
    
    private Double floatCol1;
    
    private Set<FloatMany2oneC> floatMany2oneCs = new HashSet<FloatMany2oneC>(0);

    public FloatMany2oneP() {
    }


    @Id 
    

    @Column(name="`ID`", precision=12, scale=4)
    public Double getId() {
        return this.id;
    }
    
    public void setId(Double id) {
        this.id = id;
    }

    

    @Column(name="`FloatCol1`", precision=12, scale=4)
    public Double getFloatCol1() {
        return this.floatCol1;
    }
    
    public void setFloatCol1(Double floatCol1) {
        this.floatCol1 = floatCol1;
    }

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="floatMany2oneP")
    public Set<FloatMany2oneC> getFloatMany2oneCs() {
        return this.floatMany2oneCs;
    }
    
    public void setFloatMany2oneCs(Set<FloatMany2oneC> floatMany2oneCs) {
        this.floatMany2oneCs = floatMany2oneCs;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof FloatMany2oneP) )
		    return false;

		 FloatMany2oneP that = (FloatMany2oneP) o;

		 return ( (this.getId()==that.getId()) || ( this.getId()!=null && that.getId()!=null && this.getId().equals(that.getId()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );

         return result;
    }


}

