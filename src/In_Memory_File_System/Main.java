package In_Memory_File_System;

public class Main {
    public static void main(String[] args) {

        Directory root = new Directory(null, "media");
        File file = new File(root, "Fifa 15", 10);
        File file2 = new File(root, "Fifa 15", 10);
        File file3 = new File(root, "Fifa 15", 10);
        root.addEntry(file);
        root.addEntry(file2);
        root.addEntry(file3);


        Directory root2 = new Directory(root, "movie");
        File file21 = new File(root2, "Fallout", 5);
        File file22 = new File(root2, "Venom", 20);
        File file23 = new File(root2, "Avengers", 3);
        root2.addEntry(file21);
        root2.addEntry(file22);
        root2.addEntry(file23);
        root.addEntry(root2);


        System.out.println(root.getName());
        for (EntryType entryType : root.getContents()) {
            if (entryType instanceof Directory) {
                PrintEntryType(entryType);
            } else {
                System.out.println(entryType.getPath());
            }
        }
    }

    private static void PrintEntryType(EntryType entryType) {
        System.out.println("   "+entryType.getName());
        for (EntryType entryType1 : ((Directory) entryType).getContents()) {
            if (entryType1 instanceof Directory) {
                PrintEntryType(entryType1);
            } else {
                System.out.println("   "+entryType1.getPath());
            }
        }
    }
}
