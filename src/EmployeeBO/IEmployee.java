/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeBO;

/**
 *
 * @author Pankaj kumar
 */
public interface IEmployee 
{
    void AddEmployee(IEmployeeEM objEmployeeEM);
     void getEmployee(IEmployeeEM objEmployeeEM);
     void AddEmployeeCertificate(IEmployeeEM objEmployeeEM);
     void getEmployeeList(IEmployeeEM objEmployeeEM);
     
}
