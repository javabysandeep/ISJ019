package _13_fileHandling._01_fileDemos;

import java.io.File;
import java.io.IOException;

public class Demo3RenameFile {
    public static void main(String[] args) throws IOException {
        //file class object does not create the file
        File file = new File("C:\\Work\\ISJ019\\abc.txt");
        file.renameTo(new File("C:\\Work\\ISJ019\\student-details.txt"));
        System.out.println("file renamed");

    }
}
