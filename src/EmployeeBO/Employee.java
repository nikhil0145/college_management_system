/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeBO;

import java.sql.DriverManager;

/**
 *
 * @author Pankaj kumar
 */
public class Employee implements IEmployee
{
  cmsBO.DataBaseConnection _objDataBaseConnection=new cmsBO.DataBaseConnection();
  cmsBO.DataBaseConnectionEM _objDataBaseConnectionEM=new cmsBO.DataBaseConnectionEM();
  String addEmployeedata = "{call sp_AddEmployee(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
  String addEmployeeQualification = "{call sp_AddEmployeeCertificate(?,?,?,?,?)}";
  String getEmployee = "{call sp_GetEmployee}";
  String getEmployeeList = "{call sp_GetEmployeelist}";
 // String getAdmission="{call sp_GetAdmission}";
 public @Override void getEmployeeList(IEmployeeEM objEmployeeEM)
  {
      
      _objDataBaseConnection.SetCon(_objDataBaseConnectionEM);
        try
        {
        Class.forName(_objDataBaseConnectionEM.getDB_DRIVER());
        objEmployeeEM.setcon(DriverManager.getConnection(_objDataBaseConnectionEM.getDB_CONNECTION(),_objDataBaseConnectionEM.getDB_USER(),_objDataBaseConnectionEM.getDB_PASSWORD()));
        objEmployeeEM.setStat(objEmployeeEM.getcon().prepareCall(getEmployeeList));     
        objEmployeeEM.setResultSet(objEmployeeEM.getStat().executeQuery());
         
        }
        catch(Exception ex)
        {
          ex.printStackTrace();
        }    
  }
 public @Override void AddEmployee(IEmployeeEM objEmployeeEM)
 {
       _objDataBaseConnection.SetCon(_objDataBaseConnectionEM);
        try
        {
        Class.forName(_objDataBaseConnectionEM.getDB_DRIVER());
        objEmployeeEM.setcon(DriverManager.getConnection(_objDataBaseConnectionEM.getDB_CONNECTION(),_objDataBaseConnectionEM.getDB_USER(),_objDataBaseConnectionEM.getDB_PASSWORD()));
        objEmployeeEM.setStat(objEmployeeEM.getcon().prepareCall(addEmployeedata));
        objEmployeeEM.getStat().setInt(1, objEmployeeEM.getEmployeeId());
        objEmployeeEM.getStat().setString(2, objEmployeeEM.getEmployeeName());
        objEmployeeEM.getStat().setString(3, objEmployeeEM.getEmployeeDesignation());
        objEmployeeEM.getStat().setString(4, objEmployeeEM.getEmployeeSpecialization());
        objEmployeeEM.getStat().setString(5, objEmployeeEM.getEmployeeDescription());
        objEmployeeEM.getStat().setDate(6, objEmployeeEM.getJoiningDate());
        
        objEmployeeEM.getStat().setString(7, objEmployeeEM.getCountry());
        objEmployeeEM.getStat().setString(8, objEmployeeEM.getState());
        objEmployeeEM.getStat().setString(9, objEmployeeEM.getCity());
        objEmployeeEM.getStat().setString(10, objEmployeeEM.getTown());
        objEmployeeEM.getStat().setString(11, objEmployeeEM.getColony());
        objEmployeeEM.getStat().setString(12, objEmployeeEM.getPinncode());
        
        objEmployeeEM.getStat().setString(13, objEmployeeEM.getcontact1());
        objEmployeeEM.getStat().setString(14, objEmployeeEM.getcontact2());
        objEmployeeEM.getStat().setString(15, objEmployeeEM.getEmailid());
        objEmployeeEM.getStat().setBoolean(16, true);
        
        objEmployeeEM.getStat().executeUpdate();
        objEmployeeEM.getcon().close();
        }
        catch(Exception ex)
        {
          ex.printStackTrace();
        }  
 
  }
  public @Override  void getEmployee(IEmployeeEM objEmployeeEM)
  {
   _objDataBaseConnection.SetCon(_objDataBaseConnectionEM);
        try
        {
        Class.forName(_objDataBaseConnectionEM.getDB_DRIVER());
        objEmployeeEM.setcon(DriverManager.getConnection(_objDataBaseConnectionEM.getDB_CONNECTION(),_objDataBaseConnectionEM.getDB_USER(),_objDataBaseConnectionEM.getDB_PASSWORD()));
        objEmployeeEM.setStat(objEmployeeEM.getcon().prepareCall(getEmployee));     
        objEmployeeEM.setResultSet(objEmployeeEM.getStat().executeQuery());
         
        }
        catch(Exception ex)
        {
          ex.printStackTrace();
        }    
  }
  public @Override void AddEmployeeCertificate(IEmployeeEM objEmployeeEM)
  {
      _objDataBaseConnection.SetCon(_objDataBaseConnectionEM);
        try
        {
        Class.forName(_objDataBaseConnectionEM.getDB_DRIVER());
        objEmployeeEM.setcon(DriverManager.getConnection(_objDataBaseConnectionEM.getDB_CONNECTION(),_objDataBaseConnectionEM.getDB_USER(),_objDataBaseConnectionEM.getDB_PASSWORD()));
        objEmployeeEM.setStat(objEmployeeEM.getcon().prepareCall(addEmployeeQualification));
        objEmployeeEM.getStat().setInt(1, objEmployeeEM.getEmployeeId());
        objEmployeeEM.getStat().setInt(2, objEmployeeEM.getQualificationId());
        objEmployeeEM.getStat().setString(3, objEmployeeEM.getEmployeeQualification());
        objEmployeeEM.getStat().setString(4, objEmployeeEM.getqualificationyear());
       
        objEmployeeEM.getStat().setBoolean(5, true);
        
        objEmployeeEM.getStat().executeUpdate();
        objEmployeeEM.getcon().close();
        }
        catch(Exception ex)
        {
          ex.printStackTrace();
        }  
  
  }
      
  
}
