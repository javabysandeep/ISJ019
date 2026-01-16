package _8_array;

public class Demo19 {
    public static void main(String[] args) {
        int[][] arrayOfArray = {
                {1},
                {2, 3},
                {4, 5, 6},
                {7, 8, 9, 10},
        };
        for (int temp : arrayOfArray[0]) {
            System.out.print(temp + ",");
        }
        System.out.println();
        for (int temp : arrayOfArray[1]) {
            System.out.print(temp + ",");
        }
        System.out.println();
        for (int temp : arrayOfArray[2]) {
            System.out.print(temp + ",");
        }
        System.out.println();
        for (int temp : arrayOfArray[3]) {
            System.out.print(temp + ",");
        }
        System.out.println();
    }
}
