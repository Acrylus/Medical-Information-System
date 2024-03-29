/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package medicalrecordsystemfinal;

import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
/**
 *
 * @author Anton Joseph Cruz
 */
public class MRSRegister extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    
    Connect con;
    User u;
    Font font;
    
    public MRSRegister() {
        initComponents();
        u = new User();
        con = new Connect();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnBacktoLogin = new javax.swing.JButton();
        FirstnameTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        LastnameTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        UsertypeTF = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        EmailTF = new javax.swing.JTextField();
        UsernameTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PasswordTF = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnBacktoLogin.setBackground(new java.awt.Color(255, 51, 51));
        btnBacktoLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnBacktoLogin.setText("←Back to Login");
        btnBacktoLogin.setBorder(null);
        btnBacktoLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBacktoLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBacktoLoginMouseExited(evt);
            }
        });
        btnBacktoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBacktoLoginActionPerformed(evt);
            }
        });

        FirstnameTF.setBackground(new java.awt.Color(244, 191, 191));
        FirstnameTF.setForeground(new java.awt.Color(0, 0, 0));
        FirstnameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstnameTFActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Lastname:");

        LastnameTF.setBackground(new java.awt.Color(244, 191, 191));
        LastnameTF.setForeground(new java.awt.Color(0, 0, 0));
        LastnameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastnameTFActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Type:");

        UsertypeTF.setBackground(new java.awt.Color(244, 191, 191));
        UsertypeTF.setForeground(new java.awt.Color(0, 0, 0));
        UsertypeTF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doctor", "Nurse", "Patient", "Receptionist" }));
        UsertypeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsertypeTFActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Swis721 Ex BT", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTER");

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Register");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Username:");

        EmailTF.setBackground(new java.awt.Color(244, 191, 191));
        EmailTF.setForeground(new java.awt.Color(0, 0, 0));
        EmailTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTFActionPerformed(evt);
            }
        });

        UsernameTF.setBackground(new java.awt.Color(244, 191, 191));
        UsernameTF.setForeground(new java.awt.Color(0, 0, 0));
        UsernameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTFActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Email:");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Password:");

        PasswordTF.setBackground(new java.awt.Color(244, 191, 191));
        PasswordTF.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Firstname:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnBacktoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(667, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(285, 285, 285)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(UsertypeTF, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(EmailTF)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(UsernameTF)
                                    .addComponent(PasswordTF)
                                    .addComponent(FirstnameTF)
                                    .addComponent(LastnameTF)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 289, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnBacktoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(440, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel2)
                    .addGap(4, 4, 4)
                    .addComponent(UsernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel3)
                    .addGap(4, 4, 4)
                    .addComponent(PasswordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel4)
                    .addGap(4, 4, 4)
                    .addComponent(FirstnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel5)
                    .addGap(4, 4, 4)
                    .addComponent(LastnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel7)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(EmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel6)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(UsertypeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(31, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        setBounds(0, 0, 814, 507);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBacktoLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBacktoLoginMouseEntered
        // TODO add your handling code here:
        font = btnBacktoLogin.getFont();
        Map att = font.getAttributes();
        att.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        btnBacktoLogin.setFont(font.deriveFont(att));
    }//GEN-LAST:event_btnBacktoLoginMouseEntered

    private void btnBacktoLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBacktoLoginMouseExited
        // TODO add your handling code here:
        btnBacktoLogin.setFont(font);
    }//GEN-LAST:event_btnBacktoLoginMouseExited

    private void btnBacktoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBacktoLoginActionPerformed
        // TODO add your handling code here:
        MRSLogin login = new MRSLogin();
        login.show();
        this.dispose();
    }//GEN-LAST:event_btnBacktoLoginActionPerformed

    private void FirstnameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstnameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstnameTFActionPerformed

    private void LastnameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastnameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastnameTFActionPerformed

    private void UsertypeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsertypeTFActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_UsertypeTFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        User user = null;
        
        String username = UsernameTF.getText();
        String password = String.valueOf(PasswordTF.getPassword());
        String firstname = FirstnameTF.getText();
        String lastname = LastnameTF.getText();
        String email = EmailTF.getText();
        String userType = (String) UsertypeTF.getSelectedItem();

        
        if (username.isEmpty() || password.isEmpty() || firstname.isEmpty() || lastname.isEmpty() || email.isEmpty() || userType.isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields are required. Please fill in all fields.");
        }
        else {
            user = new User(username, password, firstname, lastname, email, userType);
            MRSProof proof;
            if (con.uniqueUsername(username) == true) {
                if (userType.equals("Doctor") || userType.equals("Nurse")) {
                    proof = new MRSProof(user);
                    proof.show();
                } else {
                    int response;
                    int id = 0;
                    response = JOptionPane.showConfirmDialog(null, "Are you currently a registered patient in the hospital?");
                    if (response == JOptionPane.YES_OPTION) {
                        while (!con.checkPatientID(id)) {
                            id = Integer.parseInt(JOptionPane.showInputDialog("Enter Patient ID"));
                            if (con.checkPatientID(id)) {
                                break;
                            }
                            JOptionPane.showMessageDialog(null, "Patient ID does not exist");                 
                        }
                    }
                    else if (response == JOptionPane.CANCEL_OPTION ){
                        return;
                    }
                    Patient pat = new Patient(id, username, password, firstname, lastname, email, userType);
                    con.registerPatient(pat);
                    JOptionPane.showMessageDialog(null, "Successfully registered as patient");
                }
                UsernameTF.setText("");
                PasswordTF.setText("");
                FirstnameTF.setText("");
                LastnameTF.setText("");
                EmailTF.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Username already existing");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void EmailTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTFActionPerformed

    private void UsernameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTFActionPerformed
        
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
            java.util.logging.Logger.getLogger(MRSRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MRSRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MRSRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MRSRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MRSRegister().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmailTF;
    private javax.swing.JTextField FirstnameTF;
    private javax.swing.JTextField LastnameTF;
    private javax.swing.JPasswordField PasswordTF;
    private javax.swing.JTextField UsernameTF;
    private javax.swing.JComboBox<String> UsertypeTF;
    private javax.swing.JButton btnBacktoLogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
