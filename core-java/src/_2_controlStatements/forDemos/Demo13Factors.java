package _2_controlStatements.forDemos;

public class Demo13Factors {
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
        //range of factors 1 to number/2
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println("factor = " + i);
            }
        }
    }
}
