package _2_controlStatements.forDemos;

public class Demo14FactorsSum {
    public static void main(String[] args) {
        // find the factors of 6
        /*
         *   6%1==0 --> true --> 1 is factor
         *   6%2==0 --> true --> 2 is factor
         *   6%3==0 --> true --> 3 is factor
         *   6%4==0 --> false --> 4 is not a factor
         *   6%5==0 --> false --> 5 is not a factor
         *
         * */

        int number = 28;
        int sum = 0;
        //range of factors 1 to number/2
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println("factor = " + i);
                sum = sum + i;
            }
        }
        System.out.println("sum of factors = " + sum);

        //perfect number [ sum of factors = given number]
        //e.g. 6 [1+2+3=6], 28[1+2+4+7+14=28]

        System.out.println(sum == number ? "its perfect" : "not a perfect");
    }
}
