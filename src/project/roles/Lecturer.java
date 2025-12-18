package project.roles;

import java.util.ArrayList;

public class Lecturer extends User {
    private String leaderId;
    public ArrayList<Module> Lec_Modules = new ArrayList<Module>();
    public ArrayList<Class> Lec_Classes = new ArrayList<Class>();
    
    public Lecturer (String[] userData) {
        super(userData);
    }
    
    public String getLeaderId() {
        return this.leaderId;
    }

    public void setLeaderId(String leaderId) {
        this.leaderId = leaderId;
    }
    
    public String[] getLecturerData() {
        String [] lecData = {getId(), leaderId};
        return lecData;
    }
    
    public String[] getFullLecturerData() {
        String [] fullData = {getId(), getName(), getEmail(), getPW(), getRole(), leaderId};
        return fullData;
    }
}
