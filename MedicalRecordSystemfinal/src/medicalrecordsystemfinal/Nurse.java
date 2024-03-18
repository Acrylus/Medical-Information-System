/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicalrecordsystemfinal;

/**
 *
 * @author Anton Joseph Cruz
 */
public class Nurse extends User {
    private String department;
    
    public Nurse (String department, String username, String password, String firstname, String lastname, String email, String userType) {
        super(username, password, firstname, lastname, email, userType);
        this.department = department;
    }
    
    public Nurse(){
        
    }

    @Override
    public void setUserType(String userType) {
        super.setUserType(userType); 
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public void setLastname(String lastname) {
        super.setLastname(lastname);
    }

    @Override
    public void setFirstname(String firstname) {
        super.setFirstname(firstname);
    }

    @Override
    public void setPassword(String password) {
        super.setPassword(password);
    }

    @Override
    public void setUsername(String username) {
        super.setUsername(username);
    }

    @Override
    public String getUserType() {
        return super.getUserType();
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public String getLastname() {
        return super.getLastname();
    }

    @Override
    public String getFirstname() {
        return super.getFirstname();
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public String getUsername() {
        return super.getUsername();
    }
    
    

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
}
