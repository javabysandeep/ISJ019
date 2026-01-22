package _10_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        try {
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            System.out.println(number1 / number2);
        } catch (InputMismatchException exception) {
            System.out.println("enter valid numbers");
        } catch (ArithmeticException exception) {
            System.out.println("Enter nonzero denominator");
        }
        System.out.println("rest of the main");
    }
}
