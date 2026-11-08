import javax.swing.SwingUtilities;

public class Main{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainWindow view = new MainWindow();
            NoteModel model = new NoteModel();
            NoteController controller = new NoteController(view, model);
            view.setJMenuBar(new MainWindowMenuBar(controller));


            view.setTextAreaContent("hello world");
        });
    }
}