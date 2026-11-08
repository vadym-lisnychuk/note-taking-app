import javax.swing.*;
import java.awt.event.KeyEvent;

public class MainWindowMenuBar extends JMenuBar
{
    private JMenu file;
    private JMenuItem newNote;
    private JMenuItem saveNote;
    private JMenuItem exitApp;

    private JMenu remindersButton;
    private JMenuItem openReminders;

    // rw instance to control its appereance
    private RemindersWindow rw;

    public MainWindowMenuBar(NoteController controller) {
        rw = new RemindersWindow();

        // new note
        newNote = new JMenuItem("New");
        newNote.setMnemonic(KeyEvent.VK_N);
        newNote.addActionListener(e -> controller.newNote());

        // exit app
        exitApp = new JMenuItem("Exit");
        exitApp.setMnemonic(KeyEvent.VK_X);
        exitApp.addActionListener(e -> System.exit(0));

        // save note
        saveNote = new JMenuItem("Save");
        saveNote.setMnemonic(KeyEvent.VK_S);
        saveNote.addActionListener(e -> controller.saveNote());

        // file
        file = new JMenu("File");
        file.setMnemonic(KeyEvent.VK_F);
        file.add(newNote);
        file.add(saveNote);
        file.add(exitApp);

        this.add(file);
        
        // reminders
        remindersButton = new JMenu("Reminders");
        remindersButton.setMnemonic(KeyEvent.VK_R);
        openReminders = new JMenuItem("Open");
        openReminders.setMnemonic(KeyEvent.VK_O);
        openReminders.addActionListener(e -> rw.setVisible(true));

        remindersButton.add(openReminders);
        this.add(remindersButton);
    }
}
