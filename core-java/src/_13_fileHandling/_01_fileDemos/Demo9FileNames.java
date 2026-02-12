package _13_fileHandling._01_fileDemos;

import java.io.File;

public class Demo9FileNames {
    public static void main(String[] args) {
        File folder = new File("C:\\Work\\ISJ019\\core-java\\src\\_12_collection\\_01_listDemos\\_01_arrayListDemos");
        String[] listOfFileNames = folder.list();
        for (String fileName : listOfFileNames) {
            System.out.println(fileName);
        }
    }
}
