/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package result_management_portal.Admin;

import result_management_portal.Admin.addResult;
import result_management_portal.Admin.Edit;
import java.sql.*;

import javax.swing.JOptionPane;

/**
 *
 * @author suji
 */
public class adminIndex extends javax.swing.JFrame {

    /**
     * Creates new form adminIndex
     */
    public adminIndex() {
        initComponents();
        setTitle("Student Result Management System");
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
        save_data = new javax.swing.JButton();
        course = new javax.swing.JComboBox<>();
        department = new javax.swing.JComboBox<>();
        rollNumber = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        fatherName = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        add_student = new javax.swing.JButton();
        add_result = new javax.swing.JButton();
        all_students = new javax.swing.JButton();
        all_result = new javax.swing.JButton();
        log_out = new javax.swing.JButton();
        edit_result = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Course");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 34, 79, -1));

        jLabel2.setText("Department");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 91, 79, -1));

        jLabel3.setText("Roll Number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 156, 79, -1));

        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 215, 79, -1));

        jLabel5.setText("Gender");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 273, 79, -1));

        jLabel6.setText("Father Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 335, 79, -1));

        save_data.setText("Save");
        save_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_dataActionPerformed(evt);
            }
        });
        getContentPane().add(save_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, -1, -1));

        course.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B.Tech", "M.Tech", "MBA", "MSC", " " }));
        course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseActionPerformed(evt);
            }
        });
        getContentPane().add(course, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 31, -1, -1));

        department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mechanical", "Civil", "Aeronautical", "Computer Science" }));
        getContentPane().add(department, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 88, -1, -1));

        rollNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollNumberActionPerformed(evt);
            }
        });
        getContentPane().add(rollNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 153, 130, -1));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 212, 130, -1));
        getContentPane().add(fatherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 332, 130, -1));

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 270, 130, -1));

        jPanel1.setBackground(new java.awt.Color(51, 255, 153));

        add_student.setBackground(new java.awt.Color(204, 51, 255));
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

    private void courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseActionPerformed

    private void save_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_dataActionPerformed
        // TODO add your handling code here:
       String courseName=(String)course.getSelectedItem();
       String dept=(String)department.getSelectedItem();
       String roll=rollNumber.getText();
       String studentName=name.getText();
       String gend=(String)gender.getSelectedItem();
       String father_name=fatherName.getText();
       try
       {
         
           String url="jdbc:mysql://localhost:3306/srms2";
           String username="root";
           String password="Prakash@4064";
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con=DriverManager.getConnection(url,username,password);
           Statement st=con.createStatement();
           String query="insert into student(RollNumber,Name,Father,Gender,Course,Department) values('"+ roll+"','"+ studentName+"','"+ father_name+"','"+ gend+"','"+ courseName+"','"+ dept+"') ";
           st.executeUpdate(query);
           JOptionPane.showMessageDialog(null,"data saved successfully");
           setVisible(false);
           new adminIndex().setVisible(true);
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,e.toString());
       }
    }//GEN-LAST:event_save_dataActionPerformed

    private void rollNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rollNumberActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

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
            java.util.logging.Logger.getLogger(adminIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminIndex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_result;
    private javax.swing.JButton add_student;
    private javax.swing.JButton all_result;
    private javax.swing.JButton all_students;
    private javax.swing.JComboBox<String> course;
    private javax.swing.JComboBox<String> department;
    private javax.swing.JButton edit_result;
    private javax.swing.JTextField fatherName;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton log_out;
    private javax.swing.JTextField name;
    private javax.swing.JTextField rollNumber;
    private javax.swing.JButton save_data;
    // End of variables declaration//GEN-END:variables
}
