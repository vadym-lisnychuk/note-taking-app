import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import javax.swing.*;

class ReminderController {
    private final RemindersWindow view;
    private final ReminderModel model = new ReminderModel();
    private ArrayList<Reminder> reminders;

    ReminderController(RemindersWindow view) {
        this.view = view;
        view.create.addActionListener(e -> createReminder());
    }

    void open() {
        view.setVisible(true);
        if (reminders != null) return;

        try {
            reminders = model.load();
            for (Reminder reminder : reminders) showReminder(reminder);
            view.create.setEnabled(true);
        } catch (IOException | DateTimeParseException e) {
            view.create.setEnabled(false);
            showError("Could not read .REMINDERS.txt.");
        }
    }

    private void createReminder() {
        String title = view.title.getText().trim();
        if (title.isEmpty() || title.length() > 100 || title.contains("\t")
                || title.contains("\r") || title.contains("\n")) {
            showError("Enter a title of 1 to 100 characters without tabs or line breaks.");
            return;
        }

        try {
            LocalDateTime due = LocalDateTime.parse(view.due.getText().trim().replace(' ', 'T'));
            Reminder reminder = new Reminder(title, due, false);
            reminders.add(reminder);
            if (save()) {
                showReminder(reminder);
                view.title.setText("");
            } else {
                reminders.remove(reminder);
            }
        } catch (DateTimeParseException e) {
            showError("Enter the due date as YYYY-MM-DD HH:MM.");
        }
    }

    private void showReminder(Reminder reminder) {
        JCheckBox box = view.addReminder(reminder);
        box.addActionListener(e -> {
            reminder.completed = box.isSelected();
            if (!save()) {
                reminder.completed = !reminder.completed;
                box.setSelected(reminder.completed);
            }
        });
    }

    private boolean save() {
        try {
            model.save(reminders);
            return true;
        } catch (IOException e) {
            showError("Could not save .REMINDERS.txt.");
            return false;
        }
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(view, message);
    }
}
