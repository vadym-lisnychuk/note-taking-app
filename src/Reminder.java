import java.time.LocalDateTime;

class Reminder {
    final String title;
    final LocalDateTime dueDate;
    boolean completed;

    Reminder(String title, LocalDateTime dueDate, boolean completed) {
        this.title = title;
        this.dueDate = dueDate;
        this.completed = completed;
    }
}
