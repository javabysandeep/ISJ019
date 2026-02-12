package _13_fileHandling._02_byteStreams;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo2ReadFromBuffer {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);
        int value = bis.read();
        while (value != -1) {
            System.out.print((char) value);
            value = bis.read();
        }
        bis.close();
        fis.close();
    }
}
