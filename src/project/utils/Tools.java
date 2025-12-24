package project.utils;

import java.util.ArrayList;
import project.roles.*;

public class Tools {
    public static User checkCredentials(ArrayList<? extends User> userCred, String emailInput, String passwordInput) {
        //in progress
        for (User user : userCred) {
            String emailCred = user.getEmail();
            String pwCred = user.getPW();
            
            if (emailCred.equals(emailInput) && pwCred.equals(passwordInput)) {
                return user;
            }
        }
        return null;
    }
}
