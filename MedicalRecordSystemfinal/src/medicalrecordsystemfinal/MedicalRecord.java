/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicalrecordsystemfinal;

/**
 *
 * @author Anton Joseph Cruz
 */
public class MedicalRecord {
    private int medicalRecordID;
    private int patientID;
    private String treatment;
    private String diagnosis;
    private int prescriptionID;
    
    public MedicalRecord() {
        
    }

    public MedicalRecord(int medicalRecordID, int patientID, String treatment, String diagnosis, int prescriptionID) {
        this.medicalRecordID = medicalRecordID;
        this.patientID = patientID;
        this.treatment = treatment;
        this.diagnosis = diagnosis;
        this.prescriptionID = prescriptionID;
    }
    
    public int getPatientID() {
        return patientID;
    }

    public String getTreatment() {
        return treatment;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public int getPrescriptionID() {
        return prescriptionID;
    }
    
    public int getMedicalRecordID() {
        return medicalRecordID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setPrescriptionID(int prescriptionID) {
        this.prescriptionID = prescriptionID;
    }

    public void setMedicalRecordID(int medicalRecordID) {
        this.medicalRecordID = medicalRecordID;
    }
}
