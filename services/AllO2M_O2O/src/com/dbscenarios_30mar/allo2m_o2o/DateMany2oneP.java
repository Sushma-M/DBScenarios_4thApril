/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.dbscenarios_30mar.allo2m_o2o;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;



/**
 * DateMany2oneP generated by hbm2java
 */
@Entity
@Table(name="`Date_Many2One_P`"
)

public class DateMany2oneP  implements java.io.Serializable {

    
    private Date dateId;
    
    private Date dateCol1;
    
    private Set<DateMany2oneC> dateMany2oneCs = new HashSet<DateMany2oneC>(0);

    public DateMany2oneP() {
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

    @Temporal(TemporalType.DATE)

    @Column(name="`DateCol1`", length=10)
    public Date getDateCol1() {
        return this.dateCol1;
    }
    
    public void setDateCol1(Date dateCol1) {
        this.dateCol1 = dateCol1;
    }

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="dateMany2oneP")
    public Set<DateMany2oneC> getDateMany2oneCs() {
        return this.dateMany2oneCs;
    }
    
    public void setDateMany2oneCs(Set<DateMany2oneC> dateMany2oneCs) {
        this.dateMany2oneCs = dateMany2oneCs;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof DateMany2oneP) )
		    return false;

		 DateMany2oneP that = (DateMany2oneP) o;

		 return ( (this.getDateId()==that.getDateId()) || ( this.getDateId()!=null && that.getDateId()!=null && this.getDateId().equals(that.getDateId()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getDateId() == null ? 0 : this.getDateId().hashCode() );

         return result;
    }


}

