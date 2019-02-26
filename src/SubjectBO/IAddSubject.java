/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SubjectBO;

/**
 *
 * @author Pankaj kumar
 */
public interface IAddSubject 
{
   void addSubject(AddSubjectEM objAddSubjectEM); 
   void updateSubject(AddSubjectEM objAddSubjectEM); 
   void deleteSubject(AddSubjectEM objAddSubjectEM); 
   void fetchSubject(AddSubjectEM objAddSubjectEM); 
   void getSubjectId(AddSubjectEM objAddSubjectEM);
}
