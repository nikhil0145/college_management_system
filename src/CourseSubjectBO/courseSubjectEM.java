/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseSubjectBO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author Pankaj kumar
 */
public class courseSubjectEM 
{
 private int courseSubjectId;
 private int courseId;
 private int subjectId;
 private String forYear;
 private String descripton;
 private Boolean status;
 private ResultSet rs;
 private CallableStatement stat=null;
 private Connection con= null;
  public Boolean getstatus()
 {
   return this.status;
 }
 public void setstatus(Boolean status)
 {
     this.status=status;
 }
 public String getdescripton()
 {
   return this.descripton;
 }
 public void setdescripton(String descripton)
 {
     this.descripton=descripton;
 }
 public String getforYear()
 {
   return this.forYear;
 }
 public void setforYear(String forYear)
 {
     this.forYear=forYear;
 }
 public int getsubjectId()
 {
   return this.subjectId;
 }
 public void setsubjectId(int subjectId)
 {
     this.subjectId=subjectId;
 }
 public int getcourseId()
 {
   return this.courseId;
 }
 public void setcourseId(int courseId)
 {
     this.courseId=courseId;
 }
 public int getcourseSubjectId()
 {
   return this.courseSubjectId;
 }
 public void setcoiuseSubjectId(int courseSubjectId)
 {
     this.courseSubjectId=courseSubjectId;
 }
 public Connection getcon()
 {
     return con;
 }
 public void setcon(Connection con)
 {
     this.con=con;
 }
 public CallableStatement getStat()
 {
     return stat;
 }
 public void setStat(CallableStatement stat)
 {
     this.stat=stat;
 }
 public  ResultSet getResultSet()
 {
     return rs;
 }
 public void setResultSet(ResultSet rs)
 {
     this.rs=rs;
 }  
}
