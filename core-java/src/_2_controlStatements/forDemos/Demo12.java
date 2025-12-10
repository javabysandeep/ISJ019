package _2_controlStatements.forDemos;

public class Demo12 {
    public static void main(String[] args) {
        //find the sum of n numbers --> 1 to 100
        int sum = 0;
        int n = 100;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
        System.out.println("sum using math=" + (n * (n + 1) / 2));

    }
}
