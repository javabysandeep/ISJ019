package _2_controlStatements.jumpStatements;

public class Demo4 {
    public static void main(String[] args) {
        //print even numbers using continue 1 to 20

        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
        //output :2,4,6,..20
    }
}
