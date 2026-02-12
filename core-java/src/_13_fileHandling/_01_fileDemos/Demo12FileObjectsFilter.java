package _13_fileHandling._01_fileDemos;

import java.io.File;
import java.io.FileFilter;

public class Demo12FileObjectsFilter {
    public static void main(String[] args) {
        File folder = new File("C:\\Work\\ISJ019\\core-java\\src\\_12_collection\\_01_listDemos\\_01_arrayListDemos");
        FileFilter filter = x -> x.length() > 500;
        File[] listOfFileObject = folder.listFiles(filter);
        for (File file : listOfFileObject) {
            System.out.println(file.getName() + "\t" + file.length());
        }
    }
}
