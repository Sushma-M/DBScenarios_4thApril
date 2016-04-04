/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.dbscenarios_30mar.allo2m_o2o;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import java.math.BigInteger;
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
 * BigIntMany2oneP generated by hbm2java
 */
@Entity
@Table(name="`BigInt_Many2One_P`"
)

public class BigIntMany2oneP  implements java.io.Serializable {

    
    private BigInteger bigIntId;
    
    private BigInteger bigIntCol1;
    
    private Set<BigIntMany2oneC> bigIntMany2oneCs = new HashSet<BigIntMany2oneC>(0);

    public BigIntMany2oneP() {
    }


    @Id 
    

    @Column(name="`BigIntID`", precision=20)
    public BigInteger getBigIntId() {
        return this.bigIntId;
    }
    
    public void setBigIntId(BigInteger bigIntId) {
        this.bigIntId = bigIntId;
    }

    

    @Column(name="`BigIntCol1`", precision=20)
    public BigInteger getBigIntCol1() {
        return this.bigIntCol1;
    }
    
    public void setBigIntCol1(BigInteger bigIntCol1) {
        this.bigIntCol1 = bigIntCol1;
    }

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="bigIntMany2oneP")
    public Set<BigIntMany2oneC> getBigIntMany2oneCs() {
        return this.bigIntMany2oneCs;
    }
    
    public void setBigIntMany2oneCs(Set<BigIntMany2oneC> bigIntMany2oneCs) {
        this.bigIntMany2oneCs = bigIntMany2oneCs;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof BigIntMany2oneP) )
		    return false;

		 BigIntMany2oneP that = (BigIntMany2oneP) o;

		 return ( (this.getBigIntId()==that.getBigIntId()) || ( this.getBigIntId()!=null && that.getBigIntId()!=null && this.getBigIntId().equals(that.getBigIntId()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getBigIntId() == null ? 0 : this.getBigIntId().hashCode() );

         return result;
    }


}
