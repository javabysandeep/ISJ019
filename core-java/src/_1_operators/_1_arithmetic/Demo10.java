package _1_operators._1_arithmetic;

public class Demo10 {
    public static void main(String[] args) {
        int number = 123456789;
        int sumOfDigits = 0;
        int digit = 0;

        while (number > 0) {
            digit = number % 10;
            sumOfDigits += digit; //sumOfDigits = sumOfDigits + digit;
            number /= 10; //number = number / 10;

        }

        System.out.println("Sum of digits: " + sumOfDigits);


    }
}
