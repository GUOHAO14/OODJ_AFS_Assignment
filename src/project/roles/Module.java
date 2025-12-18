package project.roles;

import java.util.ArrayList;

public class Module {
    private String moduleId, moduleName;
    public ArrayList<Lecturer> Mod_Lecturers = new ArrayList<Lecturer>();
    
    public Module(String moduleId, String moduleName) {
        this.moduleId = moduleId;
        this.moduleName = moduleName;
    }

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
    
}
