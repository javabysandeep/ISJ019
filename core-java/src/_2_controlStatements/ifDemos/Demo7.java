package _2_controlStatements.ifDemos;

import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = scanner.nextInt();
        //int year = 1900;
        /* year will be leap if
         *   1. year must be divisible by 4
         *   2. if year is century then it must be divisible by 400
         *
         * if a year is divisible by 400 then it must be divisible 4.
         *
         * 2000 ---> 400 ---> yes --> leap
         * 1600 --> 400 --> yes --> leap
         * 2100 ---> 400 --> No --> not a leap
         * e.g. 2000, 2024
         * */
        if (year % 400 == 0 || (year%4==0 && year%100!=0)) {
            System.out.println(year + " year is leap");
        } else {
            System.out.println(year + " year is not a leap");
        }

    }
}
