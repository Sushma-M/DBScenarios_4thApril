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
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;



/**
 * LongOne2oneC generated by hbm2java
 */
@Entity
@Table(name="`Long_One2One_C`"
)

public class LongOne2oneC  implements java.io.Serializable {

    
    private BigInteger longId;
    
    private BigInteger long1;
    
    private LongOne2oneP longOne2oneP;

    public LongOne2oneC() {
    }


    @GenericGenerator(name="generator", strategy="foreign", parameters=@Parameter(name="property", value="longOne2oneP"))@Id @GeneratedValue(generator="generator")
    

    @Column(name="`LongID`", precision=20)
    public BigInteger getLongId() {
        return this.longId;
    }
    
    public void setLongId(BigInteger longId) {
        this.longId = longId;
    }

    

    @Column(name="`Long1`", precision=20)
    public BigInteger getLong1() {
        return this.long1;
    }
    
    public void setLong1(BigInteger long1) {
        this.long1 = long1;
    }

    @OneToOne(fetch=FetchType.EAGER) @PrimaryKeyJoinColumn
    public LongOne2oneP getLongOne2oneP() {
        return this.longOne2oneP;
    }
    
    public void setLongOne2oneP(LongOne2oneP longOne2oneP) {
        this.longOne2oneP = longOne2oneP;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof LongOne2oneC) )
		    return false;

		 LongOne2oneC that = (LongOne2oneC) o;

		 return ( (this.getLongId()==that.getLongId()) || ( this.getLongId()!=null && that.getLongId()!=null && this.getLongId().equals(that.getLongId()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getLongId() == null ? 0 : this.getLongId().hashCode() );

         return result;
    }


}

