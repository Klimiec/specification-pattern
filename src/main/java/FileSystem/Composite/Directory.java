package FileSystem.Composite;

import FileSystem.Component.Handler;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Handler{

    final private List<Handler> files;

    final private String name;

    public Directory(String name) {
        this.name = name;
        files = new ArrayList<Handler>();
    }

    // Remove content of the directory
    public void delete() {
        for(Handler file: files) {
            file.delete();
        }
        System.out.println(name);
    }

    // Add file/directory
    public void add(Handler file) {
        files.add(file);
    }

}
