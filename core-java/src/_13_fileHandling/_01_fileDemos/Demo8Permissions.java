package _13_fileHandling._01_fileDemos;

import java.io.File;
import java.io.IOException;

public class Demo8Permissions {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        file.createNewFile();
        boolean setWritable = file.setWritable(false);
        System.out.println("File is now read only = " + setWritable);

    }
}
