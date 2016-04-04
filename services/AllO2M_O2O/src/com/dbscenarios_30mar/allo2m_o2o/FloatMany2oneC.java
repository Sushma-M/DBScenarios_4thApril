/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.dbscenarios_30mar.allo2m_o2o;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;



/**
 * FloatMany2oneC generated by hbm2java
 */
@Entity
@Table(name="`Float_Many2One_C`"
)

public class FloatMany2oneC  implements java.io.Serializable {

    
    private Double floatId;
    
    private FloatMany2oneP floatMany2oneP;

    public FloatMany2oneC() {
    }


    @Id 
    

    @Column(name="`FloatID`", precision=12, scale=4)
    public Double getFloatId() {
        return this.floatId;
    }
    
    public void setFloatId(Double floatId) {
        this.floatId = floatId;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="`FloatCol1`")
    public FloatMany2oneP getFloatMany2oneP() {
        return this.floatMany2oneP;
    }
    
    public void setFloatMany2oneP(FloatMany2oneP floatMany2oneP) {
        this.floatMany2oneP = floatMany2oneP;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof FloatMany2oneC) )
		    return false;

		 FloatMany2oneC that = (FloatMany2oneC) o;

		 return ( (this.getFloatId()==that.getFloatId()) || ( this.getFloatId()!=null && that.getFloatId()!=null && this.getFloatId().equals(that.getFloatId()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getFloatId() == null ? 0 : this.getFloatId().hashCode() );

         return result;
    }


}

