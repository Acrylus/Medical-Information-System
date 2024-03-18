/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicalrecordsystemfinal;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Anton Joseph Cruz
 */
public class Connect {
    Connection con = null;

    public Connect() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/medicalrecordsystemfinal", "root", "");
            //JOptionPane.showMessageDialog(null, "Connected na!");
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    // -------------- HELPER METHODS -------------- //
    public boolean uniqueUsername(String username) {
        Statement s;
        String sql;
        ResultSet r;
        try {
            s = con.createStatement();
            sql = "SELECT * FROM user WHERE username = '" + username + "'";
            r = s.executeQuery(sql);
            if(r.next() == false){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Username already existing.");
        return false;
    }
    
    public int getPatientID(String username) {
        Statement s;
        String sql;
        ResultSet r;
        try {
            s = con.createStatement();
            sql = "SELECT * FROM patientinfo WHERE username = '" + username + "'";
            r = s.executeQuery(sql);
            if (r.next() == true) {
                return r.getInt("patientID");
            }
                 
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public boolean checkPatientID(int id) {
        Statement s;
        String sql;
        ResultSet r;
        try {
            s = con.createStatement();
            sql = "SELECT * FROM patientInfo WHERE patientID = " + id;
            r = s.executeQuery(sql);
            if (r.next() == true)
                 return true;
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public int getPatientStatus(int id) {
        Statement s;
        String sql;
        ResultSet r;
        try {
            s = con.createStatement();
            sql = "SELECT * FROM patientInfo WHERE patientID = " + id;
            r = s.executeQuery(sql);
            if (r.next() == true){
                if (r.getInt("medicalStatus") == 1) {
                    return 1;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    // --------------- HELPER METHODS --------------- //
    
    
    // ---------------- MRSRegister ---------------- //
    /*public FileReader fileStorage(FileReader file){
        Statement s;
        String sql;
        try {
            s = con.createStatement();            
            if(uniqueUsername(user.getUsername())){
                sql = "INSERT INTO user VALUES('" 
                        + user.getUsername() + "', '" 
                        + user.getPassword() + "', '" 
                        + user.getFirstname() + "', '" 
                        + user.getLastname() + "', '" 
                        + user.getEmail() + "', '" 
                        + user.getUserType() + "')";
                s.executeUpdate(sql);
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }*/
    
    public boolean registerUser(User user){
        Statement s;
        String sql;
        try {
            s = con.createStatement();            
            if(uniqueUsername(user.getUsername())){
                sql = "INSERT INTO user VALUES('" 
                        + user.getUsername() + "', '" 
                        + user.getPassword() + "', '" 
                        + user.getFirstname() + "', '" 
                        + user.getLastname() + "', '" 
                        + user.getEmail() + "', '" 
                        + user.getUserType() + "')";
                s.executeUpdate(sql);
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public void registerDoctor(Doctor doc) {
        Statement s;
        String sql;
        ResultSet r;
        int id = 1;
        User user = (User) doc;
        if (registerUser(user)) {
            try {
                s = con.createStatement();
                sql = "SELECT * FROM doctor ORDER BY doctorID DESC";
                r = s.executeQuery(sql);
                if (r.next() == true) {
                    id = r.getInt("doctorID") + 1;
                }
                sql = "INSERT INTO doctor VALUES('" 
                    + doc.getUsername() + "', " 
                    + id + ", '" 
                    + doc.getSpecialty() + "')"; 
                    s.executeUpdate(sql);
            } catch (SQLException ex) {
                Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void registerNurse(Nurse nur) {
        Statement s;
        String sql;
        ResultSet r;
        int id = 1;
        User user = (User) nur;
        if (registerUser(user)) {
            try {
                s = con.createStatement();
                sql = "SELECT * FROM nurse ORDER BY nurseID DESC";
                r = s.executeQuery(sql);
                if (r.next() == true) {
                    id = r.getInt("nurseID") + 1;
                }
                sql = "INSERT INTO nurse VALUES('" 
                    + nur.getUsername() + "', " 
                    + id + ", '" 
                    + nur.getDepartment() + "')"; 
                    s.executeUpdate(sql);
            } catch (SQLException ex) {
                Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void registerPatient(Patient pat) {
        Statement s;
        String sql;
        ResultSet r;
        User user = (Patient) pat;
        if (registerUser(user)) {
            try {
                s = con.createStatement();
                if (pat.getId() == 0) {
                    sql = "INSERT INTO patientinfo (username) VALUES('" 
                    + pat.getUsername() + "')"; 
                    s.executeUpdate(sql);
                } else {
                    sql = "INSERT INTO patientinfo VALUES('" 
                    + pat.getUsername() + "', "
                    + pat.getId() + ")"; 
                    s.executeUpdate(sql);
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    // ---------------- MRSRegister ---------------- //
    
    
    // ----------------- MRSLogin ----------------- //
    public User login(String username, String password){
        Statement s;
        String sql;
        ResultSet r;
        User u = null;
        try {
            s = con.createStatement();
            sql = "SELECT * FROM user WHERE username = '" + username + "' AND password = '" + password + "'";
            r = s.executeQuery(sql);
            if (r.next() == true)
                 u = new User(username, password, r.getString("firstname"), r.getString("lastname"), r.getString("email"), r.getString("userType"));
                return u;
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Incorrect username/password.");
        return null;
    }
    // ----------------- MRSLogin ----------------- //
    
    
    // ----------------- MRSMain ----------------- //
    public ArrayList<PatientInfo> getPatients(String name, String userType, int status) {
        ArrayList<PatientInfo> pat = new ArrayList<PatientInfo>();
        Statement s;
        String sql;
        ResultSet r;
        try {
            s = con.createStatement();
            if (status == 0) {
                if (userType.equals("Doctor")) {
                    sql = "SELECT * FROM patientinfo WHERE doctor = '" + name +  "' AND medicalStatus=0";
                    r = s.executeQuery(sql);
                    while (r.next()) {
                        PatientInfo pi = new PatientInfo(r.getInt("patientID"),
                                            r.getString("username"), 
                                            r.getString("name"), 
                                            r.getString("birthdate"), 
                                            r.getString("address"), 
                                            r.getString("phone"), 
                                            r.getString("doctor"), 
                                            r.getString("nurse"));
                        pat.add(pi);
                    }
                } else {
                    sql = "SELECT * FROM patientinfo WHERE nurse = '" + name +  "' AND medicalStatus=0";
                    r = s.executeQuery(sql);
                    while (r.next()) {
                        PatientInfo pi = new PatientInfo(r.getInt("patientID"),
                                            r.getString("username"), 
                                            r.getString("name"), 
                                            r.getString("birthdate"), 
                                            r.getString("address"), 
                                            r.getString("phone"), 
                                            r.getString("doctor"), 
                                            r.getString("nurse"));
                        pat.add(pi);
                    }
                }
            } else {
                if (userType.equals("Doctor")) {
                    sql = "SELECT * FROM patientinfo WHERE doctor = '" + name +  "' AND medicalStatus=1";
                    r = s.executeQuery(sql);
                    while (r.next()) {
                        PatientInfo pi = new PatientInfo(r.getInt("patientID"), r.getString("name"), r.getString("birthdate"), r.getString("address"), r.getString("phone"), r.getString("doctor"), r.getString("nurse"));
                        pat.add(pi);

                    }
                } else {
                    sql = "SELECT * FROM patientinfo WHERE nurse = '" + name +  "' AND medicalStatus=1";
                    r = s.executeQuery(sql);
                    while (r.next()) {
                        PatientInfo pi = new PatientInfo(r.getInt("patientID"), r.getString("name"), r.getString("birthdate"), r.getString("address"), r.getString("phone"), r.getString("doctor"), r.getString("nurse"));
                        pat.add(pi);
                    }
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pat;
    }
    // ----------------- MRSMain ----------------- //
    
    
    // ------------- MRSPatientInfo  ------------- //    
    public PatientInfo getPatientInfo(int patientID){
        try {
            Statement s = con.createStatement();
            
            String sql = "SELECT * FROM patientinfo WHERE patientID = '" + patientID + "'";
            
            ResultSet rs = s.executeQuery(sql);
            
            if(rs.next()){
                PatientInfo mrs = new PatientInfo(
                        rs.getInt("patientID"), 
                        rs.getString("name"), 
                        rs.getString("birthdate"), 
                        rs.getString("address"), 
                        rs.getString("phone"), 
                        rs.getString("doctor"), 
                        rs.getString("nurse"));
                
               return mrs;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void changeMedicalStatus(int id, int status) {
        Statement s;
        String sql;
        try {
            s = con.createStatement();
            sql = "UPDATE patientinfo SET medicalStatus=" + status + " WHERE patientID = " + id;
            s.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // ------------- MRSPatientInfo  ------------- //

    
    // ---------- MRSMedicalRecordList  ---------- //
    public ArrayList<MedicalRecord> getMedicalRecordList(int patientID) {
        ArrayList<MedicalRecord> mr = new ArrayList<MedicalRecord>();
        Statement s;
        String sql;
        ResultSet rs;
        try {
            s = con.createStatement();
            sql = "SELECT * FROM medicalrecords WHERE patientID = " + patientID;
            rs = s.executeQuery(sql);
            
            while(rs.next()){
                MedicalRecord m = new MedicalRecord(
                        rs.getInt("medicalRecordID"), 
                        rs.getInt("patientID"), 
                        rs.getString("treatment"), 
                        rs.getString("diagnosis"),  
                        rs.getInt("prescriptionID"));
                mr.add(m);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mr;
    }    
    // ---------- MRSMedicalRecordList  ---------- //
    
    
    // ------------ MRSMedicalRecord  ------------ //
    public MedicalRecord getMedicalRecord(int medicalRecordID) {
        try {
            MedicalRecord m;
            Statement s = con.createStatement();
            
            String sql = "SELECT * FROM medicalrecords WHERE medicalRecordID = '" + medicalRecordID + "'";
            
            ResultSet rs = s.executeQuery(sql);
            
            if(rs.next()){
                m = new MedicalRecord (
                rs.getInt("medicalRecordID"), 
                rs.getInt("patientID"), 
                rs.getString("treatment"), 
                rs.getString("diagnosis"),  
                rs.getInt("prescriptionID"));
                return m;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ArrayList<PrescriptionMedicine> getPrescriptionMedicine(int prescriptionID){
        ArrayList<PrescriptionMedicine> pm = new ArrayList<PrescriptionMedicine>();
        Statement s;
        String sql;
        ResultSet r;
        try {
            s = con.createStatement();
            sql = "SELECT *"
                    + " FROM prescription_medicine AS pm, medicine AS m"
                    + " WHERE prescriptionID = " + prescriptionID
                    + " AND pm.medicineID = m.medicineID";
            r = s.executeQuery(sql);
            
            while(r.next()){
                PrescriptionMedicine p = new PrescriptionMedicine(r.getString(1),r.getString(2),r.getString(3), r.getInt(4));
                pm.add(p);
            }
            return pm;
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    // ------------ MRSMedicalRecord  ------------ //
    
    
    // ----------- MRSAddPatientInfo  ----------- //
    public boolean addPatientInfo(PatientInfo patientinfo, String username){
        Statement s;
        String sql;
        ResultSet r;
        try{
            s = con.createStatement();
            sql = "SELECT * FROM patientinfo WHERE username = '" + username + "'";
            r = s.executeQuery(sql);
            if(r.next()){
                sql = "UPDATE patientinfo SET name = '" 
                        + patientinfo.getName() 
                        + "', birthdate = '" + patientinfo.getBirth() 
                        + "', address = '" + patientinfo.getAddress() 
                        + "', phone = '" + patientinfo.getPhone() 
                        + "', doctor = '" + patientinfo.getDoctor() 
                        + "', nurse = '"+ patientinfo.getNurse() + "'"
                        + " WHERE username = '" + username + "'";
                s.executeUpdate(sql);
                
                JOptionPane.showMessageDialog(null, "Record Saved!");
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Username Not Found!.");
        return false;
    }
    // ----------- MRSAddPatientInfo  ----------- //
    
    
    // ---------- MRSAddMedicalRecord  ---------- //
    public int addMedicalRecord(int patientID, String treatment, String diagnosis, ArrayList<PrescriptionMedicine> medicineList) {     
        String sql;
        Statement s;
        try {
            s = con.createStatement();
            int prescriptionID = 0;
            int medicalRecordID = 0;

            // Create the medicalRecordID and prescriptionID
            sql = "INSERT INTO medicalrecords (patientID, treatment, diagnosis, prescriptionID) VALUES (" + patientID + ", '" + treatment + "','" + diagnosis + "',NULL)";
            s.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);

            ResultSet generatedKeys = s.getGeneratedKeys();
            if (generatedKeys.next()) {
                medicalRecordID = generatedKeys.getInt(1);
            } else {
                return 2; // medicalRecordID not found
            }
            
            // Get medicineIDs and quantities from the brandnames and genericnames.
            int size = medicineList.size();
            ArrayList<Integer> quantities = new ArrayList<Integer>();
            ArrayList<Integer> medicineIDs = new ArrayList<Integer>();
            
            Iterator<PrescriptionMedicine> iterator = medicineList.iterator();
            for (int i = 0; i < size; i++) {
                PrescriptionMedicine item = iterator.next();
                sql = "SELECT * FROM medicine"
                    + " WHERE genericName = '" + item.getGenericName() + "'"
                    + " AND brand = '" + item.getBrand() + "'";
                ResultSet rs = s.executeQuery(sql);
                rs.next();
                medicineIDs.add(rs.getInt("medicineID"));
                quantities.add(item.getQuantity());
            }

            // Create the prescriptionID record
            sql = "INSERT INTO prescription (prescriptionID) VALUES (NULL)";
            s.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);

            generatedKeys = s.getGeneratedKeys();
            if (generatedKeys.next()) {
                prescriptionID = generatedKeys.getInt(1);
            } else {
                return 1; // prescriptionID not found
            }

            // Insert the medicineIDs and quantities into the created prescriptionID
            for (int i = 0; i < medicineList.size(); i++) {
                int a = medicineIDs.get(i);
                int b = quantities.get(i);

                sql = "INSERT INTO prescription_medicine VALUES (" + prescriptionID + "," + a + "," + b + ")";
                s.executeUpdate(sql);
            }

            // Update the medicalrecords_kat record with the generated prescriptionID
            sql = "UPDATE medicalrecords SET prescriptionID=" + prescriptionID + " WHERE medicalRecordID=" + medicalRecordID;
            s.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public ArrayList<Medicine> displaySearchMedicine(String input){
        ArrayList<Medicine> med = new ArrayList<Medicine>();
        String sql;
        Statement stmt;
        ResultSet rs;
        try {
            stmt = con.createStatement();            
            // check if it is Generic Name
            sql ="SELECT * FROM medicine WHERE genericName='" + input + "'";
            rs = stmt.executeQuery(sql);
            if (rs.next()) { // input is a Generic Name
                do {
                    Medicine m = new Medicine(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(5));
                    med.add(m);
                } while (rs.next());
            } else { // not Generic Name, then check if Brand Name
                sql ="SELECT * FROM medicine WHERE brand='" + input + "'";
                rs = stmt.executeQuery(sql);
                if (rs.next()) { // input is a Brand Name
                    do {
                        Medicine m = new Medicine(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(5));
                        med.add(m);
                    } while (rs.next());
                } else { // does not exist
                    JOptionPane.showMessageDialog(null, "Medicine " + input + " does not exist.");
                    return null;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return med;
    }
    // ---------- MRSAddMedicalRecord  ---------- //    
    
    // ----------- MRSMedicineRecords  ----------- //
    public ArrayList<Medicine> getMedicine( ){ 
        ArrayList<Medicine> med = new ArrayList<Medicine>();
        String sql ="SELECT * FROM medicine";
        Statement stmt;
        ResultSet rs;
        
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            while(rs.next()){
              Medicine m = new Medicine(rs.getString("genericName"),rs.getString("brand"),rs.getString("dosage"));
              med.add(m);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return med;
    }
    // ----------- MRSMedicineRecords  ----------- //
    
    // ---------------- MRSNurse  ---------------- //
    public ArrayList<Nurse> getNurseList( ){ 
        ArrayList<Nurse> nur = new ArrayList<>();
        String sql;
        Statement stmt;
        ResultSet rs;
        
        try {
            stmt = con.createStatement();
            sql ="SELECT nurse.*, user.firstname, user.lastname, user.email FROM nurse JOIN user ON nurse.username = user.username";
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                String fname = rs.getString("firstname");
                String lname = rs.getString("lastname");
                String email = rs.getString("email");
                String dept = rs.getString("department");
                
                Nurse n = new Nurse();
                      n.setFirstname(fname);
                      n.setLastname(lname);
                      n.setEmail(email);
                      n.setDepartment(dept);
                      
                nur.add(n);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return nur;
    }
    // ---------------- MRSNurse  ---------------- //
    
    // ---------------- MRSDoctor ---------------- //
    public ArrayList<Doctor> displayDoctor() {
        ArrayList<Doctor> doc = new ArrayList<>();
        Statement s;
        String sql;
        ResultSet r;
        try {
            s = con.createStatement();
            sql = "SELECT doctor.*, user.firstname, user.lastname, user.email FROM doctor JOIN user ON doctor.username = user.username";
            r = s.executeQuery(sql);
            while (r.next()) {
                String specialty = r.getString("specialty");
                String firstName = r.getString("firstname");
                String lastName = r.getString("lastname");
                String email = r.getString("email");

                Doctor doctor = new Doctor();
                doctor.setSpecialty(specialty);
                doctor.setFirstname(firstName);
                doctor.setLastname(lastName);
                doctor.setEmail(email);

                doc.add(doctor);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return doc;
    }
    // ---------------- MRSDoctor ---------------- //
}

