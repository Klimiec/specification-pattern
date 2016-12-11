package FileSystem.Leaf;

import FileSystem.Component.Handler;

public class File implements Handler {

    private final String name;

    public File(String name) {
        this.name = name;
    }

    public void delete() {
        System.out.println(name);
    }
}
