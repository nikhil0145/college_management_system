/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseBO;

/**
 *
 * @author Pankaj kumar
 */
public interface ICreateCourse 
{
  void addCourse(CreateCourseEM objCreateCourseEM);  
  void updateCourse(CreateCourseEM objCreateCourseEM);
  void fetchCourse(CreateCourseEM objCreateCourseEM);
  void deleteCourse(CreateCourseEM objCreateCourseEM);
}
