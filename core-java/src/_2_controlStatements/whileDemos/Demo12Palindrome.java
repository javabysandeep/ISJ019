package _2_controlStatements.whileDemos;

public class Demo12Palindrome {
    public static void main(String[] args) {
        //reverse of the given number = given number
        //e.g. 121 = 121 ---> palindrome

        int number = 456;
        int originalNumber = number;
        int reverse = 0;
        int digit;

        while (number > 0) {
            digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        System.out.println("reverse  = " + reverse);
        System.out.println(reverse == originalNumber ? "palindrome" : "not a palindrome");


    }
}
