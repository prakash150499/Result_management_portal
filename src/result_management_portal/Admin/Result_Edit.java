/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package result_management_portal.Admin;

import result_management_portal.Admin.Edit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author praka
 */
public class Result_Edit extends javax.swing.JFrame {

    /**
     * Creates new form Result_Edit
     */
    public Result_Edit() {
        initComponents();
    }
     public Result_Edit(String roll) {
        initComponents();
         jTextField1.setText(roll);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        add_student = new javax.swing.JButton();
        add_result = new javax.swing.JButton();
        all_students = new javax.swing.JButton();
        all_result = new javax.swing.JButton();
        log_out = new javax.swing.JButton();
        edit_result = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Subject 1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 104, 149, 29));

        jLabel2.setText("Roll Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 37, 149, 29));

        jLabel3.setText("Subject 3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 227, 149, 29));

        jLabel4.setText("Subject 2");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 164, 149, 29));

        jLabel5.setText("Subject 5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 361, 149, 29));

        jLabel6.setText("Subject 4");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 296, 149, 29));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 164, 127, 29));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 104, 127, 29));

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 37, 127, 29));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 296, 127, 29));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 227, 127, 29));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 361, 127, 29));

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setText("Update");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 429, 127, 33));

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Back");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 429, 97, 33));

        jPanel1.setBackground(new java.awt.Color(51, 255, 153));

        add_student.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_student.setText("Add New Student");
        add_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_studentActionPerformed(evt);
            }
        });

        add_result.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_result.setText("Add New Result");
        add_result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_resultActionPerformed(evt);
            }
        });

        all_students.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        all_students.setText("Registered Students");
        all_students.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                all_studentsActionPerformed(evt);
            }
        });

        all_result.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        all_result.setText("All Student Result");
        all_result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                all_resultActionPerformed(evt);
            }
        });

        log_out.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        log_out.setText("Log Out");
        log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_outActionPerformed(evt);
            }
        });

        edit_result.setBackground(new java.awt.Color(204, 51, 255));
        edit_result.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit_result.setText("Edit Result");
        edit_result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_resultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(log_out)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(edit_result, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(all_result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(all_students, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(add_result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add_student, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(add_student)
                .addGap(63, 63, 63)
                .addComponent(add_result)
                .addGap(59, 59, 59)
                .addComponent(all_students)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(all_result)
                .addGap(62, 62, 62)
                .addComponent(edit_result)
                .addGap(35, 35, 35)
                .addComponent(log_out)
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        String rollno=jTextField1.getText();
           try
        {
           String url="jdbc:mysql://localhost:3306/srms2";
           String username="root";
           String password="Prakash@4064";
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con=DriverManager.getConnection(url,username,password);
           Statement st=con.createStatement();
           ResultSet rs=st.executeQuery("select *from result where  result.RollNumber='"+ rollno+"'");
           if(rs.next())
           {
              
               jTextField2.setText(rs.getString(2));
               jTextField3.setText(rs.getString(3));
               jTextField4.setText(rs.getString(4));
               jTextField5.setText(rs.getString(5));
               jTextField6.setText(rs.getString(6));
              
           }
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,e.toString());
       }
        
    }//GEN-LAST:event_formComponentShown

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         String roll=jTextField1.getText();
        String s1=jTextField2.getText();
        String s2=jTextField3.getText();
        String s3=jTextField4.getText();
        String s4=jTextField5.getText();
        String s5=jTextField6.getText();
        try
       {
         
           String url="jdbc:mysql://localhost:3306/srms2";
           String username="root";
           String password="Prakash@4064";
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con=DriverManager.getConnection(url,username,password);
           Statement st=con.createStatement();
           ResultSet rs=st.executeQuery("select *from result where RollNumber='"+roll+"'");
           if(rs.next())
           {
          // String query="insert into result(rollno,physics,maths,em,dbms,os) values('"+ roll+"','"+ s1+"','"+ s2+"','"+ s3+"','"+ s4+"','"+ s5+"') ";
            String query="update result set Subject1='"+s1+"',Subject2='"+s2+"',Subject3='"+s3+"',Subject4='"+s4+"',Subject5='"+s5+"' where result.RollNumber='"+ roll+"'";
           st.executeUpdate(query);
           JOptionPane.showMessageDialog(null,"Marks updated successfully");
           setVisible(false);
           new addResult().setVisible(true);
               
           }
           else
           {
               JOptionPane.showMessageDialog(null,"Roll Number Not Registered");
               setVisible(false);
                new addResult().setVisible(true);
           }
           
          
          
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,e.toString());
       }
        setVisible(false);
        new Edit().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Edit().setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void add_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_studentActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new  adminIndex().setVisible(true);
    }//GEN-LAST:event_add_studentActionPerformed

    private void add_resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_resultActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new  addResult().setVisible(true);
    }//GEN-LAST:event_add_resultActionPerformed

    private void all_studentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_all_studentsActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new  registeredStudents().setVisible(true);
    }//GEN-LAST:event_all_studentsActionPerformed

    private void all_resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_all_resultActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new  allStudents().setVisible(true);
    }//GEN-LAST:event_all_resultActionPerformed

    private void log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_outActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new adminLogin().setVisible(true);
    }//GEN-LAST:event_log_outActionPerformed

    private void edit_resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_resultActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Edit().setVisible(true);
    }//GEN-LAST:event_edit_resultActionPerformed

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
            java.util.logging.Logger.getLogger(Result_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Result_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Result_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Result_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Result_Edit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_result;
    private javax.swing.JButton add_student;
    private javax.swing.JButton all_result;
    private javax.swing.JButton all_students;
    private javax.swing.JButton edit_result;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JButton log_out;
    // End of variables declaration//GEN-END:variables
}
