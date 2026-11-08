public class Note {
    private static int ID = 0;
    private static String baseName = "note";

    private String name;
    private String content;

    Note(){
        ID++;

        name = baseName + ID + ".txt";
        content = "";
    }

    void setContent(String text) {
        content = text;
    }

    String getName(){
        return name;
    }

    String getContent(){ 
        return content;
    }
}