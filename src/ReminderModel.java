import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.util.ArrayList;

class ReminderModel {
    private final Path file = Path.of(".REMINDERS.txt");
    private final Path tempFile = Path.of(".reminders-save.tmp");

    ArrayList<Reminder> load() throws IOException {
        ArrayList<Reminder> reminders = new ArrayList<>();
        if (Files.notExists(file)) {
            return reminders;
        }

        for (String line : Files.readAllLines(file)) {
            String[] fields = line.split("\t", -1);
            if (fields.length < 2 || fields.length > 3) {
                throw new IOException("Invalid reminder in " + file);
            }
            // older reminders start unchecked
            boolean done = fields.length == 3 && Boolean.parseBoolean(fields[2]);
            reminders.add(new Reminder(fields[0], LocalDateTime.parse(fields[1]), done));
        }
        return reminders;
    }

    void save(ArrayList<Reminder> reminders) throws IOException {
        ArrayList<String> lines = new ArrayList<>();
        for (Reminder reminder : reminders) {
            lines.add(reminder.title + "\t" + reminder.dueDate + "\t" + reminder.completed);
        }
        // save to a temp file first in case the write fails
        Files.write(tempFile, lines);
        Files.move(tempFile, file, StandardCopyOption.REPLACE_EXISTING);
    }
}
