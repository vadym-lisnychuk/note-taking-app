import javax.swing.JFrame;

public class RemindersWindow extends JFrame{
    private static final int MainWindowWidth = 400;
    private static final int MainWindowHeight = 600;
    private static final String MainWindowTitle = "Reminders";

    RemindersWindow(){
        this.setSize(MainWindowWidth, MainWindowHeight);
        this.setLocationRelativeTo(null);
        this.setTitle(MainWindowTitle);
        this.setResizable(false);

        this.setVisible(false);
    }
}