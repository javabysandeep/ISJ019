package _13_fileHandling._01_fileDemos;

import java.io.File;
import java.io.IOException;

public class Demo4DeleteFile {
    public static void main(String[] args) throws IOException {
       // File file = new File("C:\\Work\\ISJ019\\student-details.txt");
        File file = new File("C:\\Work\\ISJ019\\HelloWorld.java");
        boolean isFileDeleted = file.delete();
        System.out.println("file deleted = " + isFileDeleted);

    }
}
