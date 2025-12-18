package project.utils;

/**
 *
 * @author Khoo Guo Hao
 */
import javax.swing.JFrame;

public class FrameFormat extends JFrame {
    public FrameFormat() {
        
    }
    
    void formatWindow(String title) {
        setTitle(title);
        pack();
        setLocationRelativeTo(null);
    }
}
