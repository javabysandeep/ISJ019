package _13_fileHandling._02_byteStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3WriteFileFOS {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        FileOutputStream fos = new FileOutputStream(file, true);
        fos.write('A');
        fos.close();
        System.out.println("written to a file");

    }
}
