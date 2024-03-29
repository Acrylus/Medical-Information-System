/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package medicalrecordsystemfinal;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anton Joseph Cruz
 */
public class MRSMedicalRecord extends javax.swing.JFrame {
    DefaultTableModel tbl;
    Connect con;
    User u;
    int patientID;
    /**
     * Creates new form MRSMedicalRecord
     */
    public MRSMedicalRecord() {
        initComponents();
    }
    
    public MRSMedicalRecord(User user, int patientID, int medicalRecordID) {
        initComponents();
        setLocationRelativeTo(null);
        tbl = (DefaultTableModel) PrescriptionT.getModel();
        con = new Connect();
        u = user;
        this.patientID = patientID;    
        lblPatient.setText(Integer.toString(patientID));
        lblMedicalRecordID.setText(Integer.toString(medicalRecordID));
        
        MedicalRecord mrs = con.getMedicalRecord(medicalRecordID);
        diagnosisL.setText(mrs.getDiagnosis());
        treatmentL.setText(mrs.getTreatment());
        int prescriptionID = mrs.getPrescriptionID();
        displayTable(prescriptionID);
    }
    
    public void displayTable(int prescriptionID){
        ArrayList<PrescriptionMedicine> pm = con.getPrescriptionMedicine(prescriptionID);
        for(PrescriptionMedicine p : pm){
            String data[] = {p.getGenericName() + "-" + p.getBrand(), p.getDosage(), Integer.toString(p.getQuantity())};
            tbl.addRow(data);
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
        jLabel3 = new javax.swing.JLabel();
        TitleL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PrescriptionT = new javax.swing.JTable();
        BackB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        diagnosisL = new javax.swing.JLabel();
        treatmentL = new javax.swing.JLabel();
        lblPatient = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblMedicalRecordID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Prescription Medicine     :");

        TitleL.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        TitleL.setForeground(new java.awt.Color(0, 0, 0));
        TitleL.setText("MEDICAL RECORDS");

        PrescriptionT.setBackground(new java.awt.Color(255, 51, 51));
        PrescriptionT.setForeground(new java.awt.Color(255, 255, 255));
        PrescriptionT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine", "Dosage", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PrescriptionT.setSelectionBackground(new java.awt.Color(255, 153, 153));
        jScrollPane1.setViewportView(PrescriptionT);
        if (PrescriptionT.getColumnModel().getColumnCount() > 0) {
            PrescriptionT.getColumnModel().getColumn(0).setResizable(false);
            PrescriptionT.getColumnModel().getColumn(1).setResizable(false);
            PrescriptionT.getColumnModel().getColumn(2).setResizable(false);
        }

        BackB.setBackground(new java.awt.Color(255, 0, 0));
        BackB.setForeground(new java.awt.Color(255, 255, 255));
        BackB.setText("Back");
        BackB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Diagnosis     :");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Treatment    :");

        diagnosisL.setForeground(new java.awt.Color(0, 0, 0));
        diagnosisL.setText("...");
        diagnosisL.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        treatmentL.setForeground(new java.awt.Color(0, 0, 0));
        treatmentL.setText("...");
        treatmentL.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblPatient.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPatient.setForeground(new java.awt.Color(0, 0, 0));
        lblPatient.setText("Patient ID");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Patient ID:");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("MR ID:");

        lblMedicalRecordID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMedicalRecordID.setForeground(new java.awt.Color(0, 0, 0));
        lblMedicalRecordID.setText("MR ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BackB, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diagnosisL, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                            .addComponent(treatmentL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TitleL)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPatient)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMedicalRecordID, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitleL)
                    .addComponent(jLabel4)
                    .addComponent(lblPatient)
                    .addComponent(jLabel5)
                    .addComponent(lblMedicalRecordID))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(diagnosisL, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(treatmentL, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(BackB)
                .addGap(30, 30, 30))
        );

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

    private void BackBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBActionPerformed
        // TODO add your handling code here:
        MRSMedicalRecordList m = new MRSMedicalRecordList(u, patientID);
        m.show();
        this.dispose();
    }//GEN-LAST:event_BackBActionPerformed

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
            java.util.logging.Logger.getLogger(MRSMedicalRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MRSMedicalRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MRSMedicalRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MRSMedicalRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MRSMedicalRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackB;
    private javax.swing.JTable PrescriptionT;
    private javax.swing.JLabel TitleL;
    private javax.swing.JLabel diagnosisL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMedicalRecordID;
    private javax.swing.JLabel lblPatient;
    private javax.swing.JLabel treatmentL;
    // End of variables declaration//GEN-END:variables
}
