import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MainWindow extends JFrame
{
    // Default Values
    private static final int MainWindowWidth = 1000;
    private static final int MainWindowHeight = 600;
    private static final String MainWindowTitle = "Note Taking App by Group 5 SWE 3133";

    MainWindow() {
        MainWindowMenuBar mb = new MainWindowMenuBar();
        this.setJMenuBar(mb);

        this.setSize(MainWindowWidth, MainWindowHeight);
        this.setLocationRelativeTo(null);
        this.setTitle(MainWindowTitle);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        

        // IMPORTRANT TO KEEP THE LAST
        this.setVisible(true);
    }
}
