/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicalrecordsystemfinal;

/**
 *
 * @author Anton Joseph Cruz
 */
public class PatientInfo {
    private int id;
    private String username;
    private String name;
    private String birth;
    private String address;
    private String phone;
    private String doctor;
    private String nurse;

    public PatientInfo() {
    }

    public PatientInfo(int id, String name, String birth, String address, String phone, String doctor, String nurse) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.address = address;
        this.phone = phone;
        this.doctor = doctor;
        this.nurse = nurse;
    }

    public PatientInfo(int id, String username,String name, String birth, String address, String phone, String doctor, String nurse) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.birth = birth;
        this.address = address;
        this.phone = phone;
        this.doctor = doctor;
        this.nurse = nurse;
    }

    public PatientInfo(String username, String name, String birth, String address, String phone, String doctor, String nurse) {
        this.username = username;
        this.name = name;
        this.birth = birth;
        this.address = address;
        this.phone = phone;
        this.doctor = doctor;
        this.nurse = nurse;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getNurse() {
        return nurse;
    }

    public void setNurse(String nurse) {
        this.nurse = nurse;
    }

    
}
