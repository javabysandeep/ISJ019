package _10_exceptions;

public class Demo12 {
    public static void main(String[] args) {
        try {
            System.out.println(divide(10, 0));
        } catch (ArithmeticException ae) {
            System.out.println("invalid denominator");
        }
        System.out.println("rest of the main");
    }

    private static int divide(int number1, int number2) throws ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException {
        int result = number1 / number2;
        return result;
    }
}
