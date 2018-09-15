package In_Memory_File_System;

import java.time.LocalDateTime;

public abstract class EntryType {
    private Directory parent;
    private LocalDateTime created;

    private String name;

    public EntryType(Directory parent, String name) {
        this.parent = parent;
        this.name = name;
        this.created = LocalDateTime.now();
    }

    public String getPath() {
        if (parent == null) {
            return name;
        } else {
            return   "   " + name;
        }
    }

    public Directory getParent() {
        return parent;
    }

    public boolean delete() {
        if (parent == null) return false;
        return parent.deleteEntry(this);
    }

    public abstract int size();

    public LocalDateTime getCreated() {
        return created;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
