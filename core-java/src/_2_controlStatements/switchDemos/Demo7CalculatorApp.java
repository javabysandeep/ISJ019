package _2_controlStatements.switchDemos;

import java.util.Scanner;

public class Demo7CalculatorApp {
    public static void main(String[] args) {
        // accept two numbers from user and also operator
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1");
        int number1 = scanner.nextInt();

        System.out.println("Enter number 2");
        int number2 = scanner.nextInt();

        System.out.println("Enter operator");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+' -> System.out.println("Result = " + (number1 + number2));
            case '-' -> System.out.println("Result = " + (number1 - number2));
            case '*' -> System.out.println("Result = " + (number1 * number2));
            case '/' -> System.out.println("Result = " + (number1 / number2));
            case '%' -> System.out.println("Result = " + (number1 % number2));
            default -> System.out.println("Invalid operator");
        }

    }
}
