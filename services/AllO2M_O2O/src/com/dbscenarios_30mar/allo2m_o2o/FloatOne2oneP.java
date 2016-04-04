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
import javax.persistence.OneToOne;
import javax.persistence.Table;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;



/**
 * FloatOne2oneP generated by hbm2java
 */
@Entity
@Table(name="`Float_One2One_P`"
)

public class FloatOne2oneP  implements java.io.Serializable {

    
    private Double floatId;
    
    private Double float1;
    
    private FloatOne2oneC floatOne2oneC;

    public FloatOne2oneP() {
    }


    @Id 
    

    @Column(name="`FloatID`", precision=12, scale=4)
    public Double getFloatId() {
        return this.floatId;
    }
    
    public void setFloatId(Double floatId) {
        this.floatId = floatId;
    }

    

    @Column(name="`Float1`", precision=12, scale=4)
    public Double getFloat1() {
        return this.float1;
    }
    
    public void setFloat1(Double float1) {
        this.float1 = float1;
    }

    @Transient @OneToOne(fetch=FetchType.EAGER, mappedBy="floatOne2oneP")
    public FloatOne2oneC getFloatOne2oneC() {
        return this.floatOne2oneC;
    }
    
    public void setFloatOne2oneC(FloatOne2oneC floatOne2oneC) {
        this.floatOne2oneC = floatOne2oneC;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof FloatOne2oneP) )
		    return false;

		 FloatOne2oneP that = (FloatOne2oneP) o;

		 return ( (this.getFloatId()==that.getFloatId()) || ( this.getFloatId()!=null && that.getFloatId()!=null && this.getFloatId().equals(that.getFloatId()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getFloatId() == null ? 0 : this.getFloatId().hashCode() );

         return result;
    }


}

