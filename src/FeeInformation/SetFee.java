/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FeeInformation;

import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pankaj kumar
 */
public class SetFee extends javax.swing.JFrame {

    /**
     * Creates new form SetFee
     */
    public SetFee() {
        initComponents();
        try
        {
        displayCourseSub();
        displayCourseFee();
        }
        catch(Exception ex)
        {
            
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
       cmbCourse.addItem(_objCourSubjectEM.getResultSet().getString(2));
         
       }
      //cmbCourse.addItem(vstring);
       
      
     _objCourSubjectEM.getcon().close();
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

        jLabel1 = new javax.swing.JLabel();
        cmbCourse = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cmbYear = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtFee = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Course ");

        cmbCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCourseActionPerformed(evt);
            }
        });

        jLabel2.setText("Year");

        cmbYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "I", "II", "III", "IV", " " }));

        jLabel3.setText("Description");

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        jButton1.setText("Set Fee");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Close");

        jTable1.setBackground(new java.awt.Color(204, 204, 255));
        jTable1.setForeground(new java.awt.Color(204, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "FeeId", "CourseId", "CourseName", "ForYear", "Fee", "Description"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jLabel4.setText("Fee");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(52, 52, 52))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(21, 21, 21))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbYear, 0, 242, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1)
                                    .addComponent(cmbCourse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtFee))))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 FeeInformationBO.PayFeeEM _objPayFeeEM=new FeeInformationBO.PayFeeEM();
 FeeInformationBO.PayFee _objPayFee=new FeeInformationBO.PayFee();
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        _objPayFeeEM.setFeeid(0);
        _objPayFeeEM.setcourseId(courseId);
        _objPayFeeEM.setforYear(cmbYear.getSelectedItem().toString());
        _objPayFeeEM.setfee(Float.valueOf(txtFee.getText()));
        _objPayFeeEM.setDescription(txtDescription.getText());
        _objPayFeeEM.setstatus(true);
        _objPayFee.addFee(_objPayFeeEM);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCourseActionPerformed
        try
        {
        getCourseSubID();
        }
        catch(Exception ex)
        {
            
        }
    }//GEN-LAST:event_cmbCourseActionPerformed
 public void getCourseSubID() throws SQLException
   {
      
    try
      {
        
          _objPayFeeEM.setcourseName(cmbCourse.getSelectedItem().toString());
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
   int r=0;
   static Vector<Vector<String>> data = new Vector<Vector<String>>();

    public void displayCourseFee() throws SQLException
   {
      
    try
      {
         data.clear();
          
          _objPayFee.getFee(_objPayFeeEM);
        Vector<String> columnNames = new Vector<String>();
        columnNames.add("FeeId");
        columnNames.add("CourseId");
        columnNames.add("CourseName");
        columnNames.add("ForYear");
        columnNames.add("Fee");
        columnNames.add("Description");
       while(_objPayFeeEM.getResultSet().next())
       {
      Vector<String> vstring = new Vector<String>();
        vstring.add(_objPayFeeEM.getResultSet().getString(1));
         vstring.add(_objPayFeeEM.getResultSet().getString(2));
          vstring.add(_objPayFeeEM.getResultSet().getString(3));
          vstring.add(_objPayFeeEM.getResultSet().getString(4));
         vstring.add(_objPayFeeEM.getResultSet().getString(5));
          vstring.add(_objPayFeeEM.getResultSet().getString(6));
         
           data.add(vstring);
       }
       
      DefaultTableModel model = new DefaultTableModel(data, columnNames);
        jTable1.setModel(model);
       
     _objPayFeeEM.getcon().close();
      }
      
      catch(Exception ex)
      {
         ex.printStackTrace();
      }   
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
            java.util.logging.Logger.getLogger(SetFee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetFee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetFee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetFee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetFee().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbCourse;
    private javax.swing.JComboBox cmbYear;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtFee;
    // End of variables declaration//GEN-END:variables
}