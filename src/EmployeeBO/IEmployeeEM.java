/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeBO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;

/**
 *
 * @author Pankaj kumar
 */
public class IEmployeeEM 
{
    private String qualificationyear;
    public String getqualificationyear()
      {
          return qualificationyear;
      }
      public void setqualificationyear(String qualificationyear)
      {
          this.qualificationyear=qualificationyear;
      }
    private String EmployeeQualification;
    public String getEmployeeQualification()
      {
          return EmployeeQualification;
      }
      public void setEmployeeQualification(String EmployeeQualification)
      {
          this.EmployeeQualification=EmployeeQualification;
      }
      private int QualificationId ;
      public int getQualificationId()
      {
          return QualificationId;
      }
      public void setQualificationId(int QualificationId)
      {
          this.QualificationId=QualificationId;
      }
      private int EmployeeId ;
      public int getEmployeeId()
      {
          return EmployeeId;
      }
      public void setEmployeeId(int EmployeeId)
      {
          this.EmployeeId=EmployeeId;
      }
      private String EmployeeName ;
      public String getEmployeeName()
      {
          return EmployeeName;
      }
      public void setEmployeeName(String EmployeeName)
      {
          this.EmployeeName=EmployeeName;
      }
      private String EmployeeDesignation;
      public String getEmployeeDesignation()
      {
          return EmployeeDesignation;
      }
      public void setEmployeeDesignation(String EmployeeDesignation)
      {
          this.EmployeeDesignation=EmployeeDesignation;
      }
      private String EmployeeSpecialization ;
      public String getEmployeeSpecialization()
      {
          return EmployeeSpecialization;
      }
      public void setEmployeeSpecialization(String EmployeeSpecialization)
      {
          this.EmployeeSpecialization=EmployeeSpecialization;
      }
      private String EmployeeDescription ;
      public String getEmployeeDescription()
      {
          return EmployeeDescription;
      }
      public void setEmployeeDescription(String EmployeeDescription)
      {
          this.EmployeeDescription=EmployeeDescription;
      }
      private Date JoiningDate ;
      public Date getJoiningDate()
      {
          return JoiningDate;
      }
      public void setJoiningDate(Date JoiningDate)
      {
          this.JoiningDate=JoiningDate;
      }
       
      private String Country;
      public String getCountry()
      {
          return Country;
      }
      public void setCountry(String Country)
      {
          this.Country=Country;
      }
      private String State ;
      public String getState()
      {
          return State;
      }
      public void setState(String State)
      {
          this.State=State;
      }
      private String City ;
      public String getCity()
      {
          return City;
      }
      public void setCity(String City)
      {
          this.City=City;
      }
      private String Town ;
      public String getTown()
      {
          return Town;
      }
      public void setTown(String Town)
      {
          this.Town=Town;
      }
      private String Colony ;
      public String getColony()
      {
          return Colony;
      }
      public void setColony(String Colony)
      {
          this.Colony=Colony;
      }
      private String Pinncode ;
      public String getPinncode()
      {
          return Pinncode;
      }
      public void setPinncode(String Pinncode)
      {
          this.Pinncode=Pinncode;
      }
     
      private String contact1;
      public String getcontact1()
      {
          return contact1;
      }
      public void setcontact1(String contact1)
      {
          this.contact1=contact1;
      }
      private String contact2 ;
      public String getcontact2()
      {
          return contact2;
      }
      public void setcontact2(String contact2)
      {
          this.contact2=contact2;
      }
      
      private String Emailid;
      public String getEmailid()
      {
          return Emailid;
      }
      public void setEmailid(String Emailid)
      {
          this.Emailid=Emailid;
      }
      
      private Boolean Status ;
      public Boolean getStatus()
      {
          return Status;
      }
      public void setStatus(Boolean Status)
      {
          this.Status=Status;
      }
      private ResultSet rs=null;
       public  ResultSet getResultSet()
       {
     return rs;
       }
 public void setResultSet(ResultSet rs)
 {
     this.rs=rs;
 } 
      private CallableStatement stat=null;
      public CallableStatement getStat()
 {
     return stat;
 }
 public void setStat(CallableStatement stat)
 {
     this.stat=stat;
 }
     private Connection con= null;
      public Connection getcon()
 {
     return con;
 }
 public void setcon(Connection con)
 {
     this.con=con;
 }

}
