/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseSubjectBO;

import java.sql.DriverManager;

/**
 *
 * @author Pankaj kumar
 */
public class courseSubject implements IcourseSubject
{
  cmsBO.DataBaseConnection _objDataBaseConnection=new cmsBO.DataBaseConnection();
  cmsBO.DataBaseConnectionEM _objDataBaseConnectionEM=new cmsBO.DataBaseConnectionEM();
   String getCoursedata = "{call sp_GetCourse}";
   String getsubject = "{call sp_GetSubject}";
   String AddCourseSubject = "{call sp_AddCourseSubject(?,?,?,?,?,?)}";
   
public @Override void getCourse(courseSubjectEM objcoSubjectEM)
{
    _objDataBaseConnection.SetCon(_objDataBaseConnectionEM);
        try
        {
        Class.forName(_objDataBaseConnectionEM.getDB_DRIVER());
        objcoSubjectEM.setcon(DriverManager.getConnection(_objDataBaseConnectionEM.getDB_CONNECTION(),_objDataBaseConnectionEM.getDB_USER(),_objDataBaseConnectionEM.getDB_PASSWORD()));
        objcoSubjectEM.setStat(objcoSubjectEM.getcon().prepareCall(getCoursedata));
        objcoSubjectEM.setResultSet(objcoSubjectEM.getStat().executeQuery());
         
        }
        catch(Exception ex)
        {
          ex.printStackTrace();
        }  
}
public @Override void getSubject(courseSubjectEM objcoSubjectEM)
{
  _objDataBaseConnection.SetCon(_objDataBaseConnectionEM);
        try
        {
        Class.forName(_objDataBaseConnectionEM.getDB_DRIVER());
        objcoSubjectEM.setcon(DriverManager.getConnection(_objDataBaseConnectionEM.getDB_CONNECTION(),_objDataBaseConnectionEM.getDB_USER(),_objDataBaseConnectionEM.getDB_PASSWORD()));
        objcoSubjectEM.setStat(objcoSubjectEM.getcon().prepareCall(getsubject));
        objcoSubjectEM.setResultSet(objcoSubjectEM.getStat().executeQuery());
         
        }
        catch(Exception ex)
        {
          ex.printStackTrace();
        }    
}
public @Override void addCourseSubject(courseSubjectEM objcoSubjectEM)
{
    _objDataBaseConnection.SetCon(_objDataBaseConnectionEM);
        try
        {
        Class.forName(_objDataBaseConnectionEM.getDB_DRIVER());
        objcoSubjectEM.setcon(DriverManager.getConnection(_objDataBaseConnectionEM.getDB_CONNECTION(),_objDataBaseConnectionEM.getDB_USER(),_objDataBaseConnectionEM.getDB_PASSWORD()));
        objcoSubjectEM.setStat(objcoSubjectEM.getcon().prepareCall(AddCourseSubject));
        objcoSubjectEM.getStat().setInt(1,objcoSubjectEM.getcourseSubjectId());
        objcoSubjectEM.getStat().setInt(2, objcoSubjectEM.getcourseId());
        objcoSubjectEM.getStat().setInt(3, objcoSubjectEM.getsubjectId());
         objcoSubjectEM.getStat().setString(4, objcoSubjectEM.getforYear());
          objcoSubjectEM.getStat().setString(5, objcoSubjectEM.getdescripton());
        objcoSubjectEM.getStat().setBoolean(6,true);
        objcoSubjectEM.getStat().executeUpdate();
        objcoSubjectEM.getcon().close();
        }
        catch(Exception ex)
        {
          ex.printStackTrace();
        }   
}
public @Override void updateCourseSubject(courseSubjectEM objcoSubjectEM)
{
}
}