package _13_fileHandling._01_fileDemos;

import java.io.File;
import java.io.IOException;

public class Demo7PathLength {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        System.out.println("file path =" + file.getAbsolutePath());
        System.out.println("File size = " + file.length());//no of characters.

    }
}
