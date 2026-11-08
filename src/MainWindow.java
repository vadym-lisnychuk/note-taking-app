import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.*;

public class MainWindow extends JFrame
{
    // Default Values
    private static final int windowWidth = 1000;
    private static final int windowHeight = 600;
    private static final String windowTitle = "Note Taking App by Group 5 SWE 3133";
    
    // Main window components
    private JPanel mainPanel;
    private JPanel sideBarPanel;
    private JTextArea textArea;

    MainWindow() {
        this.setSize(windowWidth, windowHeight);
        this.setLocationRelativeTo(null);
        this.setTitle(windowTitle);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);      
        
        textArea = new JTextArea();
        mainPanel = new JPanel();
        sideBarPanel = new JPanel();

        mainPanel.setSize(new Dimension(600, 600));
        sideBarPanel.setSize(new Dimension(400, 600));
        
        textArea.setSize(new Dimension(600, 600));
        mainPanel.add(textArea);

        // IMPORTRANT TO KEEP THE LAST
        this.add(mainPanel, BorderLayout.CENTER);
        this.add(sideBarPanel, BorderLayout.WEST);
        this.setVisible(true);
    }
    
    // View method for getting text
    public String getNoteText() {
        return textArea.getText();
    }
}