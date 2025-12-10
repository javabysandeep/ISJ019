package _2_controlStatements.forDemos;

public class Demo24Pattern {
    public static void main(String[] args) {
        /*

        5 5 5 5 5
		4 4 4 4
		3 3 3
		2 2
        1

         * */

        for (int row = 5; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row+" ");
            }

            System.out.println();
        }
    }
}
