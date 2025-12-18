package project.roles;

public class Assessment {
    private String assId, assName, assType, assPercentage, assIMID;
    
    public Assessment(String assId, String assName, String assType, String assPercentage, String assIMID) {
        this.assId = assId;
        this.assName = assName;
        this.assType = assType;
        this.assPercentage = assPercentage;
        this.assIMID = assIMID;
    }

    public String getAssId() {
        return assId;
    }

    public void setAssId(String assId) {
        this.assId = assId;
    }

    public String getAssName() {
        return assName;
    }

    public void setAssName(String assName) {
        this.assName = assName;
    }

    public String getAssType() {
        return assType;
    }

    public void setAssType(String assType) {
        this.assType = assType;
    }

    public String getAssPercentage() {
        return assPercentage;
    }

    public void setAssPercentage(String assPercentage) {
        this.assPercentage = assPercentage;
    }

    public String getAssIMID() {
        return assIMID;
    }

    public void setAssIMID(String assIMID) {
        this.assIMID = assIMID;
    }
    
    
}
