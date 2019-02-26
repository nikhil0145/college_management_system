/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.sql.*;
/**
 *
 * @author Pankaj kumar
 */
public class CreateSessionEM
{
 private  int sessionId;
 private String startYear;
 private String endYear;
 private boolean status;
 private ResultSet rs;
 private CallableStatement stat=null;
 private Connection con= null;
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
 public int getSessionId()
 {
     return sessionId;
 }
 public void setSesionID(int id)
   {
     this.sessionId=id;
   }
  public String getstartYear()
   {
     return startYear;
   }
 public void setstartYear(String startYear)
   {
     this.startYear=startYear;
   }
  public String getendYear()
   {
     return endYear;
   }
 public void setendYear(String endYear)
   {
     this.endYear=endYear;
   }
  public boolean getstatus()
   {
     return status;
   }
 public void setstatus(boolean status)
   {
     this.status=status;
   }
}
