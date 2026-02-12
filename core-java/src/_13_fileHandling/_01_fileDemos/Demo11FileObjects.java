package _13_fileHandling._01_fileDemos;

import java.io.File;

public class Demo11FileObjects {
    public static void main(String[] args) {
        File folder = new File("C:\\Work\\ISJ019\\core-java\\src\\_12_collection\\_01_listDemos\\_01_arrayListDemos");
        File[] listOfFileObject = folder.listFiles();
        for (File file : listOfFileObject) {
            System.out.println(file.getName() + "\t" + file.length());
        }
    }
}
