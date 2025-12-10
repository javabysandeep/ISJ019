package _2_controlStatements.forDemos;

import java.util.Scanner;

public class Demo15Factorial {
    public static void main(String[] args) {
        /*
         *  5! = 1 * 2 * 3 * 4 * 5 or 5 * 4 * 3 * 2 * 1
         * 5! = 120
         * */
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        System.out.println("factorial of " + number + " is " + result);


    }
}
