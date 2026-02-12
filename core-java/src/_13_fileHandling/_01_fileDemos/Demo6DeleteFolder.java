package _13_fileHandling._01_fileDemos;

import java.io.File;
import java.io.IOException;

public class Demo6DeleteFolder {
    public static void main(String[] args) throws IOException {
        File folder = new File("C:\\Work\\ISJ019\\file-handling-temp");
        boolean isFolderDeleted = folder.delete();
        System.out.println("folder is deleted. =" + isFolderDeleted);

    }
}
