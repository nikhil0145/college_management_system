/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentBO;

import java.sql.DriverManager;

/**
 *
 * @author Pankaj kumar
 */
public class addStudent implements IaddStudent
{
   cmsBO.DataBaseConnection _objDataBaseConnection=new cmsBO.DataBaseConnection();
   cmsBO.DataBaseConnectionEM _objDataBaseConnectionEM=new cmsBO.DataBaseConnectionEM();
   String addStudentdata = "{call sp_AddStudent(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
   String UpdateStudentdata = "{call sp_UpdateStudent(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
   String getStudentdata = "{call sp_GetStudent}";
   String grtCourseID="{call sp_GetCourseID(?)}";
   String getStudentListData="{call sp_GetStudentlistData(?,?,?)}";
   String getStudentListById="{call sp_GetStudentlistById(?)}";
   public @Override void getStudentListById(addStudentEM objaddStudentEM)
   {
       _objDataBaseConnection.SetCon(_objDataBaseConnectionEM);
        try
        {
        Class.forName(_objDataBaseConnectionEM.getDB_DRIVER());
        objaddStudentEM.setcon(DriverManager.getConnection(_objDataBaseConnectionEM.getDB_CONNECTION(),_objDataBaseConnectionEM.getDB_USER(),_objDataBaseConnectionEM.getDB_PASSWORD()));
        objaddStudentEM.setStat(objaddStudentEM.getcon().prepareCall(getStudentListById));
        objaddStudentEM.getStat().setLong(1,objaddStudentEM.getAdmissionId());
        objaddStudentEM.setResultSet(objaddStudentEM.getStat().executeQuery());
         
        }
        catch(Exception ex)
        {
          ex.printStackTrace();
        }     
   }
   public @Override void getStudentListData(addStudentEM objaddStudentEM)
    {
    _objDataBaseConnection.SetCon(_objDataBaseConnectionEM);
        try
        {
        Class.forName(_objDataBaseConnectionEM.getDB_DRIVER());
        objaddStudentEM.setcon(DriverManager.getConnection(_objDataBaseConnectionEM.getDB_CONNECTION(),_objDataBaseConnectionEM.getDB_USER(),_objDataBaseConnectionEM.getDB_PASSWORD()));
        objaddStudentEM.setStat(objaddStudentEM.getcon().prepareCall(getStudentListData));
        objaddStudentEM.getStat().setString(1,objaddStudentEM.getSession());
        objaddStudentEM.getStat().setString(2,objaddStudentEM.getCourseName());
        objaddStudentEM.getStat().setString(3,objaddStudentEM.getForYear());
        objaddStudentEM.setResultSet(objaddStudentEM.getStat().executeQuery());
         
        }
        catch(Exception ex)
        {
          ex.printStackTrace();
        }      
    }
  public @Override void getCourseID(addStudentEM objaddStudentEM)  
  {
    _objDataBaseConnection.SetCon(_objDataBaseConnectionEM);
        try
        {
        Class.forName(_objDataBaseConnectionEM.getDB_DRIVER());
        objaddStudentEM.setcon(DriverManager.getConnection(_objDataBaseConnectionEM.getDB_CONNECTION(),_objDataBaseConnectionEM.getDB_USER(),_objDataBaseConnectionEM.getDB_PASSWORD()));
        objaddStudentEM.setStat(objaddStudentEM.getcon().prepareCall(grtCourseID));
        objaddStudentEM.getStat().setString(1,objaddStudentEM.getCourseName());
       
        objaddStudentEM.setResultSet(objaddStudentEM.getStat().executeQuery());
         
        }
        catch(Exception ex)
        {
          ex.printStackTrace();
        }       
  }
  public @Override void UpdateStudent(addStudentEM objaddStudentEM)
  {
     _objDataBaseConnection.SetCon(_objDataBaseConnectionEM);
        try
        {
        Class.forName(_objDataBaseConnectionEM.getDB_DRIVER());
        objaddStudentEM.setcon(DriverManager.getConnection(_objDataBaseConnectionEM.getDB_CONNECTION(),_objDataBaseConnectionEM.getDB_USER(),_objDataBaseConnectionEM.getDB_PASSWORD()));
        objaddStudentEM.setStat(objaddStudentEM.getcon().prepareCall(UpdateStudentdata));
        objaddStudentEM.getStat().setInt(1,objaddStudentEM.getAdmissionId());
        objaddStudentEM.getStat().setString(2, objaddStudentEM.getStudentName());
        objaddStudentEM.getStat().setString(3, objaddStudentEM.getDateOfAdmission());
        objaddStudentEM.getStat().setString(4, objaddStudentEM.getSex());
        objaddStudentEM.getStat().setString(5, objaddStudentEM.getdob());
        objaddStudentEM.getStat().setString(6, objaddStudentEM.getGuardianName());
        objaddStudentEM.getStat().setString(7, objaddStudentEM.getFatherName());
        objaddStudentEM.getStat().setString(8, objaddStudentEM.getMotherName());
        objaddStudentEM.getStat().setString(9, objaddStudentEM.getFatherOccupation());
        objaddStudentEM.getStat().setString(10, objaddStudentEM.getMotherOccupation());
        objaddStudentEM.getStat().setString(11, objaddStudentEM.getYearlyIncome());
        objaddStudentEM.getStat().setString(12, objaddStudentEM.getvillage_colony());
        objaddStudentEM.getStat().setString(13, objaddStudentEM.getCity());
        objaddStudentEM.getStat().setString(14, objaddStudentEM.getPincode());
        objaddStudentEM.getStat().setString(15, objaddStudentEM.getState());
        objaddStudentEM.getStat().setString(16, objaddStudentEM.getCountry());
        objaddStudentEM.getStat().setString(17, objaddStudentEM.getContact1());
        objaddStudentEM.getStat().setString(18, objaddStudentEM.getContact2());
        objaddStudentEM.getStat().setString(19, objaddStudentEM.getEmailiD());
        objaddStudentEM.getStat().setBoolean(20,objaddStudentEM.getStatus());
        objaddStudentEM.getStat().executeUpdate();
        objaddStudentEM.getcon().close();
        }
        catch(Exception ex)
        {
          ex.printStackTrace();
        }     
  }
public @Override void addStudent(addStudentEM objaddStudentEM)
{
  _objDataBaseConnection.SetCon(_objDataBaseConnectionEM);
        try
        {
        Class.forName(_objDataBaseConnectionEM.getDB_DRIVER());
        objaddStudentEM.setcon(DriverManager.getConnection(_objDataBaseConnectionEM.getDB_CONNECTION(),_objDataBaseConnectionEM.getDB_USER(),_objDataBaseConnectionEM.getDB_PASSWORD()));
        objaddStudentEM.setStat(objaddStudentEM.getcon().prepareCall(addStudentdata));
        objaddStudentEM.getStat().setInt(1,objaddStudentEM.getAdmissionId());
        objaddStudentEM.getStat().setString(2, objaddStudentEM.getSession());
        objaddStudentEM.getStat().setInt(3, objaddStudentEM.getCourseId());
        objaddStudentEM.getStat().setString(4, objaddStudentEM.getForYear());
        objaddStudentEM.getStat().setString(5, objaddStudentEM.getStudentName());
        objaddStudentEM.getStat().setString(6, objaddStudentEM.getDateOfAdmission());
        objaddStudentEM.getStat().setString(7, objaddStudentEM.getSex());
         objaddStudentEM.getStat().setString(8, objaddStudentEM.getdob());
        objaddStudentEM.getStat().setString(9, objaddStudentEM.getGuardianName());
        objaddStudentEM.getStat().setString(10, objaddStudentEM.getFatherName());
        objaddStudentEM.getStat().setString(11, objaddStudentEM.getMotherName());
        objaddStudentEM.getStat().setString(12, objaddStudentEM.getFatherOccupation());
        objaddStudentEM.getStat().setString(13, objaddStudentEM.getMotherOccupation());
        objaddStudentEM.getStat().setString(14, objaddStudentEM.getYearlyIncome());
        objaddStudentEM.getStat().setString(15, objaddStudentEM.getvillage_colony());
        objaddStudentEM.getStat().setString(16, objaddStudentEM.getCity());
        objaddStudentEM.getStat().setString(17, objaddStudentEM.getPincode());
         objaddStudentEM.getStat().setString(18, objaddStudentEM.getState());
        objaddStudentEM.getStat().setString(19, objaddStudentEM.getCountry());
        objaddStudentEM.getStat().setString(20, objaddStudentEM.getContact1());
        objaddStudentEM.getStat().setString(21, objaddStudentEM.getContact2());
        objaddStudentEM.getStat().setString(22, objaddStudentEM.getEmailiD());
        objaddStudentEM.getStat().setBoolean(23,objaddStudentEM.getStatus());
        objaddStudentEM.getStat().executeUpdate();
        objaddStudentEM.getcon().close();
        }
        catch(Exception ex)
        {
          ex.printStackTrace();
        }   
}
public @Override void updateStudent(addStudentEM objaddStudentEM)
{
    
}
public @Override void fetchStudent(addStudentEM objaddStudentEM)
{
   _objDataBaseConnection.SetCon(_objDataBaseConnectionEM);
        try
        {
        Class.forName(_objDataBaseConnectionEM.getDB_DRIVER());
        objaddStudentEM.setcon(DriverManager.getConnection(_objDataBaseConnectionEM.getDB_CONNECTION(),_objDataBaseConnectionEM.getDB_USER(),_objDataBaseConnectionEM.getDB_PASSWORD()));
        objaddStudentEM.setStat(objaddStudentEM.getcon().prepareCall(getStudentdata));
        objaddStudentEM.setResultSet(objaddStudentEM.getStat().executeQuery());
         
        }
        catch(Exception ex)
        {
          ex.printStackTrace();
        }        
}
}
