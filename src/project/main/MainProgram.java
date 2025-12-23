package project.main;

import java.io.FileWriter;
import java.io.IOException;


public class MainProgram {
    public static void main(String[]args) {
        
        System.out.println("Main method finished execution.");
        
        System.out.println("Hello");
        
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                // Code to run when the JVM is shutting down
                
                // Add your cleanup logic here
            }
        });
    }
}
