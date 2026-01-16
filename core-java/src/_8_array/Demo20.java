package _8_array;

public class Demo20 {
    public static void main(String[] args) {
        int[][] arrayOfArray = {
                {1},
                {2, 3},
                {4, 5, 6},
                {7, 8, 9, 10},
        };
        for (int[] array : arrayOfArray) {
            for (int temp : array) {
                System.out.print(temp + ", ");
            }
            System.out.println();
        }

    }
}
