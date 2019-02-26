/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FeeInformationBO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author pankaj kumar
 */
public class PayFeeEM 
{
    private float fee;
public float Getfee()
{
    return fee;
}
public void setfee(float fee)
{
    this.fee=fee;
}
private int feeid;
public int GetFeeid()
{
    return feeid;
}
public void setFeeid(int feeid)
{
    this.feeid=feeid;
}
private int admissionid;
public int Getadmissionid()
{
    return admissionid;
}
public void setadmissionid(int admissionid)
{
    this.admissionid=admissionid;
}
private int courseId;
public int GetcourseId()
{
    return courseId;
}
public void setcourseId(int courseId)
{
    this.courseId=courseId;
}
private String courseName;
public String GetcourseName()
{
    return courseName;
}
public void setcourseName(String courseName)
{
    this.courseName=courseName;
}
private String forYear;
public String GetforYear()
{
    return forYear;
}
public void setforYear(String forYear)
{
    this.forYear=forYear;
}
private String Description;
public String GetDescription()
{
    return Description;
}
public void setDescription(String Description)
{
    this.Description=Description;
}
private String FeePayDate;
public String GetFeePayDate()
{
    return FeePayDate;
}
public void setFeePayDate(String FeePayDate)
{
    this.FeePayDate=FeePayDate;
}
private Boolean status;
public Boolean Getstatus()
{
    return status;
}
public void setstatus(Boolean status)
{
    this.status=status;
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
 
 
private CallableStatement stat=null;
 public CallableStatement getStat()
 {
     return stat;
 }
 public void setStat(CallableStatement stat)
 {
     this.stat=stat;
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
}
