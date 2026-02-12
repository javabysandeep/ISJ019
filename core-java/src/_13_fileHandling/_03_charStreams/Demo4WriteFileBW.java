package _13_fileHandling._03_charStreams;

import java.io.*;

public class Demo4WriteFileBW {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("written using bufferedWriter");
        bufferedWriter.close();
        fileWriter.close();
        System.out.println("written to a file");

    }
}
