/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FeeInformationBO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author pankaj kumar
 */
public class PayFee implements IPayfee
{
   cmsBO.DataBaseConnection _objDataBaseConnection=new cmsBO.DataBaseConnection();
   cmsBO.DataBaseConnectionEM _objDataBaseConnectionEM=new cmsBO.DataBaseConnectionEM();
   String addStudentFee = "{call sp_AddCourseFee(?,?,?,?,?,?)}";
   String PayStudentFee = "{call sp_AddStudentFeePaid(?,?,?,?,?,?,?)}";
   String getStudentFee = "{call sp_getStudentFee}";
  String grtCourseID="{call sp_GetCourseID(?)}";
  String grtFeePaidDetails="{call sp_GetFeeDetail(?)}";
   String getCourseFee="{call sp_GetFee}";
   String getCourseFeebyCourseName="{call sp_GetCoursefee(?)}";
  public @Override void getCourseFeeByName(PayFeeEM objPayFeeEM)
   {
    _objDataBaseConnection.SetCon(_objDataBaseConnectionEM);
        try
        {
        Class.forName(_objDataBaseConnectionEM.getDB_DRIVER());
        objPayFeeEM.setcon(DriverManager.getConnection(_objDataBaseConnectionEM.getDB_CONNECTION(),_objDataBaseConnectionEM.getDB_USER(),_objDataBaseConnectionEM.getDB_PASSWORD()));
        objPayFeeEM.setStat(objPayFeeEM.getcon().prepareCall(getCourseFeebyCourseName));
        objPayFeeEM.getStat().setString(1,objPayFeeEM.GetcourseName()); 
        objPayFeeEM.setResultSet(objPayFeeEM.getStat().executeQuery());
         
        }
        catch(Exception ex)
        {
          ex.printStackTrace();
        }      
   }
 public @Override void getFeePaidDetail(PayFeeEM objPayFeeEM)
  {
     _objDataBaseConnection.SetCon(_objDataBaseConnectionEM);
        try
        {
        Class.forName(_objDataBaseConnectionEM.getDB_DRIVER());
        objPayFeeEM.setcon(DriverManager.getConnection(_objDataBaseConnectionEM.getDB_CONNECTION(),_objDataBaseConnectionEM.getDB_USER(),_objDataBaseConnectionEM.getDB_PASSWORD()));
        objPayFeeEM.setStat(objPayFeeEM.getcon().prepareCall(grtFeePaidDetails));
        objPayFeeEM.getStat().setInt(1,objPayFeeEM.Getadmissionid());
       
        objPayFeeEM.setResultSet(objPayFeeEM.getStat().executeQuery());
         
        }
        catch(Exception ex)
        {
          ex.printStackTrace();
        }   
  }
 public @Override void payFee(PayFeeEM objPayFeeEM)
  {
       _objDataBaseConnection.SetCon(_objDataBaseConnectionEM);
        try
        {
        Class.forName(_objDataBaseConnectionEM.getDB_DRIVER());
        objPayFeeEM.setcon(DriverManager.getConnection(_objDataBaseConnectionEM.getDB_CONNECTION(),_objDataBaseConnectionEM.getDB_USER(),_objDataBaseConnectionEM.getDB_PASSWORD()));
        objPayFeeEM.setStat(objPayFeeEM.getcon().prepareCall(PayStudentFee));
        objPayFeeEM.getStat().setInt(1,objPayFeeEM.GetFeeid());
        objPayFeeEM.getStat().setInt(2, objPayFeeEM.Getadmissionid());
        objPayFeeEM.getStat().setInt(3, objPayFeeEM.GetcourseId());
        objPayFeeEM.getStat().setFloat(4, objPayFeeEM.Getfee());
         objPayFeeEM.getStat().setString(5, objPayFeeEM.GetFeePayDate());
        objPayFeeEM.getStat().setString(6, objPayFeeEM.GetDescription());
        objPayFeeEM.getStat().setBoolean(7,true);
        objPayFeeEM.getStat().executeUpdate();
        objPayFeeEM.getcon().close();
        }
        catch(Exception ex)
        {
          ex.printStackTrace();
        } 
  }
  public @Override void addFee(PayFeeEM objPayFeeEM)
    {
    _objDataBaseConnection.SetCon(_objDataBaseConnectionEM);
        try
        {
        Class.forName(_objDataBaseConnectionEM.getDB_DRIVER());
        objPayFeeEM.setcon(DriverManager.getConnection(_objDataBaseConnectionEM.getDB_CONNECTION(),_objDataBaseConnectionEM.getDB_USER(),_objDataBaseConnectionEM.getDB_PASSWORD()));
        objPayFeeEM.setStat(objPayFeeEM.getcon().prepareCall(addStudentFee));
        objPayFeeEM.getStat().setInt(1,objPayFeeEM.GetFeeid());
        objPayFeeEM.getStat().setInt(2, objPayFeeEM.GetcourseId());
        objPayFeeEM.getStat().setString(3, objPayFeeEM.GetforYear());
        objPayFeeEM.getStat().setFloat(4, objPayFeeEM.Getfee());
        objPayFeeEM.getStat().setString(5, objPayFeeEM.GetDescription());
        objPayFeeEM.getStat().setBoolean(6,true);
        objPayFeeEM.getStat().executeUpdate();
        objPayFeeEM.getcon().close();
        }
        catch(Exception ex)
        {
          ex.printStackTrace();
        } 
    }
   public @Override void getFee(PayFeeEM objPayFeeEM)
    {
_objDataBaseConnection.SetCon(_objDataBaseConnectionEM);
        try
        {
        Class.forName(_objDataBaseConnectionEM.getDB_DRIVER());
        objPayFeeEM.setcon(DriverManager.getConnection(_objDataBaseConnectionEM.getDB_CONNECTION(),_objDataBaseConnectionEM.getDB_USER(),_objDataBaseConnectionEM.getDB_PASSWORD()));
        objPayFeeEM.setStat(objPayFeeEM.getcon().prepareCall(getCourseFee));
            
        objPayFeeEM.setResultSet(objPayFeeEM.getStat().executeQuery());
         
        }
        catch(Exception ex)
        {
          ex.printStackTrace();
        }   
    }
   public @Override void getCourseID(PayFeeEM objPayFeeEM)
   {
        _objDataBaseConnection.SetCon(_objDataBaseConnectionEM);
        try
        {
        Class.forName(_objDataBaseConnectionEM.getDB_DRIVER());
        objPayFeeEM.setcon(DriverManager.getConnection(_objDataBaseConnectionEM.getDB_CONNECTION(),_objDataBaseConnectionEM.getDB_USER(),_objDataBaseConnectionEM.getDB_PASSWORD()));
        objPayFeeEM.setStat(objPayFeeEM.getcon().prepareCall(grtCourseID));
        objPayFeeEM.getStat().setString(1,objPayFeeEM.GetcourseName());
       
        objPayFeeEM.setResultSet(objPayFeeEM.getStat().executeQuery());
         
        }
        catch(Exception ex)
        {
          ex.printStackTrace();
        } 
   }
   
    
}
