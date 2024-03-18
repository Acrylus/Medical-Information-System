/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicalrecordsystemfinal;

/**
 *
 * @author Anton Joseph Cruz
 */
public class PrescriptionMedicine {

    public PrescriptionMedicine() {
    }

    public String getGenericName() {
        return genericName;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public PrescriptionMedicine(String genericName, String brand, String dosage) {
        this.genericName = genericName;
        this.brand = brand;
        this.dosage = dosage;
        quantity = 0;
    }

    public PrescriptionMedicine(String genericName, String brand, String dosage, int quantity) {
        this.genericName = genericName;
        this.brand = brand;
        this.dosage = dosage;
        this.quantity = quantity;
    }
    
    private String genericName;
    private String brand;
    private String dosage;
    private int quantity;
}
