package _13_fileHandling._02_byteStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo1ReadFromFile {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        FileInputStream fis = new FileInputStream(file);
        int value = fis.read();
        while (value != -1) {
            System.out.print((char) value);
            value = fis.read();
        }
        fis.close();

    }
}
