/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentBO;

/**
 *
 * @author Pankaj kumar
 */
public interface IaddStudent
{
   void addStudent(addStudentEM objaddStudentEM);
   void UpdateStudent(addStudentEM objaddStudentEM);
   void updateStudent(addStudentEM objaddStudentEM);
   void fetchStudent(addStudentEM objaddStudentEM);
   void getCourseID(addStudentEM objaddStudentEM);
   void getStudentListData(addStudentEM objaddStudentEM);
   void getStudentListById(addStudentEM objaddStudentEM);
}
