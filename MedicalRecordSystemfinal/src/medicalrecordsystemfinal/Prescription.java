/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicalrecordsystemfinal;

/**
 *
 * @author Anton Joseph Cruz
 */
public class Prescription {
    private int prescriptionID;
    private int medicineID;
    private int medicalRecordID;
    private int quantity;
    
    public Prescription(){
        
    }
    
    public Prescription(int medicineID, int medicalRecordID, int quantity) { // auto-increment ang prescriptionID sa database
        this.medicineID = medicineID;
        this.medicalRecordID = medicalRecordID;
        this.quantity = quantity;
    }
    
    public Prescription(int medicineID) {
        this.medicineID = medicineID;
    }

    public Prescription(int prescriptionID, int medicineID, int medicalRecordID, int quantity) {
        this.prescriptionID = prescriptionID;
        this.medicineID = medicineID;
        this.medicalRecordID = medicalRecordID;
        this.quantity = quantity;
    }

    public int getPrescriptionID() {
        return prescriptionID;
    }

    public int getMedicineID() {
        return medicineID;
    }

    public int getMedicalRecordID() {
        return medicalRecordID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrescriptionID(int prescriptionID) {
        this.prescriptionID = prescriptionID;
    }

    public void setMedicineID(int medicineID) {
        this.medicineID = medicineID;
    }
    
    public void setMedicalRecordID(int medicalRecordID) {
        this.medicalRecordID = medicalRecordID;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
