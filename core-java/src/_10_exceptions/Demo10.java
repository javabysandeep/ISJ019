package _10_exceptions;

public class Demo10 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
            String str = null;
            System.out.println(str.length());
        } catch (ArithmeticException arithmeticException) {
            System.out.println("invalid denominator");
        } catch (Exception exception) {
            System.out.println("generic handler");
        }
    }
}
