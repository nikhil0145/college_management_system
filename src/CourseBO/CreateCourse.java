/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseBO;

import java.sql.DriverManager;

/**
 *
 * @author Pankaj kumar
 */
public class CreateCourse implements ICreateCourse
{
   cmsBO.DataBaseConnection _objDataBaseConnection=new cmsBO.DataBaseConnection();
   cmsBO.DataBaseConnectionEM _objDataBaseConnectionEM=new cmsBO.DataBaseConnectionEM();
   String addCoursedata = "{call sp_AddCourse(?,?,?,?)}";
   String getCoursedata = "{call sp_GetCourse}";
 public @Override  void addCourse(CreateCourseEM objCreateCourseEM)
   {
     _objDataBaseConnection.SetCon(_objDataBaseConnectionEM);
        try
        {
        Class.forName(_objDataBaseConnectionEM.getDB_DRIVER());
        objCreateCourseEM.setcon(DriverManager.getConnection(_objDataBaseConnectionEM.getDB_CONNECTION(),_objDataBaseConnectionEM.getDB_USER(),_objDataBaseConnectionEM.getDB_PASSWORD()));
        objCreateCourseEM.setStat(objCreateCourseEM.getcon().prepareCall(addCoursedata));
        objCreateCourseEM.getStat().setInt(1,objCreateCourseEM.getCourseId());
        objCreateCourseEM.getStat().setString(2, objCreateCourseEM.getCourseName());
        objCreateCourseEM.getStat().setString(3, objCreateCourseEM.getdescription());
        objCreateCourseEM.getStat().setBoolean(4,true);
        objCreateCourseEM.getStat().executeUpdate();
        objCreateCourseEM.getcon().close();
        }
        catch(Exception ex)
        {
          ex.printStackTrace();
        }  
   }
 public @Override  void updateCourse(CreateCourseEM objCreateCourseEM)
  {
      
  }
 public @Override  void fetchCourse(CreateCourseEM objCreateCourseEM)
  {
    _objDataBaseConnection.SetCon(_objDataBaseConnectionEM);
        try
        {
        Class.forName(_objDataBaseConnectionEM.getDB_DRIVER());
        objCreateCourseEM.setcon(DriverManager.getConnection(_objDataBaseConnectionEM.getDB_CONNECTION(),_objDataBaseConnectionEM.getDB_USER(),_objDataBaseConnectionEM.getDB_PASSWORD()));
        objCreateCourseEM.setStat(objCreateCourseEM.getcon().prepareCall(getCoursedata));
        objCreateCourseEM.setResultSet(objCreateCourseEM.getStat().executeQuery());
         
        }
        catch(Exception ex)
        {
          ex.printStackTrace();
        }       
  }
 public @Override  void deleteCourse(CreateCourseEM objCreateCourseEM)
  {
      
  }
}
