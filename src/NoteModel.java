import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class NoteModel {
    private final Path notesDirectory = Path.of("notes");
    private boolean areFilesAbsent = false;

    // array for keeping notes
    private List<Note> notes = new ArrayList<>();

    NoteModel(){
        initializeNotes();
    }

    private void initializeNotes() {
        
    }

    public Note getLastNote() {
        return notes.get(notes.size() - 1);
    }

    public void newNote() {
        System.out.println("Creating new note...");

        notes.add(new Note());
    }

    public void saveNote(String text) {
        System.out.println("Saving...");
    }
}