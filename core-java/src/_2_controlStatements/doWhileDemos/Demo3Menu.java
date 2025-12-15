package _2_controlStatements.doWhileDemos;

import java.util.Scanner;

public class Demo3Menu {
    public static void main(String[] args) {
        System.out.println("enter the choice");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        do {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            switch (choice) {
                case 1 -> System.out.println("Addition");
                case 2 -> System.out.println("Subtraction");
                case 3 -> System.out.println("Multiplication");
                case 4 -> System.out.println("Division");
            }
            System.out.println("enter the choice");
            choice = scanner.nextInt();
        } while (choice != 5);
    }
}
