public class NoteController {
    private MainWindow view;
    private NoteModel model;

    public NoteController(MainWindow view, NoteModel model) {
        this.view = view;
        this.model = model;
    }

    public void saveNote() {
        model.saveNote(view.getTextAreaContent());
    }

    public void newNote(){ 
        model.newNote();
        
        String lastNoteContent = model.getLastNote().getContent();
        view.setTextAreaContent(lastNoteContent);
    }

    public void updateTextArea(String text){ 
        view.setTextAreaContent(text);
    }
}