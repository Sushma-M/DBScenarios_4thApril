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
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;



/**
 * TimeOne2oneC generated by hbm2java
 */
@Entity
@Table(name="`Time_One2One_C`"
)

public class TimeOne2oneC  implements java.io.Serializable {

    
    private Date timeId;
    
    private Date time1;
    
    private TimeOne2oneP timeOne2oneP;

    public TimeOne2oneC() {
    }


    @GenericGenerator(name="generator", strategy="foreign", parameters=@Parameter(name="property", value="timeOne2oneP"))@Id @GeneratedValue(generator="generator")
    @Temporal(TemporalType.TIME)

    @Column(name="`TimeID`", length=8)
    public Date getTimeId() {
        return this.timeId;
    }
    
    public void setTimeId(Date timeId) {
        this.timeId = timeId;
    }

    @Temporal(TemporalType.TIME)

    @Column(name="`Time1`", length=8)
    public Date getTime1() {
        return this.time1;
    }
    
    public void setTime1(Date time1) {
        this.time1 = time1;
    }

    @OneToOne(fetch=FetchType.EAGER) @PrimaryKeyJoinColumn
    public TimeOne2oneP getTimeOne2oneP() {
        return this.timeOne2oneP;
    }
    
    public void setTimeOne2oneP(TimeOne2oneP timeOne2oneP) {
        this.timeOne2oneP = timeOne2oneP;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof TimeOne2oneC) )
		    return false;

		 TimeOne2oneC that = (TimeOne2oneC) o;

		 return ( (this.getTimeId()==that.getTimeId()) || ( this.getTimeId()!=null && that.getTimeId()!=null && this.getTimeId().equals(that.getTimeId()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getTimeId() == null ? 0 : this.getTimeId().hashCode() );

         return result;
    }


}

