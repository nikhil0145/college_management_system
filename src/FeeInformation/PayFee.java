/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FeeInformation;

import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pankaj kumar
 */
public class PayFee extends javax.swing.JFrame {

    /**
     * Creates new form PayFee
     */
   FeeInformationBO.PayFeeEM _objPayFeeEM=new FeeInformationBO.PayFeeEM();
 FeeInformationBO.PayFee _objPayFee=new FeeInformationBO.PayFee();
    public PayFee() {
        initComponents();
        try
        {
           

        displayStudent();
        displayCourseSub();
      
        }
        catch(Exception ex)
        {
            
        }
    }
    int admissionid=0;
 StudentPrviousDetailBO.PreviousDetail _objPreviousDetail=new StudentPrviousDetailBO.PreviousDetail();
      StudentPrviousDetailBO.PreviousDetailEM _objPreviousDetailEM=new StudentPrviousDetailBO.PreviousDetailEM();
    int r=0;
    float TotalAmount;
    float PaidAmount;
    float BalanceAmount;
   static Vector<Vector<String>> data = new Vector<Vector<String>>();
   static Vector<Vector<String>> data1 = new Vector<Vector<String>>();

    public void displayStudent() throws SQLException
     {
      data.clear();
    try
      {
      _objPreviousDetail.getAdmission(_objPreviousDetailEM);
        Vector<String> columnNames = new Vector<String>();
        columnNames.add("Admission ID");
        columnNames.add("Student Name");
        columnNames.add("Session");
        columnNames.add("Course");
       while(_objPreviousDetailEM.getResultSet().next())
       {
             Vector<String> vstring2 = new Vector<String>();
             vstring2.add(_objPreviousDetailEM.getResultSet().getString(1));
             vstring2.add(_objPreviousDetailEM.getResultSet().getString(2));
             vstring2.add(_objPreviousDetailEM.getResultSet().getString(3));
             vstring2.add(_objPreviousDetailEM.getResultSet().getString(4));
        
       data.add(vstring2);
         
       }
      DefaultTableModel model = new DefaultTableModel(data, columnNames);
        tbladmissiondata2.setModel(model);
     
      
     _objPreviousDetailEM.getcon().close();
      }
      
      catch(Exception ex)
      {
         ex.printStackTrace();
      }   
   }
     public void displayFeePaidDetail() throws SQLException
     {
         PaidAmount=0;
      data1.clear();
    try
      {
          if(admissionid>=1)
          {
          _objPayFeeEM.setadmissionid(admissionid);
      _objPayFee.getFeePaidDetail(_objPayFeeEM);
        Vector<String> columnNames = new Vector<String>();
        columnNames.add("AdmissionID");
        columnNames.add("PaidAmount");
        columnNames.add("PayDate");
        columnNames.add("Description");
       while(_objPayFeeEM.getResultSet().next())
       {
             Vector<String> vstring1 = new Vector<String>();
             vstring1.add(_objPayFeeEM.getResultSet().getString(1));
             vstring1.add(_objPayFeeEM.getResultSet().getString(2));
             vstring1.add(_objPayFeeEM.getResultSet().getString(3));
             vstring1.add(_objPayFeeEM.getResultSet().getString(4));
             PaidAmount=PaidAmount+Float.valueOf(_objPayFeeEM.getResultSet().getString(2));
       data1.add(vstring1);
         
       }
       lblPaidAmount.setText(String.valueOf(PaidAmount));
      DefaultTableModel model = new DefaultTableModel(data1, columnNames);
        tblfeeDetail.setModel(model);
     
      
   _objPayFeeEM.getcon().close();
          }
          else
          {
              
          }
      }
      
      catch(Exception ex)
      {
        // ex.printStackTrace();
      }   
   }
      int courseId=0;
    Vector<String> vstring = new Vector<String>();
 public void displayCourseSub() throws SQLException
   {
      
    try
      {
        
      CourseSubjectBO.courseSubject _objCourseSubject=new CourseSubjectBO.courseSubject();
      CourseSubjectBO.courseSubjectEM _objCourSubjectEM=new CourseSubjectBO.courseSubjectEM();
       _objCourseSubject.getCourse(_objCourSubjectEM);
       
       while(_objCourSubjectEM.getResultSet().next())
       {
     // vstring.add(_objCourSubjectEM.getResultSet().getString(2));
       // vstring.add(_objCourSubjectEM.getResultSet().getString(1));
      // vstring.add(_objCourSubjectEM.getResultSet().getInt(1),_objCourSubjectEM.getResultSet().getString(1));
       cmbCourseName.addItem(_objCourSubjectEM.getResultSet().getString(2));
         
       }
      //cmbCourse.addItem(vstring);
       
      
     _objCourSubjectEM.getcon().close();
      }
      
      catch(Exception ex)
      {
         ex.printStackTrace();
      }   
   }
 float totalfee;
public void getCoursefEE() throws SQLException
   {
      totalfee=0;
    try
      {
        
          _objPayFeeEM.setcourseName(course);
       _objPayFee.getCourseFeeByName(_objPayFeeEM);
 
       while(_objPayFeeEM.getResultSet().next())
       {
           totalfee=totalfee+ Float.valueOf(_objPayFeeEM.getResultSet().getString(3));
    
       }
      //cmbCourse.addItem(vstring);
       
      
     _objPayFeeEM.getcon().close();
      }
      
      catch(Exception ex)
      {
         ex.printStackTrace();
      } 
    lblTotalAmount.setText(String.valueOf(totalfee));
   }
 public void getCourseSubID() throws SQLException
   {
      
    try
      {
        
          _objPayFeeEM.setcourseName(cmbCourseName.getSelectedItem().toString());
       _objPayFee.getCourseID(_objPayFeeEM);
 
       while(_objPayFeeEM.getResultSet().next())
       {
     courseId=Integer.parseInt(_objPayFeeEM.getResultSet().getString(1));
       }
      //cmbCourse.addItem(vstring);
       
      
     _objPayFeeEM.getcon().close();
      }
      
      catch(Exception ex)
      {
         ex.printStackTrace();
      }   
   }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbladmissiondata2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtAdmissionId = new javax.swing.JTextField();
        cmbCourseName = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFeepaid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtPayDate = new javax.swing.JFormattedTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblfeeDetail = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblBalanceAmount = new javax.swing.JLabel();
        lblTotalAmount = new javax.swing.JLabel();
        lblPaidAmount = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tbladmissiondata2.setBackground(new java.awt.Color(204, 204, 255));
        tbladmissiondata2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 1, true));
        tbladmissiondata2.setForeground(new java.awt.Color(204, 0, 0));
        tbladmissiondata2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbladmissiondata2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbladmissiondata2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbladmissiondata2);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 1, true));

        jLabel1.setText("Admission Id");

        cmbCourseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCourseNameActionPerformed(evt);
            }
        });

        jLabel2.setText("Course Name");

        jLabel3.setText("Fee Paid");

        jLabel4.setText("Description");

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane2.setViewportView(txtDescription);

        jButton1.setText("Paid");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("PayDate");

        try {
            txtPayDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbCourseName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAdmissionId)
                    .addComponent(txtFeepaid)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPayDate))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtAdmissionId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(cmbCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFeepaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtPayDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        tblfeeDetail.setAutoCreateRowSorter(true);
        tblfeeDetail.setBackground(new java.awt.Color(204, 204, 255));
        tblfeeDetail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        tblfeeDetail.setForeground(new java.awt.Color(204, 0, 0));
        tblfeeDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "AdmissionId", "PaidAmount", "PayDate", "Description"
            }
        ));
        jScrollPane3.setViewportView(tblfeeDetail);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));

        jLabel6.setText("Total Amount");

        jLabel7.setText("Paid Amount");

        lblBalanceAmount.setText("Balance");

        lblTotalAmount.setText("Total Amount");

        lblPaidAmount.setText("Paid Amount");

        jLabel11.setText("Balance");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPaidAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(lblTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblBalanceAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPaidAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBalanceAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCourseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCourseNameActionPerformed
         try
        {
        getCourseSubID();
        
        }
        catch(Exception ex)
        {
            
        }
    }//GEN-LAST:event_cmbCourseNameActionPerformed
    String course;
    private void tbladmissiondata2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbladmissiondata2MouseClicked
        int row = tbladmissiondata2.getSelectedRow();
   // int col = jTable1.getSelectedColumn();
   // Object data = (Object)jTable1.getValueAt(row, col);
    
     txtAdmissionId.setText(tbladmissiondata2.getValueAt(row, 0).toString());
     admissionid=Integer.parseInt(tbladmissiondata2.getValueAt(row, 0).toString());
     course=tbladmissiondata2.getValueAt(row, 3).toString();
     try
     {
         
     displayFeePaidDetail();
     getCoursefEE();
     balanceAmount();
     }
     catch(Exception ex)
     {
         
     }
    }//GEN-LAST:event_tbladmissiondata2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
       
       if(txtAdmissionId.getText().equals(""))
       {
           JOptionPane.showMessageDialog(rootPane, "Select AdmissionId"); 
           
       }
      else if(cmbCourseName.getSelectedItem().toString().equals(""))
       {
          JOptionPane.showMessageDialog(rootPane, "Select Course");  
       }
      else if(txtFeepaid.getText().equals(""))
       {
            JOptionPane.showMessageDialog(rootPane, "Enter the Fee......");
           
       }
       else if(txtAdmissionId.getText().contains("  /  /    "))
       {
            JOptionPane.showMessageDialog(rootPane, "Enter Pay Date");
       }
       else
        {
       float tfee=Float.valueOf(lblTotalAmount.getText());
       float tPaid=Float.valueOf(lblPaidAmount.getText());
       float tamount=Float.valueOf(txtFeepaid.getText());
        if(lblTotalAmount.getText().equals(lblPaidAmount.getText()))
        {
           JOptionPane.showMessageDialog(rootPane, "Course Fee is Completed...."); 
        }
        else if((tamount+tPaid)>tfee)
        {
          JOptionPane.showMessageDialog(rootPane, "Invalid Entry Please Check Inputed Amount....");   
        }
        else
        {
        _objPayFeeEM.setFeeid(0);
        _objPayFeeEM.setadmissionid(Integer.parseInt(txtAdmissionId.getText()));
        _objPayFeeEM.setcourseId(courseId);
        _objPayFeeEM.setfee(Float.valueOf(txtFeepaid.getText()));
        _objPayFeeEM.setFeePayDate(txtPayDate.getText());
        _objPayFeeEM.setDescription(txtDescription.getText());
        _objPayFeeEM.setstatus(true);
        _objPayFee.payFee(_objPayFeeEM);
        JOptionPane.showMessageDialog(rootPane, "Course Fee Paid Success Fully");
        balanceAmount();
        }
     
     }
    }//GEN-LAST:event_jButton1ActionPerformed
    void balanceAmount()
    {
     float tfee=Float.valueOf(lblTotalAmount.getText());
     float tPaid=Float.valueOf(lblPaidAmount.getText());
     float balance=tfee-tPaid;
     lblBalanceAmount.setText(String.valueOf(balance));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PayFee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PayFee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PayFee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PayFee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PayFee().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbCourseName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBalanceAmount;
    private javax.swing.JLabel lblPaidAmount;
    private javax.swing.JLabel lblTotalAmount;
    private javax.swing.JTable tbladmissiondata2;
    private javax.swing.JTable tblfeeDetail;
    private javax.swing.JTextField txtAdmissionId;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtFeepaid;
    private javax.swing.JFormattedTextField txtPayDate;
    // End of variables declaration//GEN-END:variables
}
