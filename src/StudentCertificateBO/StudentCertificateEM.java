/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentCertificateBO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author Pankaj kumar
 */
public class StudentCertificateEM
{
private int AdmissionId=0;
private int certificateId=0;
private String certificateName=null;
private String description=null;
private Boolean Status=null;
private ResultSet rs=null;
private CallableStatement stat=null;
private Connection con= null;
//---------------------------------------------------
public String Getdescription()
{
    return description;
}
public void Setdescription(String description)
{
    this.description=description;
}
//--------------------------------------------------

public String GetcertificateName()
{
    return certificateName;
}
public void SetcertificateName(String certificateName)
{
    this.certificateName=certificateName;
}
//-------------------------------------------------------

public int GetcertificateId()
{
    return certificateId;
}
public void SetcertificateId(int certificateId)
{
    this.certificateId=certificateId;
}
//---------------------------------------------------------

public int GetadmissionId()
{
    return AdmissionId;
}
public void SetadmissionId(int AdmissionId)
{
    this.AdmissionId=AdmissionId;
}
//---------------------------------------------------------

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
