/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicalrecordsystemfinal;

/**
 *
 * @author Anton Joseph Cruz
 */
public class Medicine {
    private String medicineID;
    private String genericName;
    private String brand;
    private String dosage;
    
    public Medicine(){
        
    }

    public Medicine(String medicineID, String genericName, String brand, String dosage) {
        this.medicineID = medicineID;
        this.genericName = genericName;
        this.brand = brand;
        this.dosage = dosage;
    }

    public Medicine(String genericName, String brand, String dosage) {
        this.genericName = genericName;
        this.brand = brand;
        this.dosage = dosage;
    }

    public String getMedicineID() {
        return medicineID;
    }

    public String getGenericName() {
        return genericName;
    }

    public String getBrand() {
        return brand;
    }

    public String getDosage() {
        return dosage;
    }

    public void setMedicineID(String medicineID) {
        this.medicineID = medicineID;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
}
