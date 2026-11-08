import java.awt.BorderLayout;
import java.awt.Color;
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
        this.setLayout(new BorderLayout());

        textArea = new JTextArea();
        textArea.setPreferredSize(new Dimension(800, 600));

        mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(800, 600));
        mainPanel.add(textArea);
        mainPanel.setBackground(Color.DARK_GRAY);
        
        sideBarPanel = new JPanel();
        sideBarPanel.setPreferredSize(new Dimension(200, 600));
        sideBarPanel.setBackground(Color.LIGHT_GRAY);

        
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