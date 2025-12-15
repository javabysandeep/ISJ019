package _2_controlStatements.forDemos;

public class Demo18RangeOfPerfect {
    public static void main(String[] args) {

        for (int number = 1; number <= 10000; number++) {

            //check if the number is perfect or not
            int sumOfFactors = 0;
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sumOfFactors = sumOfFactors + i;
                }
            }
            if (sumOfFactors == number) {
                System.out.println("perfect number = " + number);
            }

        }
    }
}

/*output
*
    perfect number = 6
    perfect number = 28
    perfect number = 496
    perfect number = 8128
* */
