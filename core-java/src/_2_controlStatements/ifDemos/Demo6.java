package _2_controlStatements.ifDemos;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
       /* int number1 = 10;
        int number2 = 20;
        int number3 = 40;*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println(number1 + " is max");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println(number2 + " is max");
        } else {
            System.out.println(number3 + " is max");
        }
    }
}
