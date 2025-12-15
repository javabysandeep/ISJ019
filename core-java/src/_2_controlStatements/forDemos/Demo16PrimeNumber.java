package _2_controlStatements.forDemos;

import java.util.Scanner;

public class Demo16PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();//17
        boolean isPrime = true;

        //2,3,4,5,6,7,8 = 7 iterations
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "its a prime" : "its not a prime");
    }
}
