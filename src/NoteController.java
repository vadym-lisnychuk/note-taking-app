public class NoteController {
    private MainWindow view;
    private NoteModel model;

    public NoteController(MainWindow view, NoteModel model) {
        this.view = view;
        this.model = model;
    }

    public void saveNote() {
        model.saveNote(view.getNoteText());
    }

    public void newNote(){ 
        model.newNote();
    }
}