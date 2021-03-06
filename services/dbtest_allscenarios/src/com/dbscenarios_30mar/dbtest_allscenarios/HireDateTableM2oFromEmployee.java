/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.dbscenarios_30mar.dbtest_allscenarios;

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
 * HireDateTableM2oFromEmployee generated by hbm2java
 */
@Entity
@Table(name="`HireDate Table_M2O_FromEmployee`"
)

public class HireDateTableM2oFromEmployee  implements java.io.Serializable {

    
    private Date id;
    
    private String employeeName;
    
    private Set<EmployeeRelationFrom2tables> employeeRelationFrom2tableses = new HashSet<EmployeeRelationFrom2tables>(0);

    public HireDateTableM2oFromEmployee() {
    }


    @Id 
    @Temporal(TemporalType.DATE)

    @Column(name="`ID`", length=10)
    public Date getId() {
        return this.id;
    }
    
    public void setId(Date id) {
        this.id = id;
    }

    

    @Column(name="`Employee Name`")
    public String getEmployeeName() {
        return this.employeeName;
    }
    
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="hireDateTableM2oFromEmployee")
    public Set<EmployeeRelationFrom2tables> getEmployeeRelationFrom2tableses() {
        return this.employeeRelationFrom2tableses;
    }
    
    public void setEmployeeRelationFrom2tableses(Set<EmployeeRelationFrom2tables> employeeRelationFrom2tableses) {
        this.employeeRelationFrom2tableses = employeeRelationFrom2tableses;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof HireDateTableM2oFromEmployee) )
		    return false;

		 HireDateTableM2oFromEmployee that = (HireDateTableM2oFromEmployee) o;

		 return ( (this.getId()==that.getId()) || ( this.getId()!=null && that.getId()!=null && this.getId().equals(that.getId()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );

         return result;
    }


}

