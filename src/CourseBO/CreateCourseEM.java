/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseBO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.sql.*;
/**
 *
 * @author Pankaj kumar
 */
public class CreateCourseEM 
{
 private  int courseId;
 private String courseName;
 private String description;
 private boolean status;
 private ResultSet rs;
 private CallableStatement stat=null;
 private Connection con= null;
 
 public int getCourseId()
 {
    return courseId;
 }
  public void setCourseId(int courseId)
  {
      this.courseId=courseId;
  }
  public String getCourseName()
 {
    return courseName;
 }
  public void setCourseName(String courseName)
  {
      this.courseName=courseName;
  }
 public String getdescription()
 {
    return description;
 }
  public void setdescription(String description)
  {
      this.description=description;
  } 
   public Boolean getstatus()
 {
    return status;
 }
  public void setStatus(Boolean status)
  {
      this.status=status;
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
