package _13_fileHandling._01_fileDemos;

import java.io.File;
import java.io.FilenameFilter;

public class Demo10FileNamesFilter {
    public static void main(String[] args) {
        File folder = new File("C:\\Work\\ISJ019\\core-java\\src\\_12_collection\\_01_listDemos\\_01_arrayListDemos");
        FilenameFilter filter = (dir, name) -> name.startsWith("Demo1");
        String[] listOfFileNames = folder.list(filter);
        for (String fileName : listOfFileNames) {
            System.out.println(fileName);
        }
    }
}
