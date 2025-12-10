package _1_operators._6_logical;

public class Demo2 {
    public static void main(String[] args) {
        int year = 2025;
        /* what is leap year ?
            must be divisible 4 and
            if it is a century then it must be divisible by 400
        e.g. 2024, 2000, 2400, 1600, 1200,
        not leap years ---> 1900, 2100, 2025
        * */

        System.out.println(

                (year % 400 == 0) ||
                        (year % 4 == 0 && year % 100 != 0)

        );
    }
}
