/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cmsBO;
import java.sql.*;
/**
 *
 * @author Pankaj kumar
 */


public class DataBaseConnection implements IDatabaseConnection
{
   
     private static final String DB_DRIVER ="com.microsoft.sqlserver.jdbc.SQLServerDriver";
     private static final String DB_CONNECTION ="jdbc:sqlserver://localhost\\Pankaj\\SQLEXPRESS:1433;databaseName=CMS";
     private static final String DB_USER = "sa";
     private static final String DB_PASSWORD ="password@1"; 
    public @Override void SetCon(DataBaseConnectionEM objDataBaseConnectionEM)
     {
         try
         {
      objDataBaseConnectionEM.setDB_DRIVER(DB_DRIVER);
      objDataBaseConnectionEM.setDB_CONNECTION(DB_CONNECTION);
      objDataBaseConnectionEM.setDB_USER(DB_USER);
      objDataBaseConnectionEM.setDB_PASSWORD(DB_PASSWORD);
         }
         catch(Exception ex)
         {
             ex.printStackTrace();
         }
        
     }
     
}
