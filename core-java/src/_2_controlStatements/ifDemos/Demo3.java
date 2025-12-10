package _2_controlStatements.ifDemos;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        //to check if the number is even or odd
        Scanner scanner = new Scanner(System.in);
        //int number = 10;
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        if (number % 2 == 0) System.out.println(number + " is an even number");

        if (number % 2 == 1) System.out.println(number + " is an odd number");

    }
}
