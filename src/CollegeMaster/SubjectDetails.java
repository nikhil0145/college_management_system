/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CollegeMaster;

import static CollegeMaster.CourseDetails.data;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pankaj kumar
 */
public class SubjectDetails extends javax.swing.JFrame {

    /**
     * Creates new form SubjectDetails
     */
    public SubjectDetails() {
        initComponents();
         try
        {
        displaySubject();    
        }
        catch(Exception ex)
        {
            
        }
    }
    SubjectBO.AddSubject _objAddSubject=new SubjectBO.AddSubject();
    SubjectBO.AddSubjectEM _objAddSubjectEM=new SubjectBO.AddSubjectEM();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    int r=0;
   static Vector<Vector<String>> data = new Vector<Vector<String>>();

    public void displaySubject() throws SQLException
   {
      
    try
      {
         data.clear();
          
          _objAddSubject.fetchSubject(_objAddSubjectEM);
        Vector<String> columnNames = new Vector<String>();
        columnNames.add("SubjectId");
        columnNames.add("SubjectName");
        columnNames.add("Description");
        columnNames.add("Status");
       while(_objAddSubjectEM.getResultSet().next())
       {
      Vector<String> vstring = new Vector<String>();
        vstring.add(_objAddSubjectEM.getResultSet().getString(1));
         vstring.add(_objAddSubjectEM.getResultSet().getString(2));
          vstring.add(_objAddSubjectEM.getResultSet().getString(3));
          if(_objAddSubjectEM.getResultSet().getString(4).equals("1"))
          {
           vstring.add("True");
          }
          else
          {
            vstring.add("False");  
          }
           data.add(vstring);
       }
       
      DefaultTableModel model = new DefaultTableModel(data, columnNames);
        jTable1.setModel(model);
       
     _objAddSubjectEM.getcon().close();
      }
      
      catch(Exception ex)
      {
         ex.printStackTrace();
      }   
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
                "SubjectID", "SubjectName", "Description", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SubjectDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubjectDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubjectDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubjectDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubjectDetails().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}