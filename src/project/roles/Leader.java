package project.roles;

import java.util.ArrayList;

public class Leader extends User {
    
    public ArrayList<Lecturer> leaderTeam = new ArrayList<Lecturer>();
            
    public Leader (String[] userData) {
        super(userData);
    } 
}
