package _1_operators._8_bitwise;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("logical and vs bitwise and");
      /*  System.out.println(10 % 2 == 1 && 10 / 0 == 0);//false
        System.out.println(10 % 2 == 1 & 10 / 0 == 0);//ArithmeticException : / by zero*/

        System.out.println("logical or vs bitwise or");
        System.out.println(10 % 2 == 0 || 10 / 0 == 0);//true
        System.out.println(10 % 2 == 0 | 10 / 0 == 0);//ArithmeticException : / by zero
    }
}
