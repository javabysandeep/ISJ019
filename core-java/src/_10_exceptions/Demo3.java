package _10_exceptions;

public class Demo3 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
            System.out.println("rest of the try");
        } catch (ArithmeticException e) {
            System.out.println("invalid denominator");
        }
        System.out.println("rest of the main");
        System.out.println("rest of the main");
        System.out.println("rest of the main");
        System.out.println("rest of the main");

    }
}
