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


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;



/**
 * StringMany2oneP generated by hbm2java
 */
@Entity
@Table(name="`String_Many2One_P`"
)

public class StringMany2oneP  implements java.io.Serializable {

    
    private String stringId;
    
    private String stringCol1;
    
    private Set<StringMany2oneC> stringMany2oneCs = new HashSet<StringMany2oneC>(0);

    public StringMany2oneP() {
    }


    @Id 
    

    @Column(name="`StringID`")
    public String getStringId() {
        return this.stringId;
    }
    
    public void setStringId(String stringId) {
        this.stringId = stringId;
    }

    

    @Column(name="`StringCol1`")
    public String getStringCol1() {
        return this.stringCol1;
    }
    
    public void setStringCol1(String stringCol1) {
        this.stringCol1 = stringCol1;
    }

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="stringMany2oneP")
    public Set<StringMany2oneC> getStringMany2oneCs() {
        return this.stringMany2oneCs;
    }
    
    public void setStringMany2oneCs(Set<StringMany2oneC> stringMany2oneCs) {
        this.stringMany2oneCs = stringMany2oneCs;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof StringMany2oneP) )
		    return false;

		 StringMany2oneP that = (StringMany2oneP) o;

		 return ( (this.getStringId()==that.getStringId()) || ( this.getStringId()!=null && that.getStringId()!=null && this.getStringId().equals(that.getStringId()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getStringId() == null ? 0 : this.getStringId().hashCode() );

         return result;
    }


}

