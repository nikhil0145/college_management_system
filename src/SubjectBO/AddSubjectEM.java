/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SubjectBO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author Pankaj kumar
 */
public class AddSubjectEM 
{
    private int subjectId;
    private String subjectName;
    private String description;
    private boolean subjectStatus;
    public int getSubjectId()
    {
        return subjectId;
    }
    public void setSubjectId(int subjectId)
    {
        this.subjectId=subjectId;
    }
    public String getsubjectName()
    {
        return subjectName;
    }
    public void setSubjectName(String subjectName)
    {
        this.subjectName=subjectName;
    }
    public String getdescription()
    {
        return description;
    }
    public void setdescription(String description)
    {
        this.description=description;
    }
     public boolean getsubjectStatus()
    {
        return subjectStatus;
    }
    public void setsubjectStatus(boolean subjectStatus)
    {
        this.subjectStatus=subjectStatus;
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
