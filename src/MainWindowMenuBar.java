import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MainWindowMenuBar extends JMenuBar implements ActionListener
{
    private JMenu file;
    private JMenuItem NewNote;
    private JMenuItem SaveNote;
    private JMenuItem ExitApp;

    private JMenu Reminders;
    private JMenuItem OpenReminders;


    // rw instance to control its appereance
    private RemindersWindow rw;


    MainWindowMenuBar() {
        rw = new RemindersWindow();

        // new note
        NewNote = new JMenuItem("New");
        NewNote.setMnemonic(KeyEvent.VK_N);
        NewNote.addActionListener(this);

        // exit app
        ExitApp = new JMenuItem("Exit");
        ExitApp.setMnemonic(KeyEvent.VK_X);
        ExitApp.addActionListener(this);

        //save note
        SaveNote = new JMenuItem("Save");
        SaveNote.setMnemonic(KeyEvent.VK_S);
        SaveNote.addActionListener(this);

        // file
        file = new JMenu("File");
        file.setMnemonic(KeyEvent.VK_F);
        file.add(NewNote);
        file.add(SaveNote);
        file.add(ExitApp);

        this.add(file);
        
        // reminders
        Reminders = new JMenu("Reminders");
        Reminders.setMnemonic(KeyEvent.VK_R);
        OpenReminders = new JMenuItem("Open");
        OpenReminders.setMnemonic(KeyEvent.VK_O);
        OpenReminders.addActionListener(this);


        Reminders.add(OpenReminders);
        this.add(Reminders);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == NewNote){
            System.out.println("New");
        }
        if(e.getSource() == SaveNote){
            System.out.println("Save");
        }
        if(e.getSource() == ExitApp){
            System.exit(0);
        }
        if(e.getSource() == OpenReminders){
            System.out.println("Reminders");
            rw.setVisible(true);
        }
    }

}
