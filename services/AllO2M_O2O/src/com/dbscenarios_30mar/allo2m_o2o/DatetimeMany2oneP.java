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
import org.hibernate.annotations.Type;
import org.joda.time.LocalDateTime;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;



/**
 * DatetimeMany2oneP generated by hbm2java
 */
@Entity
@Table(name="`Datetime_Many2One_P`"
)

public class DatetimeMany2oneP  implements java.io.Serializable {

    
    
    @Type(type="DateTime")
    private LocalDateTime datetimeId;
    
    
    @Type(type="DateTime")
    private LocalDateTime datetimeCol1;
    
    private Set<DatetimeMany2oneC> datetimeMany2oneCs = new HashSet<DatetimeMany2oneC>(0);

    public DatetimeMany2oneP() {
    }


    @Id 
    

    @Column(name="`DatetimeID`")
    public LocalDateTime getDatetimeId() {
        return this.datetimeId;
    }
    
    public void setDatetimeId(LocalDateTime datetimeId) {
        this.datetimeId = datetimeId;
    }

    

    @Column(name="`DatetimeCol1`")
    public LocalDateTime getDatetimeCol1() {
        return this.datetimeCol1;
    }
    
    public void setDatetimeCol1(LocalDateTime datetimeCol1) {
        this.datetimeCol1 = datetimeCol1;
    }

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="datetimeMany2oneP")
    public Set<DatetimeMany2oneC> getDatetimeMany2oneCs() {
        return this.datetimeMany2oneCs;
    }
    
    public void setDatetimeMany2oneCs(Set<DatetimeMany2oneC> datetimeMany2oneCs) {
        this.datetimeMany2oneCs = datetimeMany2oneCs;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof DatetimeMany2oneP) )
		    return false;

		 DatetimeMany2oneP that = (DatetimeMany2oneP) o;

		 return ( (this.getDatetimeId()==that.getDatetimeId()) || ( this.getDatetimeId()!=null && that.getDatetimeId()!=null && this.getDatetimeId().equals(that.getDatetimeId()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getDatetimeId() == null ? 0 : this.getDatetimeId().hashCode() );

         return result;
    }


}
