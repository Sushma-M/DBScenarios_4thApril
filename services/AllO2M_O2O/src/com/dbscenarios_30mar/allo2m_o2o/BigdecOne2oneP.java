/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.dbscenarios_30mar.allo2m_o2o;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import java.math.BigDecimal;
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
 * BigdecOne2oneP generated by hbm2java
 */
@Entity
@Table(name="`Bigdec_One2One_P`"
)

public class BigdecOne2oneP  implements java.io.Serializable {

    
    private BigDecimal bigdecId;
    
    private BigDecimal bigdec1;
    
    private BigdecOne2oneC bigdecOne2oneC;

    public BigdecOne2oneP() {
    }


    @Id 
    

    @Column(name="`BigdecID`", precision=35, scale=15)
    public BigDecimal getBigdecId() {
        return this.bigdecId;
    }
    
    public void setBigdecId(BigDecimal bigdecId) {
        this.bigdecId = bigdecId;
    }

    

    @Column(name="`Bigdec1`", precision=35, scale=15)
    public BigDecimal getBigdec1() {
        return this.bigdec1;
    }
    
    public void setBigdec1(BigDecimal bigdec1) {
        this.bigdec1 = bigdec1;
    }

    @Transient @OneToOne(fetch=FetchType.EAGER, mappedBy="bigdecOne2oneP")
    public BigdecOne2oneC getBigdecOne2oneC() {
        return this.bigdecOne2oneC;
    }
    
    public void setBigdecOne2oneC(BigdecOne2oneC bigdecOne2oneC) {
        this.bigdecOne2oneC = bigdecOne2oneC;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof BigdecOne2oneP) )
		    return false;

		 BigdecOne2oneP that = (BigdecOne2oneP) o;

		 return ( (this.getBigdecId()==that.getBigdecId()) || ( this.getBigdecId()!=null && that.getBigdecId()!=null && this.getBigdecId().equals(that.getBigdecId()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getBigdecId() == null ? 0 : this.getBigdecId().hashCode() );

         return result;
    }


}

