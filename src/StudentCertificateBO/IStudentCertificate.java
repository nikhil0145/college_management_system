/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentCertificateBO;

/**
 *
 * @author Pankaj kumar
 */
public interface IStudentCertificate 
{
void addCertificate(StudentCertificateEM objStudentCertificateEM);
void UpdateCertificate(StudentCertificateEM objStudentCertificateEM);
void FetchAdmission(StudentCertificateEM objStudentCertificateEM);

}
