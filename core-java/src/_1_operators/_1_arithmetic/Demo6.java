package _1_operators._1_arithmetic;

public class Demo6 {
    public static void main(String[] args) {
        int chocolates = 10;
        int students = 0;
        System.out.println("chocolates per student: " + chocolates / students); // ArithmeticException : / by zero
        System.out.println("chocolates left over after distribution: " + chocolates % students); // ArithmeticException : / by zero

    }
}
