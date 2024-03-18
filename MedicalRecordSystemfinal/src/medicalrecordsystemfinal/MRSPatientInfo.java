/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package medicalrecordsystemfinal;

import javax.swing.JOptionPane;

/**
 *
 * @author Anton Joseph Cruz
 */
public class MRSPatientInfo extends javax.swing.JFrame {
    Connect con;
    User u;
    int patientID;
    int status;
    /**
     * Creates new form MRSPatientInfo
     */
    public MRSPatientInfo() {
        initComponents();
    }
    
    public MRSPatientInfo(User user, int patientID) {
        initComponents();
        
        setLocationRelativeTo(null);
        
        con = new Connect();
        u = user;
        this.patientID = patientID;
        
        PatientInfo mrs = con.getPatientInfo(patientID);
        
        patientIDL.setText(String.format("%d", mrs.getId()));
        patientNameL.setText(mrs.getName());
        patientBirthL.setText(mrs.getBirth());
        patientAddressL.setText(mrs.getAddress());
        patientPhoneL.setText(mrs.getPhone());
        patientDoctorL.setText(mrs.getDoctor());
        patientNurseL.setText(mrs.getNurse());
        
        status = con.getPatientStatus(patientID);
        displayStatus();
        
        if (user.getUserType().equals("Doctor") || user.getUserType().equals("Nurse")) {
            doctorB.setVisible(false);
            nurseB.setVisible(false);
            medicineB.setVisible(false);
            backB.setText("Back");
            cbStatus.setEnabled(true);
        }
    }
    
