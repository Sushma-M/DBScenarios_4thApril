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
 * TimeStampOne2oneC generated by hbm2java
 */
@Entity
@Table(name="`TimeStamp_One2One_C`"
)

public class TimeStampOne2oneC  implements java.io.Serializable {

    
    private Date timestampId;
    
    private Date timeStamp1;
    
    private TimeStampOne2oneP timeStampOne2oneP;

    public TimeStampOne2oneC() {
    }


    @GenericGenerator(name="generator", strategy="foreign", parameters=@Parameter(name="property", value="timeStampOne2oneP"))@Id @GeneratedValue(generator="generator")
    @Temporal(TemporalType.TIMESTAMP)

    @Column(name="`TimestampID`", length=19)
    public Date getTimestampId() {
        return this.timestampId;
    }
    
    public void setTimestampId(Date timestampId) {
        this.timestampId = timestampId;
    }

    @Temporal(TemporalType.TIMESTAMP)

    @Column(name="`TimeStamp1`", length=19)
    public Date getTimeStamp1() {
        return this.timeStamp1;
    }
    
    public void setTimeStamp1(Date timeStamp1) {
        this.timeStamp1 = timeStamp1;
    }

    @OneToOne(fetch=FetchType.EAGER) @PrimaryKeyJoinColumn
    public TimeStampOne2oneP getTimeStampOne2oneP() {
        return this.timeStampOne2oneP;
    }
    
    public void setTimeStampOne2oneP(TimeStampOne2oneP timeStampOne2oneP) {
        this.timeStampOne2oneP = timeStampOne2oneP;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof TimeStampOne2oneC) )
		    return false;

		 TimeStampOne2oneC that = (TimeStampOne2oneC) o;

		 return ( (this.getTimestampId()==that.getTimestampId()) || ( this.getTimestampId()!=null && that.getTimestampId()!=null && this.getTimestampId().equals(that.getTimestampId()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getTimestampId() == null ? 0 : this.getTimestampId().hashCode() );

         return result;
    }


}

