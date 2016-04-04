/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.dbscenarios_30mar.allo2m_o2o;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
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
 * StringOne2oneP generated by hbm2java
 */
@Entity
@Table(name="`String_One2One_P`"
)

public class StringOne2oneP  implements java.io.Serializable {

    
    private String stringId;
    
    private String string1;
    
    private StringOne2oneC stringOne2oneC;

    public StringOne2oneP() {
    }


    @Id 
    

    @Column(name="`StringID`")
    public String getStringId() {
        return this.stringId;
    }
    
    public void setStringId(String stringId) {
        this.stringId = stringId;
    }

    

    @Column(name="`String1`")
    public String getString1() {
        return this.string1;
    }
    
    public void setString1(String string1) {
        this.string1 = string1;
    }

    @Transient @OneToOne(fetch=FetchType.EAGER, mappedBy="stringOne2oneP")
    public StringOne2oneC getStringOne2oneC() {
        return this.stringOne2oneC;
    }
    
    public void setStringOne2oneC(StringOne2oneC stringOne2oneC) {
        this.stringOne2oneC = stringOne2oneC;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof StringOne2oneP) )
		    return false;

		 StringOne2oneP that = (StringOne2oneP) o;

		 return ( (this.getStringId()==that.getStringId()) || ( this.getStringId()!=null && that.getStringId()!=null && this.getStringId().equals(that.getStringId()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getStringId() == null ? 0 : this.getStringId().hashCode() );

         return result;
    }


}

