package project.roles;

abstract class User {
    
    private final String id;
    private String name, email, password, role;
    
    public User(String[] data) {
        this.id = data[0];
        this.name = data[1];
        this.email = data[2];
        this.password = data[3];
        this.role = data[4];
    }
    
    public void changeDetails(String name, String email, String password, String role) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
        // add input validation here 
        // add try-catch
        // add JOptionPane (class)
    }
    
    public void changeDetails(String [] data) {
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
    
    public String getEmail() {
        return this.email;
    }
    
    public String getPW() {
        return this.password;
    }
    
    public String getRole() {
        return this.role;
    }
    
    public String[] getFullUserData() {
        String [] userFullData = {id, name, email, password, role};
        return userFullData;
    }
}
