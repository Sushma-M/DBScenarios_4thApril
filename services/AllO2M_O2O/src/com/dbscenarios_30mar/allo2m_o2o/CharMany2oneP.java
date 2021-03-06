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
 * CharMany2oneP generated by hbm2java
 */
@Entity
@Table(name="`Char_Many2One_P`"
)

public class CharMany2oneP  implements java.io.Serializable {

    
    private Character charId;
    
    private Character charCol1;
    
    private Set<CharMany2oneC> charMany2oneCs = new HashSet<CharMany2oneC>(0);

    public CharMany2oneP() {
    }


    @Id 
    

    @Column(name="`CharID`", length=1)
    public Character getCharId() {
        return this.charId;
    }
    
    public void setCharId(Character charId) {
        this.charId = charId;
    }

    

    @Column(name="`CharCol1`", length=1)
    public Character getCharCol1() {
        return this.charCol1;
    }
    
    public void setCharCol1(Character charCol1) {
        this.charCol1 = charCol1;
    }

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="charMany2oneP")
    public Set<CharMany2oneC> getCharMany2oneCs() {
        return this.charMany2oneCs;
    }
    
    public void setCharMany2oneCs(Set<CharMany2oneC> charMany2oneCs) {
        this.charMany2oneCs = charMany2oneCs;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof CharMany2oneP) )
		    return false;

		 CharMany2oneP that = (CharMany2oneP) o;

		 return ( (this.getCharId()==that.getCharId()) || ( this.getCharId()!=null && that.getCharId()!=null && this.getCharId().equals(that.getCharId()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getCharId() == null ? 0 : this.getCharId().hashCode() );

         return result;
    }


}

