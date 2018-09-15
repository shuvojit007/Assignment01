package In_Memory_File_System;


public class File extends EntryType {
    private String content;
    private int size;

    public File(Directory parent, String name, int size) {
        super(parent, name);
        this.size = size;
    }

    @Override
    public int size() {
        return size;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}
