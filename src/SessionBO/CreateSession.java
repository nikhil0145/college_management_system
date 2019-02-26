/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBO;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Pankaj kumar
 */
public class CreateSession implements ICreateSession
{
    cmsBO.DataBaseConnection _objDataBaseConnection=new cmsBO.DataBaseConnection();
    cmsBO.DataBaseConnectionEM _objDataBaseConnectionEM=new cmsBO.DataBaseConnectionEM();
   
    String addSessiondata = "{call sp_AddSession(?,?,?,?)}";
    String getSessiondata = "{call sp_GetSession}";
  public @Override void addSession(CreateSessionEM objCreateSessionEM) 
    {
        
        _objDataBaseConnection.SetCon(_objDataBaseConnectionEM);
        try
        {
        Class.forName(_objDataBaseConnectionEM.getDB_DRIVER());
        objCreateSessionEM.setcon(DriverManager.getConnection(_objDataBaseConnectionEM.getDB_CONNECTION(),_objDataBaseConnectionEM.getDB_USER(),_objDataBaseConnectionEM.getDB_PASSWORD()));
        objCreateSessionEM.setStat(objCreateSessionEM.getcon().prepareCall(addSessiondata));
        objCreateSessionEM.getStat().setInt(1,objCreateSessionEM.getSessionId());
        objCreateSessionEM.getStat().setString(2, objCreateSessionEM.getstartYear());
        objCreateSessionEM.getStat().setString(3, objCreateSessionEM.getendYear());
        objCreateSessionEM.getStat().setBoolean(4,true);
        objCreateSessionEM.getStat().executeUpdate();
        objCreateSessionEM.getcon().close();
        }
        catch(Exception ex)
        {
          ex.printStackTrace();
        }
        
    }
  public @Override void updateSession(CreateSessionEM objCreateSessionEM)
    {
     
    }
  public @Override void displaySession(CreateSessionEM objCreateSessionEM)
    {
     _objDataBaseConnection.SetCon(_objDataBaseConnectionEM);
        try
        {
        Class.forName(_objDataBaseConnectionEM.getDB_DRIVER());
        objCreateSessionEM.setcon(DriverManager.getConnection(_objDataBaseConnectionEM.getDB_CONNECTION(),_objDataBaseConnectionEM.getDB_USER(),_objDataBaseConnectionEM.getDB_PASSWORD()));
        objCreateSessionEM.setStat(objCreateSessionEM.getcon().prepareCall(getSessiondata));
        objCreateSessionEM.setResultSet(objCreateSessionEM.getStat().executeQuery());
         
        }
        catch(Exception ex)
        {
          ex.printStackTrace();
        }    
    }
}
