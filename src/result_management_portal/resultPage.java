/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package result_management_portal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author praka
 */
public class resultPage extends javax.swing.JFrame {

    /**
     * Creates new form resultPage
     */
    public resultPage() {
        initComponents();
        setTitle("Student Result Management System");
    }
    public resultPage(String roll) {
        initComponents();
        jTextField4.setText(roll);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Subject Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Total Marks");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 90, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Passing Marks");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 90, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Marks Obtained");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        jLabel12.setText("30");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 43, -1));

        jLabel13.setText("100");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 43, -1));

        jLabel14.setText("Physics");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 43, -1));

        jLabel15.setText("Maths");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 43, -1));

        jLabel16.setText("100");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 43, -1));

        jLabel17.setText("30");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 43, -1));

        jLabel18.setText("EM");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 43, -1));

        jLabel19.setText("100");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 43, -1));

        jLabel20.setText("30");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 43, -1));

        jLabel21.setText("DBMS");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 43, -1));

        jLabel22.setText("100");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 43, -1));

        jLabel23.setText("30");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 43, -1));

        jLabel24.setText("OS");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 43, -1));

        jLabel25.setText("100");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 43, -1));

        jLabel26.setText("30");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 43, 30));

        jTextField7.setEditable(false);
        jTextField7.setText("jTextField7");
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 100, 30));

        jTextField8.setEditable(false);
        jTextField8.setText("jTextField8");
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 100, 30));

        jTextField9.setEditable(false);
        jTextField9.setText("jTextField9");
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 100, 30));

        jTextField10.setEditable(false);
        jTextField10.setText("jTextField10");
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 100, 30));

        jTextField11.setEditable(false);
        jTextField11.setText("jTextField11");
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 100, 30));

        jLabel11.setText("Total");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 61, 30));
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 100, 30));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 700, 330));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Roll Number");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 29, 93, 26));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Course");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 73, 93, 29));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Branch");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 119, 93, 33));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 29, 93, 26));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Father Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 71, 93, 33));

        jTextField1.setEditable(false);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 26, 120, 33));

        jTextField2.setEditable(false);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 71, 120, 33));

        jTextField3.setEditable(false);
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 119, 120, 33));

        jTextField4.setEditable(false);
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 26, 119, 33));

        jTextField5.setEditable(false);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 71, 119, 33));

        jTextField6.setEditable(false);
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 119, 119, 33));

        jPanel2.setBackground(new java.awt.Color(153, 255, 102));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Gender");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(385, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(222, 222, 222))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        String rollno=jTextField4.getText();
           try
        {
           String url="jdbc:mysql://localhost:3306/srms";
           String username="root";
           String password="Prakash@4064";
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con=DriverManager.getConnection(url,username,password);
           Statement st=con.createStatement();
           ResultSet rs=st.executeQuery("select *from student inner join result where student.rollno='"+ rollno+"'and result.rollno='"+ rollno+"'");
           if(rs.next())
           {
               jTextField1.setText(rs.getString(3));
               jTextField2.setText(rs.getString(2));
               jTextField3.setText(rs.getString(4));
               jTextField5.setText(rs.getString(6));
               jTextField6.setText(rs.getString(5));
               jTextField7.setText(rs.getString(8));
               jTextField8.setText(rs.getString(9));
               jTextField9.setText(rs.getString(10));
               jTextField10.setText(rs.getString(11));
               jTextField11.setText(rs.getString(12));
               int s1=Integer.parseInt(jTextField7.getText());
               int s2=Integer.parseInt(jTextField8.getText());
               int s3=Integer.parseInt(jTextField9.getText());
               int s4=Integer.parseInt(jTextField10.getText());
               int s5=Integer.parseInt(jTextField11.getText());
               String totalMarks= String.valueOf(s1+s2+s3+s4+s5);
               jTextField12.setText(totalMarks);
           }
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,e.toString());
       }
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new studentAdmin().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(resultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resultPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
