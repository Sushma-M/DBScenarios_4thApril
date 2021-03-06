/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.dbscenarios_30mar.allo2m_o2o;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import java.math.BigInteger;
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
 * BigIntMany2oneC generated by hbm2java
 */
@Entity
@Table(name="`BigInt_Many2One_C`"
)

public class BigIntMany2oneC  implements java.io.Serializable {

    
    private BigInteger bigIntId;
    
    private BigIntMany2oneP bigIntMany2oneP;

    public BigIntMany2oneC() {
    }


    @Id 
    

    @Column(name="`BigIntID`", precision=20)
    public BigInteger getBigIntId() {
        return this.bigIntId;
    }
    
    public void setBigIntId(BigInteger bigIntId) {
        this.bigIntId = bigIntId;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="`BigIntCol1`")
    public BigIntMany2oneP getBigIntMany2oneP() {
        return this.bigIntMany2oneP;
    }
    
    public void setBigIntMany2oneP(BigIntMany2oneP bigIntMany2oneP) {
        this.bigIntMany2oneP = bigIntMany2oneP;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof BigIntMany2oneC) )
		    return false;

		 BigIntMany2oneC that = (BigIntMany2oneC) o;

		 return ( (this.getBigIntId()==that.getBigIntId()) || ( this.getBigIntId()!=null && that.getBigIntId()!=null && this.getBigIntId().equals(that.getBigIntId()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getBigIntId() == null ? 0 : this.getBigIntId().hashCode() );

         return result;
    }


}