    private void displayStatus() {
        if (status == 1) {
            cbStatus.setSelectedItem("Treated");
        } else {
            cbStatus.setSelectedItem("On Treatment");
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

        jPanel1 = new javax.swing.JPanel();
        backB = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        MedicalRecordB = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        patientIDL = new javax.swing.JLabel();
        patientNameL = new javax.swing.JLabel();
        TitleL = new javax.swing.JLabel();
        patientBirthL = new javax.swing.JLabel();
        patientAddressL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        patientPhoneL = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        patientDoctorL = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        patientNurseL = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nurseB = new javax.swing.JButton();
        medicineB = new javax.swing.JButton();
        doctorB = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cbStatus = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        backB.setBackground(new java.awt.Color(255, 51, 51));
        backB.setForeground(new java.awt.Color(255, 255, 255));
        backB.setText("Logout");
        backB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Patient Phone      :");

        MedicalRecordB.setBackground(new java.awt.Color(255, 51, 51));
        MedicalRecordB.setForeground(new java.awt.Color(255, 255, 255));
        MedicalRecordB.setText("Medical Record");
        MedicalRecordB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicalRecordBActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Doctor Assigned :");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nurse Assigned   :");

        patientIDL.setForeground(new java.awt.Color(0, 0, 0));
        patientIDL.setText("...");

        patientNameL.setForeground(new java.awt.Color(0, 0, 0));
        patientNameL.setText("...");

        TitleL.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        TitleL.setForeground(new java.awt.Color(0, 0, 0));
        TitleL.setText("PATIENT INFORMATION");

        patientBirthL.setForeground(new java.awt.Color(0, 0, 0));
        patientBirthL.setText("...");

        patientAddressL.setForeground(new java.awt.Color(0, 0, 0));
        patientAddressL.setText("...");

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Patient ID             :");

        patientPhoneL.setForeground(new java.awt.Color(0, 0, 0));
        patientPhoneL.setText("...");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Patient Name       :");

        patientDoctorL.setForeground(new java.awt.Color(0, 0, 0));
        patientDoctorL.setText("...");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Patient Birth         :");

        patientNurseL.setForeground(new java.awt.Color(0, 0, 0));
        patientNurseL.setText("...");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Patient Address   :");

        nurseB.setBackground(new java.awt.Color(255, 51, 51));
        nurseB.setForeground(new java.awt.Color(255, 255, 255));
        nurseB.setText("Nurse List");
        nurseB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nurseBActionPerformed(evt);
            }
        });

        medicineB.setBackground(new java.awt.Color(255, 51, 51));
        medicineB.setForeground(new java.awt.Color(255, 255, 255));
        medicineB.setText("Medicine Records");
        medicineB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicineBActionPerformed(evt);
            }
        });

        doctorB.setBackground(new java.awt.Color(255, 51, 51));
        doctorB.setForeground(new java.awt.Color(255, 255, 255));
        doctorB.setText("Doctor List");
        doctorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorBActionPerformed(evt);
            }
        });

        jLabel8.setText("Current Status     :");

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "On Treatment", "Treated" }));
        cbStatus.setEnabled(false);
        cbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(TitleL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(patientBirthL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(patientNameL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(patientIDL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(patientAddressL, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(patientNurseL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(patientDoctorL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(patientPhoneL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(backB, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(doctorB)
                                .addGap(18, 18, 18)
                                .addComponent(nurseB)
                                .addGap(18, 18, 18)
                                .addComponent(medicineB)
                                .addGap(18, 18, 18)
                                .addComponent(MedicalRecordB, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(TitleL))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(patientIDL))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(patientNameL))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(patientBirthL))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(patientAddressL))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(patientPhoneL))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(patientDoctorL))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(patientNurseL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backB)
                    .addComponent(MedicalRecordB)
                    .addComponent(medicineB)
                    .addComponent(nurseB)
                    .addComponent(doctorB))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MedicalRecordBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicalRecordBActionPerformed
        // TODO add your handling code here:
        MRSMedicalRecordList mrs = new MRSMedicalRecordList(u, patientID);
        mrs.show();
        this.dispose();
    }//GEN-LAST:event_MedicalRecordBActionPerformed

    private void backBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBActionPerformed
        // TODO add your handling code here:
        if (u.getUserType().equals("Patient")) {
            MRSLogin login = new MRSLogin();
            login.show();
            this.dispose();
        } else {
            MRSMain mrs = new MRSMain(u);
            mrs.show();
            this.dispose();
        }
    }//GEN-LAST:event_backBActionPerformed

    private void doctorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorBActionPerformed
        // TODO add your handling code here:
        MRSDoctors mrs = new MRSDoctors(u);
        mrs.show();
        this.dispose();
    }//GEN-LAST:event_doctorBActionPerformed

    private void nurseBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nurseBActionPerformed
        // TODO add your handling code here:
        MRSNurse mrs = new MRSNurse(u);
        mrs.show();
        this.dispose();
    }//GEN-LAST:event_nurseBActionPerformed

    private void medicineBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineBActionPerformed
        // TODO add your handling code here:
        MRSMedicineRecords mrs = new MRSMedicineRecords(u);
        mrs.show();
        this.dispose();
    }//GEN-LAST:event_medicineBActionPerformed

    private void cbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStatusActionPerformed
        // TODO add your handling code here:
        if ((cbStatus.getSelectedItem().equals("On Treatment") && status == 1) || (cbStatus.getSelectedItem().equals("Treated") && status == 0)) {
            if (JOptionPane.showConfirmDialog(null,"Confirm change of status?") == JOptionPane.YES_OPTION) {
                if (status == 1) {
                    status = 0;
                } else {
                    status = 1;
                }
                con.changeMedicalStatus(patientID, status);
            }
        } 
        displayStatus();
    }//GEN-LAST:event_cbStatusActionPerformed

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
            java.util.logging.Logger.getLogger(MRSPatientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MRSPatientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MRSPatientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MRSPatientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MRSPatientInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MedicalRecordB;
    private javax.swing.JLabel TitleL;
    private javax.swing.JButton backB;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JButton doctorB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton medicineB;
    private javax.swing.JButton nurseB;
    private javax.swing.JLabel patientAddressL;
    private javax.swing.JLabel patientBirthL;
    private javax.swing.JLabel patientDoctorL;
    private javax.swing.JLabel patientIDL;
    private javax.swing.JLabel patientNameL;
    private javax.swing.JLabel patientNurseL;
    private javax.swing.JLabel patientPhoneL;
    // End of variables declaration//GEN-END:variables
}