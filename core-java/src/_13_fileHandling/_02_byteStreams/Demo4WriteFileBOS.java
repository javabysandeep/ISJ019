package _13_fileHandling._02_byteStreams;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo4WriteFileBOS {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        FileOutputStream fos = new FileOutputStream(file, true);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write('A');
        bos.close();
        fos.close();
        System.out.println("written to a file");

    }
}
