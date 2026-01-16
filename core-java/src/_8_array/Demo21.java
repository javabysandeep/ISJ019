package _8_array;

public class Demo21 {
    public static void main(String[] args) {
        int[][] arrayOfArray = {
                {1},
                {2, 3},
                {4, 5, 6},
                {7, 8, 9, 10},
        };
        for (int row = 0; row < arrayOfArray.length; row++) {
            for (int column = 0; column < arrayOfArray[row].length; column++) {
                System.out.print(arrayOfArray[row][column] + ", ");
            }
            System.out.println();
        }
        System.out.println("length of arrayOfArray =" + arrayOfArray.length);//4
        System.out.println("length of array 0 inside aa =" + arrayOfArray[0].length);//1
        System.out.println("length of array 0 inside aa =" + arrayOfArray[1].length);//2
        System.out.println("length of array 0 inside aa =" + arrayOfArray[2].length);//3
        System.out.println("length of array 0 inside aa =" + arrayOfArray[3].length);//4

    }
}
