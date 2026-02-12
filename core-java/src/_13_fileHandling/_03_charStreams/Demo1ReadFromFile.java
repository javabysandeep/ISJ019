package _13_fileHandling._03_charStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Demo1ReadFromFile {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        FileReader fileReader = new FileReader(file);
        int value = fileReader.read();
        while (value != -1) {
            System.out.print((char) value);
            value = fileReader.read();
        }
        fileReader.close();

    }
}
