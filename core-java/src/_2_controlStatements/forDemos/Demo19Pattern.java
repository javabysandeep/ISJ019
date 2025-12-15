package _2_controlStatements.forDemos;

public class Demo19Pattern {
    public static void main(String[] args) {

        System.out.println("**************************************************");
        System.out.println("**************************************************");
        System.out.println("**************************************************");
        System.out.println("**************************************************");
        System.out.println("**************************************************");

        System.out.println();

        for (int i = 1; i <= 50; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 1; i <= 50; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 1; i <= 50; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 1; i <= 50; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 1; i <= 50; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.println("using nested for loop");

        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 50; col++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
