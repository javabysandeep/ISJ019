package _2_controlStatements.forDemos;

public class Demo26Pattern {
    public static void main(String[] args) {
        /*
    1
	1 0
	1 0 1
	1 0 1 0
    1 0 1 0 1

        * */

        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col % 2 == 1 ? "1 " : "0 ");
            }
            System.out.println();
        }

    }
}
