package In_Memory_File_System;

import java.util.ArrayList;

public class Directory extends EntryType{
    public ArrayList<EntryType> entryList;

    public Directory(Directory parent, String name) {
        super(parent, name);
        this.entryList = new ArrayList<>();
    }

    @Override
    public int size() {
        int size = 0;
        for (EntryType e : entryList)
            size += e.size();
        return size;
    }


    public void addEntry(EntryType entry) {
        entryList.add(entry);
    }

    public boolean deleteEntry(EntryType entry) {
        return entryList.remove(entry);
    }

    public ArrayList<EntryType> getContents() {
        return entryList;
    }
}
