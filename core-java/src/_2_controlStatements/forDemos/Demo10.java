package _2_controlStatements.forDemos;

public class Demo10 {
    public static void main(String[] args) {
        //print numbers from 11 to 20 --> even
        for (int i = 11; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
