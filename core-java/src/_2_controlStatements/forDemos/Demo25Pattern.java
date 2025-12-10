package _2_controlStatements.forDemos;

public class Demo25Pattern {
    public static void main(String[] args) {
        /*

        1 2 3 4 5
		1 2 3 4
		1 2 3
		1 2
		1


         * */

        for (int row = 5; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }

            System.out.println();
        }
    }
}
