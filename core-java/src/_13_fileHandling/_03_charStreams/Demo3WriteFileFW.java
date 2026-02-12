package _13_fileHandling._03_charStreams;

import java.io.*;

public class Demo3WriteFileFW {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.write("written using FileWriter");
        fileWriter.close();
        System.out.println("written to a file");

    }
}
