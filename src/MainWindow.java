import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MainWindow extends JFrame implements ActionListener
{
    // Default Values
    private static final int MainWindowWidth = 1000;
    private static final int MainWindowHeight = 600;
    private static final String MainWindowTitle = "Note Taking App by Group 5 SWE 3133";
//    MenuBar mb;
    private JMenu file;
    private JMenuItem NewNote;

    MainWindow() {
        this.setVisible(true);
        this.setSize(MainWindowWidth, MainWindowHeight);
        this.setLocationRelativeTo(null);
        this.setTitle(MainWindowTitle);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        setMenuBar();
    }

    private void setMenuBar(){
        JMenuBar mb = new JMenuBar();
        file = new JMenu("File");
        file.setMnemonic(KeyEvent.VK_F);

        NewNote = new JMenuItem("New note");
        NewNote.setMnemonic(KeyEvent.VK_N);
        file.add(NewNote);
        mb.add(file);

        this.setJMenuBar(mb);
    }


    @Override
    public void actionPerformed(ActionEvent e){

    }
}
