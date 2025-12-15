package _2_controlStatements.jumpStatements;

public class Demo6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("rest of the main");
    }
}
