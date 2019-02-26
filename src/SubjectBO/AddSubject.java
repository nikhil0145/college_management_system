/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SubjectBO;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Pankaj kumar
 */
public class AddSubject implements IAddSubject
{
    cmsBO.DataBaseConnection _objDataBaseConnection=new cmsBO.DataBaseConnection();
    cmsBO.DataBaseConnectionEM _objDataBaseConnectionEM=new cmsBO.DataBaseConnectionEM();
    Connection con= null;
    ResultSet rs= null;
    CallableStatement stat= null;
    String addSubjectdata = "{call sp_AddSubject(?,?,?,?)}";
    String getSubjectId = "{call sp_getSubjectId(?)}";
    String getSubject = "{call [sp_GetSubject]}";
   public @Override void getSubjectId(AddSubjectEM objAddSubjectEM)
    {
     _objDataBaseConnection.SetCon(_objDataBaseConnectionEM);
        try
        {
        Class.forName(_objDataBaseConnectionEM.getDB_DRIVER());
        objAddSubjectEM.setcon(DriverManager.getConnection(_objDataBaseConnectionEM.getDB_CONNECTION(),_objDataBaseConnectionEM.getDB_USER(),_objDataBaseConnectionEM.getDB_PASSWORD()));
        objAddSubjectEM.setStat(objAddSubjectEM.getcon().prepareCall(getSubjectId));
        objAddSubjectEM.getStat().setString(1,objAddSubjectEM.getsubjectName());
       
        objAddSubjectEM.setResultSet(objAddSubjectEM.getStat().executeQuery());
         
        }
        catch(Exception ex)
        {
          ex.printStackTrace();
        } 
    }
  public @Override void addSubject(AddSubjectEM objAddSubjectEM)
   {
      _objDataBaseConnection.SetCon(_objDataBaseConnectionEM);
        try
        {
        Class.forName(_objDataBaseConnectionEM.getDB_DRIVER());
        con=DriverManager.getConnection(_objDataBaseConnectionEM.getDB_CONNECTION(),_objDataBaseConnectionEM.getDB_USER(),_objDataBaseConnectionEM.getDB_PASSWORD());
        stat=con.prepareCall(addSubjectdata);
        stat.setInt(1,objAddSubjectEM.getSubjectId());
        stat.setString(2,objAddSubjectEM.getsubjectName());
        stat.setString(3,objAddSubjectEM.getdescription());
        stat.setBoolean(4,true);
        stat.executeUpdate();
        
        con.close();
        }
        catch(Exception ex)
        {
          ex.printStackTrace();
        }  
   }
 public @Override void updateSubject(AddSubjectEM objAddSubjectEM)
   {
       
   }
  public @Override void deleteSubject(AddSubjectEM objAddSubjectEM)
   {
       
   }
  public @Override void fetchSubject(AddSubjectEM objAddSubjectEM)
   {
    _objDataBaseConnection.SetCon(_objDataBaseConnectionEM);
        try
        {
        Class.forName(_objDataBaseConnectionEM.getDB_DRIVER());
        objAddSubjectEM.setcon(DriverManager.getConnection(_objDataBaseConnectionEM.getDB_CONNECTION(),_objDataBaseConnectionEM.getDB_USER(),_objDataBaseConnectionEM.getDB_PASSWORD()));
        objAddSubjectEM.setStat(objAddSubjectEM.getcon().prepareCall(getSubject));
               
        objAddSubjectEM.setResultSet(objAddSubjectEM.getStat().executeQuery());
         
        }
        catch(Exception ex)
        {
          ex.printStackTrace();
        }    
   }
}
