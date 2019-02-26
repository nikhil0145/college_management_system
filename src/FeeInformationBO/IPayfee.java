/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FeeInformationBO;

/**
 *
 * @author pankaj kumar
 */
public interface IPayfee
{
void addFee(PayFeeEM objPayFeeEM);    
void getFee(PayFeeEM objPayFeeEM);
void getCourseID(PayFeeEM objPayFeeEM);
void payFee(PayFeeEM objPayFeeEM);
void getFeePaidDetail(PayFeeEM objPayFeeEM);
void getCourseFeeByName(PayFeeEM objPayFeeEM);

}
