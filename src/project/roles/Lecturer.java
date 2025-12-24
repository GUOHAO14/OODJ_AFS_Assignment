package project.roles;

import java.util.ArrayList;

public class Lecturer extends User {
    private Leader leader;
    public ArrayList<Module> Lec_Modules = new ArrayList<Module>();
    public ArrayList<Class> Lec_Classes = new ArrayList<Class>();
    
    public Lecturer (String[] userData) {
        super(userData);
    }
    
    public Leader getLeader() {
        return this.leader;
    }

    public void setLeader(Leader leader) {
        this.leader = leader;
    }
    
    public String[] getLecturerData() {
        // returns leader id instead of leader object
        String [] lecData = {getId(), leader.getId()};
        return lecData;
    }
    
    public String[] getFullLecturerData() {
        // returns leader id instead of leader object
        String [] fullData = {getId(), getName(), getEmail(), getPW(), getRole(), leader.getId()};
        return fullData;
    }
    
    public void printFullLecturerData() {
        // returns leader id instead of leader object
        String [] fullData = {getId(), getName(), getEmail(), getPW(), getRole(), leader.getId()};
        System.out.println(String.join(", ", fullData));
    }
    
    
                
    
//    @Override
//    public void setDetails(String[] fullData) {
//        super.setDetails(fullData);
//        
//        this.leader = fullData[4];
//        this.dob = fullData[5];
//    }
//    
//    // overloading
//    public void setDetails(String[] userData, String[] studentData) {
//        super.setDetails(userData);
//        
//        this.intakeId = studentData[1];
//        this.dob = studentData[2];
//    }
}
