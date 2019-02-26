/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentCertificateBO;

import java.sql.DriverManager;

/**
 *
 * @author Pankaj kumar
 */
public class StudentCertifcate implements IStudentCertificate
{
    cmsBO.DataBaseConnection _objDataBaseConnection=new cmsBO.DataBaseConnection();
    cmsBO.DataBaseConnectionEM _objDataBaseConnectionEM=new cmsBO.DataBaseConnectionEM();
    String addCertificate = "{call sp_AddStudentCertificate(?,?,?,?,?)}";
    String getCertificate = "{call sp_GetPreviousDetail}";
    String getAdmission="{call sp_GetAdmission}";
   public @Override void addCertificate(StudentCertificateEM objStudentCertificateEM)
     {
       _objDataBaseConnection.SetCon(_objDataBaseConnectionEM);
        try
        {
        Class.forName(_objDataBaseConnectionEM.getDB_DRIVER());
        objStudentCertificateEM.setcon(DriverManager.getConnection(_objDataBaseConnectionEM.getDB_CONNECTION(),_objDataBaseConnectionEM.getDB_USER(),_objDataBaseConnectionEM.getDB_PASSWORD()));
        objStudentCertificateEM.setStat(objStudentCertificateEM.getcon().prepareCall(addCertificate));
        objStudentCertificateEM.getStat().setInt(1, objStudentCertificateEM.GetadmissionId());
        objStudentCertificateEM.getStat().setInt(2, objStudentCertificateEM.GetcertificateId());
        objStudentCertificateEM.getStat().setString(3, objStudentCertificateEM.GetcertificateName());
        objStudentCertificateEM.getStat().setString(4, objStudentCertificateEM.Getdescription());
        objStudentCertificateEM.getStat().setBoolean(5, true);
        
        objStudentCertificateEM.getStat().executeUpdate();
        objStudentCertificateEM.getcon().close();
        }
        catch(Exception ex)
        {
          ex.printStackTrace();
        }  
     }
   public @Override void UpdateCertificate(StudentCertificateEM objStudentCertificateEM)
     {
     }
   public @Override void FetchAdmission(StudentCertificateEM objStudentCertificateEM)
     {
         _objDataBaseConnection.SetCon(_objDataBaseConnectionEM);
        try
        {
        Class.forName(_objDataBaseConnectionEM.getDB_DRIVER());
        objStudentCertificateEM.setcon(DriverManager.getConnection(_objDataBaseConnectionEM.getDB_CONNECTION(),_objDataBaseConnectionEM.getDB_USER(),_objDataBaseConnectionEM.getDB_PASSWORD()));
        objStudentCertificateEM.setStat(objStudentCertificateEM.getcon().prepareCall(getAdmission));     
        objStudentCertificateEM.setResultSet(objStudentCertificateEM.getStat().executeQuery());
         
        }
        catch(Exception ex)
        {
          ex.printStackTrace();
        } 
         
     }
    
}
