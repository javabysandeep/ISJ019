package _2_controlStatements.whileDemos;

public class Demo8 {
    public static void main(String[] args) {
        //sum of 1 to n numbers using while loop
        int n = 50;
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println("sum of n numbers is = " + sum);
    }
}
