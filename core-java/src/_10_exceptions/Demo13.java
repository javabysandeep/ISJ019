package _10_exceptions;

public class Demo13 {
    public static void main(String[] args) {
        //System.out.println(10 / 0);
        throw new ArithmeticException("/ by zero");
    }
}
