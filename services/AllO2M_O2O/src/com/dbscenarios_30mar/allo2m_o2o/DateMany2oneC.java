/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.dbscenarios_30mar.allo2m_o2o;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;



/**
 * DateMany2oneC generated by hbm2java
 */
@Entity
@Table(name="`Date_Many2One_C`"
)

public class DateMany2oneC  implements java.io.Serializable {

    
    private Date dateId;
    
    private DateMany2oneP dateMany2oneP;

    public DateMany2oneC() {
    }


    @Id 
    @Temporal(TemporalType.DATE)

    @Column(name="`DateID`", length=10)
    public Date getDateId() {
        return this.dateId;
    }
    
    public void setDateId(Date dateId) {
        this.dateId = dateId;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="`DateCol1`")
    public DateMany2oneP getDateMany2oneP() {
        return this.dateMany2oneP;
    }
    
    public void setDateMany2oneP(DateMany2oneP dateMany2oneP) {
        this.dateMany2oneP = dateMany2oneP;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof DateMany2oneC) )
		    return false;

		 DateMany2oneC that = (DateMany2oneC) o;

		 return ( (this.getDateId()==that.getDateId()) || ( this.getDateId()!=null && that.getDateId()!=null && this.getDateId().equals(that.getDateId()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getDateId() == null ? 0 : this.getDateId().hashCode() );

         return result;
    }


}

