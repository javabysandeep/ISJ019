package _10_exceptions;

public class Demo11 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 1);
            String str = null;
            System.out.println(str.length());
        } catch (ArithmeticException | NullPointerException exception) {
            System.out.println("exception occurred");
        }
    }
}
