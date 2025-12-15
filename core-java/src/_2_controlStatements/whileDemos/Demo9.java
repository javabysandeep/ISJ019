package _2_controlStatements.whileDemos;

public class Demo9 {
    public static void main(String[] args) {
        //find the factorial of a given number using while loop
        //5! = 1 * 2 * 3 * 4 *5 = 120
        int number = 5;
        int i = 1;
        int result = 1;
        while (i <= number) {
            result = result * i;
            i++;
        }
        System.out.println("factorial = " + result);
    }
}
