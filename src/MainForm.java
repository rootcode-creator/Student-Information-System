

import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author DDUS
 */
public class MainForm extends javax.swing.JFrame {

    
    public MainForm() {
        initComponents();
        Seticon();
    }

    
     private void Seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Programme icon2.png")));

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_Username = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTotalCources = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTotal_Students = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        AddStudent = new javax.swing.JMenuItem();
        ManageStudent = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        AddCourse = new javax.swing.JMenuItem();
        ManageCourse = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel_Username.setBackground(new java.awt.Color(102, 102, 102));
        jLabel_Username.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Username.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_Username.setText("Welcome ");

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));

        jTotalCources.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTotalCources.setForeground(new java.awt.Color(255, 255, 255));
        jTotalCources.setText("    Total Course ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jTotalCources)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jTotalCources)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(102, 0, 204));

        jTotal_Students.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTotal_Students.setForeground(new java.awt.Color(255, 255, 255));
        jTotal_Students.setText("    Total Students ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jTotal_Students)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jTotal_Students)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_Username)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 316, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel_Username)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(111, 111, 111))
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 255));
        jMenuBar1.setForeground(new java.awt.Color(51, 51, 51));

        jMenu3.setForeground(new java.awt.Color(51, 51, 51));
        jMenu3.setText("Student");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        AddStudent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddStudent.setForeground(new java.awt.Color(0, 51, 51));
        AddStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Add Student.png"))); // NOI18N
        AddStudent.setText(" Add Student");
        AddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStudentActionPerformed(evt);
            }
        });
        jMenu3.add(AddStudent);

        ManageStudent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ManageStudent.setForeground(new java.awt.Color(0, 51, 51));
        ManageStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Student Update.png"))); // NOI18N
        ManageStudent.setText("Manage Student");
        ManageStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageStudentActionPerformed(evt);
            }
        });
        jMenu3.add(ManageStudent);

        jMenuBar1.add(jMenu3);

        jMenu1.setForeground(new java.awt.Color(0, 51, 51));
        jMenu1.setText("Course");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        AddCourse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Course Add.png"))); // NOI18N
        AddCourse.setText("Add Course");
        AddCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCourseActionPerformed(evt);
            }
        });
        jMenu1.add(AddCourse);

        ManageCourse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ManageCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Manage course.png"))); // NOI18N
        ManageCourse.setText("Manage Course");
        ManageCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageCourseActionPerformed(evt);
            }
        });
        jMenu1.add(ManageCourse);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(51, 51, 51));
        jMenu2.setText("Score");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStudentActionPerformed
        
                                     AddStudentRecord AR = new AddStudentRecord();
                                     
                                     AR.setVisible(true);
                                     
                                     AR.pack();
                                     
                                     AR.setLocationRelativeTo(null);
                                     
                                  
                                     
                                     
                                     
    }//GEN-LAST:event_AddStudentActionPerformed

    private void ManageStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageStudentActionPerformed
        
       
        ManageStudentRecord MS = new ManageStudentRecord();
                                     
        MS.setVisible(true);
                                     
        MS.pack();
                                     
        
                                     
        
    }//GEN-LAST:event_ManageStudentActionPerformed

    private void AddCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCourseActionPerformed
                                
                                   AddCourse AC = new AddCourse();
                                     
                                     AC.setVisible(true);
                                     
                                     AC.pack();
                                     
                                     AC.setLocationRelativeTo(null);
                                     
                                          
    }//GEN-LAST:event_AddCourseActionPerformed

    private void ManageCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageCourseActionPerformed
                                     
        
                                     ManageCourse MC = new ManageCourse();
                                     
                                     MC.setVisible(true);
                                     
                                     MC.pack();
                                     
                                     MC.setLocationRelativeTo(null);
                                     
    }//GEN-LAST:event_ManageCourseActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AddCourse;
    private javax.swing.JMenuItem AddStudent;
    private javax.swing.JMenuItem ManageCourse;
    private javax.swing.JMenuItem ManageStudent;
    public static javax.swing.JLabel jLabel_Username;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JLabel jTotalCources;
    public static javax.swing.JLabel jTotal_Students;
    // End of variables declaration//GEN-END:variables
}
