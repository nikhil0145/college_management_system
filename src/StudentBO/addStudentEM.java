/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentBO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.sql.*;

public class addStudentEM
{
private int AdmissionId=0;
private String Session=null;
private int CourseId=0;
private String ForYear=null;
private String StudentName=null;
private String DateOfAdmission=null;
private String Sex=null;
private String dob=null;
private String GuardianName=null;
private String FatherName=null;
private String MotherName=null;
private String FatherOccupation=null;
private String MotherOccupation=null;
private String YearlyIncome=null;
private String village_colony=null;
private String City=null;
private String Pincode=null;
private String State=null;
private String Country=null;
private String Contact1=null;
private String Contact2=null;
private String EmailiD=null;
private Boolean Status=null;
private ResultSet rs=null;
private CallableStatement stat=null;
private Connection con= null;
private String CourseName=null;
//---------------------------------------------
public String getCourseName()
{
   return CourseName;
}
public void setCourseName(String CourseName)
{
   this.CourseName=CourseName;
}
//---------------------------------------------
public int getAdmissionId()
{
   return AdmissionId;
}
public void setAdmissionId(int AdmissionId)
{
   this.AdmissionId=AdmissionId;
}
//----------------------------------------------
public String getSession()
{
   return Session;
}
public void setSession(String Session)
{
   this.Session=Session;
}
//------------------------------------------------
public int getCourseId()
{
   return CourseId;
}
public void setCourseId(int CourseId)
{
   this.CourseId=CourseId;
}
//-------------------------------------------------
public String getForYear()
{
   return ForYear;
}
public void setForYear(String ForYear)
{
   this.ForYear=ForYear;
}
//--------------------------------------------------
public String getStudentName()
{
   return StudentName;
}
public void setStudentName(String StudentName)
{
   this.StudentName=StudentName;
}
//---------------------------------------------------
public String getDateOfAdmission()
{
   return DateOfAdmission;
}
public void setDateOfAdmission(String DateOfAdmission)
{
   this.DateOfAdmission=DateOfAdmission;
}
//------------------------------------------------------
public String getSex()
{
   return Sex;
}
public void setSex(String Sex)
{
   this.Sex=Sex;
}
//------------------------------------------------------------
public String getdob()
{
   return dob;
}
public void setdob(String dob)
{
   this.dob=dob;
}
//-------------------------------------------------------------
public String getGuardianName()
{
   return GuardianName;
}
public void setGuardianName(String GuardianName)
{
   this.GuardianName=GuardianName;
}
//--------------------------------------------------------
public String getFatherName()
{
   return FatherName;
}
public void setFatherName(String FatherName)
{
   this.FatherName=FatherName;
}
//---------------------------------------------------------------
public String getMotherName()
{
   return MotherName;
}
public void setMotherName(String MotherName)
{
   this.MotherName=MotherName;
}
//----------------------------------------------------------
public String getFatherOccupation()
{
   return FatherOccupation;
}
public void setFatherOccupation(String FatherOccupation)
{
   this.FatherOccupation=FatherOccupation;
}
//-------------------------------------------
public String getMotherOccupation()
{
   return MotherOccupation;
}
public void setMotherOccupation(String MotherOccupation)
{
   this.MotherOccupation=MotherOccupation;
}
//------------------------------------
public String getYearlyIncome()
{
   return YearlyIncome;
}
public void setYearlyIncome(String YearlyIncome)
{
   this.YearlyIncome=YearlyIncome;
}
//------------------------------------
public String getvillage_colony()
{
   return village_colony;
}
public void setvillage_colony(String village_colony)
{
   this.village_colony=village_colony;
}
//----------------------------------------
public String getCity()
{
   return City;
}
public void setCity(String City)
{
   this.City=City;
}
//------------------------------------
public String getPincode()
{
   return Pincode;
}
public void setPincode(String Pincode)
{
   this.Pincode=Pincode;
}
//------------------------------------
public String getState()
{
   return State;
}
public void setState(String State)
{
   this.State=State;
}
//------------------------------------
public String getCountry()
{
   return Country;
}
public void setCountry(String Country)
{
   this.Country=Country;
}
//---------------------------------------------
public String getContact1()
{
   return Contact1;
}
public void setContact1(String Contact1)
{
   this.Contact1=Contact1;
}
//-----------------------------------------
public String getContact2()
{
   return Contact2;
}
public void setContact2(String Contact2)
{
   this.Contact2=Contact2;
}
//----------------------------------------
public String getEmailiD()
{
   return EmailiD;
}
public void setEmailiD(String EmailiD)
{
   this.EmailiD=EmailiD;
}
//--------------------------------------------
public boolean getStatus()
{
   return Status;
}
public void setStatus(boolean Status)
{
   this.Status=Status;
}
//-------------------------------------------------
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
