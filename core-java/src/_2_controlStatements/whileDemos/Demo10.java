package _2_controlStatements.whileDemos;

public class Demo10 {
    public static void main(String[] args) {
        //find the sum of digits of the given number
        int number = 123;
        int sum = 0;
        int digit ;

        digit = number%10; // 123%10 ---> 3
        sum = sum + digit;
        number = number /10; // 123/10 ---> 12

        digit = number%10; // 12%10 ---> 2
        sum = sum + digit;
        number = number /10; // 12/10 ---> 1


        digit = number%10; // 1%10 ---> 1
        sum = sum + digit;
        number = number /10; //1 /10 ----> 0

        System.out.println("sum of digits  = "+sum);



    }
}
