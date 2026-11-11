import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;

public class RemindersWindow extends JFrame {
    final JTextField title = new JTextField();
    final JTextField due = new JTextField();
    final JButton create = new JButton("Create reminder");
    final JPanel list = new JPanel();

    RemindersWindow() {
        super("Reminders");
        setSize(480, 400);
        setLocationRelativeTo(null);

        JPanel form = new JPanel(new GridLayout(3, 2));
        form.add(new JLabel("Title"));
        form.add(title);
        form.add(new JLabel("Due (YYYY-MM-DD HH:MM)"));
        form.add(due);
        form.add(new JLabel());
        form.add(create);

        list.setLayout(new BoxLayout(list, BoxLayout.Y_AXIS));
        add(form, BorderLayout.NORTH);
        add(new JScrollPane(list), BorderLayout.CENTER);
    }

    JCheckBox addReminder(Reminder reminder) {
        String date = reminder.dueDate.toString().replace('T', ' ');
        JCheckBox box = new JCheckBox(reminder.title + "   (" + date + ")", reminder.completed);
        list.add(box);
        list.revalidate();
        return box;
    }
}
