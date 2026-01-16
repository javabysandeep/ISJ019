package _8_array;

public class Demo18 {
    public static void main(String[] args) {
        int[][] arrayOfArray = {
                {1},
                {2, 3},
                {4, 5, 6},
                {7, 8, 9, 10},
        };
        System.out.println(arrayOfArray);//hashcode
        System.out.println(arrayOfArray[0]);//hashcode
        System.out.println(arrayOfArray[1]);//hashcode
        System.out.println(arrayOfArray[2]);//hashcode
        System.out.println(arrayOfArray[3]);//hashcode
        System.out.println("printing array elements");
        System.out.println(arrayOfArray[0][0]);//1
        System.out.println(arrayOfArray[1][0]);//2
        System.out.println(arrayOfArray[1][1]);//3
        System.out.println(arrayOfArray[2][0]);//4
        System.out.println(arrayOfArray[2][1]);//5
        System.out.println(arrayOfArray[2][2]);//6
        System.out.println(arrayOfArray[3][0]);//7
        System.out.println(arrayOfArray[3][1]);//8
        System.out.println(arrayOfArray[3][2]);//9
        System.out.println(arrayOfArray[3][3]);//10
    }
}
