package FileSystem;


import FileSystem.Composite.Directory;
import FileSystem.Leaf.File;

public class Main {

    private static String level1 = "---";
    private static String level2 = level1 + "***";
    private static String level3 = level2 + "###";

    public static void main(String[] args) {


        Directory dir1 = new Directory("dir1");

        //---- dir1 content
        dir1.add(new File(level1 + "file_1"));
        Directory dir2 = new Directory(level1 + "dir2");
        dir1.add(dir2);

        //---- dir2 content
        dir2.add(new File(level2 + "file_2"));
        dir2.add(new File(level2 + "file_3"));
        Directory dir3 = new Directory(level2 + "dir3");
        dir2.add(dir3);
        dir2.add(new File(level2 + "file_4"));

        //---- fill in dir3
        dir3.add(new File(level3 + "file_5"));
        dir3.add(new Directory(level3 + "dir4"));
        dir3.add(new File(level3 + "file_6"));

        // Delete dir1 with all data inside: rm -rf
        dir1.delete();

    }
}
