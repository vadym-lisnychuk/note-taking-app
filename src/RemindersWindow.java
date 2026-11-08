import javax.swing.JFrame;

public class RemindersWindow extends JFrame{
    // Default values
    private static final int windowWidth = 400;
    private static final int windowHeight = 600;
    private static final String windowTitle = "Reminders";

    RemindersWindow(){
        this.setSize(windowWidth, windowHeight);
        this.setLocationRelativeTo(null);
        this.setTitle(windowTitle);
        this.setResizable(false);
        this.setVisible(false);
    }
}