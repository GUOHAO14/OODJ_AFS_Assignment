package project.roles;

public abstract class User {
    
    private final String id;
    private String name, email, password, role;
    
    public User(String[] data) {
        this.id = data[0];
        this.name = data[1];
        this.email = data[2];
        this.password = data[3];
        this.role = data[4];
    }
    
    public void setDetails(String name, String email, String password, String role) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
        // add input validation here 
        // add try-catch
        // add JOptionPane (class)
    }
    
    public void setDetails(String [] data) {
        this.name = data[1];
        this.email = data[2];
        this.password = data[3];
        this.role = data[4];
        
        // add input validation here 
        // add try-catch
        // add JOptionPane (class)
    }
    
    public String getId() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPW() {
        return this.password;
    }
    
    public void setPW(String password) {
        this.password = password;
    }
    
    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    public String[] getFullUserData() {
        String [] userFullData = {id, name, email, password, role};
        return userFullData;
    }
}
