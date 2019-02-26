/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentPrviousDetailBO;

import java.sql.DriverManager;

/**
 *
 * @author Pankaj kumar
 */
public class PreviousDetail implements IPreviousDetail
{
  cmsBO.DataBaseConnection _objDataBaseConnection=new cmsBO.DataBaseConnection();
  cmsBO.DataBaseConnectionEM _objDataBaseConnectionEM=new cmsBO.DataBaseConnectionEM();
  String addPreviousdata = "{call sp_AddPreviousDetail(?,?,?,?,?,?,?,?,?)}";
   String getPreviousdata = "{call sp_GetPreviousDetail}";
   String getAdmission="{call sp_GetAdmission}";
   String getStudentList="{call sp_GetStudentlist}";
 public @Override void getStudentList(PreviousDetailEM objPreviousDetailEM)
  {
     _objDataBaseConnection.SetCon(_objDataBaseConnectionEM);
        try
        {
        Class.forName(_objDataBaseConnectionEM.getDB_DRIVER());
        objPreviousDetailEM.setcon(DriverManager.getConnection(_objDataBaseConnectionEM.getDB_CONNECTION(),_objDataBaseConnectionEM.getDB_USER(),_objDataBaseConnectionEM.getDB_PASSWORD()));
        objPreviousDetailEM.setStat(objPreviousDetailEM.getcon().prepareCall(getStudentList));     
        objPreviousDetailEM.setResultSet(objPreviousDetailEM.getStat().executeQuery());
         
        }
        catch(Exception ex)
        {
          ex.printStackTrace();
        }  
  }
  public @Override void getAdmission(PreviousDetailEM objPreviousDetailEM)
  {
    
      _objDataBaseConnection.SetCon(_objDataBaseConnectionEM);
        try
        {
        Class.forName(_objDataBaseConnectionEM.getDB_DRIVER());
        objPreviousDetailEM.setcon(DriverManager.getConnection(_objDataBaseConnectionEM.getDB_CONNECTION(),_objDataBaseConnectionEM.getDB_USER(),_objDataBaseConnectionEM.getDB_PASSWORD()));
        objPreviousDetailEM.setStat(objPreviousDetailEM.getcon().prepareCall(getAdmission));     
        objPreviousDetailEM.setResultSet(objPreviousDetailEM.getStat().executeQuery());
         
        }
        catch(Exception ex)
        {
          ex.printStackTrace();
        } 
  }
 public @Override  void addPreviousDetail(PreviousDetailEM objPreviousDetailEM)
 {
      _objDataBaseConnection.SetCon(_objDataBaseConnectionEM);
        try
        {
        Class.forName(_objDataBaseConnectionEM.getDB_DRIVER());
        objPreviousDetailEM.setcon(DriverManager.getConnection(_objDataBaseConnectionEM.getDB_CONNECTION(),_objDataBaseConnectionEM.getDB_USER(),_objDataBaseConnectionEM.getDB_PASSWORD()));
        objPreviousDetailEM.setStat(objPreviousDetailEM.getcon().prepareCall(addPreviousdata));
        objPreviousDetailEM.getStat().setInt(1, objPreviousDetailEM.GetadmissionId());
        objPreviousDetailEM.getStat().setInt(2, objPreviousDetailEM.GetQualificationId());
        objPreviousDetailEM.getStat().setString(3, objPreviousDetailEM.GetQualifiedIn());
        objPreviousDetailEM.getStat().setString(4, objPreviousDetailEM.GetYear());
        objPreviousDetailEM.getStat().setString(5, objPreviousDetailEM.GetMarks());
        objPreviousDetailEM.getStat().setString(6, objPreviousDetailEM.GetPercentage());
        objPreviousDetailEM.getStat().setString(7, objPreviousDetailEM.GetDivision());
        objPreviousDetailEM.getStat().setString(8, objPreviousDetailEM.GetDiscription());
        objPreviousDetailEM.getStat().setBoolean(9, true);
        
        objPreviousDetailEM.getStat().executeUpdate();
        objPreviousDetailEM.getcon().close();
        }
        catch(Exception ex)
        {
          ex.printStackTrace();
        }  
 }
}
