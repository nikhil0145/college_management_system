/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentPrviousDetailBO;

/**
 *
 * @author Pankaj kumar
 */
public interface IPreviousDetail 
{
   void getAdmission(PreviousDetailEM objPreviousDetailEM);
   void addPreviousDetail(PreviousDetailEM objPreviousDetailEM);
   void getStudentList(PreviousDetailEM objPreviousDetailEM);
   
}
