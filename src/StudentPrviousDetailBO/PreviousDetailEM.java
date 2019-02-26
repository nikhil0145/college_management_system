/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentPrviousDetailBO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author Pankaj kumar
 */
public class PreviousDetailEM 
{
private  int admissionId=0;
private int QualificationId=0;
private String QualifiedIn=null;
private String Year=null;
private String Marks=null;
private String Percentage=null;
private String Division=null;
private String Discription=null;
private Boolean Status=null;
private ResultSet rs=null;
private CallableStatement stat=null;
private Connection con= null;
public int GetadmissionId()
        {
          return admissionId;  
        }
public void SetadmissionId(int admissionId)
        {
          this.admissionId=admissionId;  
        }
//------------------------------------------------
public int GetQualificationId()
        {
          return QualificationId;  
        }
public void SetQualificationId(int QualificationId)
        {
          this.QualificationId=QualificationId;  
        }
//------------------------------------------------
public String GetQualifiedIn()
        {
          return QualifiedIn;  
        }
public void SetQualifiedIn(String QualifiedIn)
        {
          this.QualifiedIn=QualifiedIn;  
        }
//------------------------------------------------
public String GetYear()
        {
          return Year;  
        }
public void SetYear(String Year)
        {
          this.Year=Year;  
        }
//------------------------------------------------
public String GetMarks()
        {
          return Marks;  
        }
public void SetMarks(String Marks)
        {
          this.Marks=Marks;  
        }
//------------------------------------------------
public String GetPercentage()
        {
          return Percentage;  
        }
public void SetPercentage(String Percentage)
        {
          this.Percentage=Percentage;  
        }
//------------------------------------------------
public String GetDivision()
        {
          return Division;  
        }
public void SetDivision(String Division)
        {
          this.Division=Division;  
        }
//------------------------------------------------

public String GetDiscription()
        {
          return Discription;  
        }
public void SetDiscription(String Discription)
        {
          this.Discription=Discription;  
        }
//------------------------------------------------
public Boolean GetStatus()
        {
          return Status;  
        }
public void SetStatus(Boolean Status)
        {
          this.Status=Status;  
        }
//------------------------------------------------
public Connection getcon()
 {
     return con;
 }
 public void setcon(Connection con)
 {
     this.con=con;
 }
 //-----------------------------------------------
 public CallableStatement getStat()
 {
     return stat;
 }
 public void setStat(CallableStatement stat)
 {
     this.stat=stat;
 }
 //------------------------------------------------
 public  ResultSet getResultSet()
 {
     return rs;
 }
 public void setResultSet(ResultSet rs)
 {
     this.rs=rs;
 }  
}
