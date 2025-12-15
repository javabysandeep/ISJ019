package _2_controlStatements.forDemos;

public class Demo20Pattern {
    /*

     *
     **
     ***
     ****
     *****

     */

    public static void main(String[] args) {

        System.out.println("using only SOP");
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");

        System.out.println("using for loops");

        for (int row = 1; row <= 5; row++) {

            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
