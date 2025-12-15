package _2_controlStatements.whileDemos;

public class Demo11 {
    public static void main(String[] args) {
        //find the sum of digits of the given number
        int number = 123456789;
        int sum = 0;
        int digit;

        while (number > 0) {
            digit = number % 10; //1%10 ---> digit = 1
            sum = sum + digit; // 5+1 --- > sum = 6
            number = number / 10; // 1/10 --> number = 0
        }

        System.out.println("sum of digits  = " + sum);


    }
}
