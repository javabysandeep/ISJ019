package _8_array;

public class Demo2 {
    public static void main(String[] args) {
        //size is mandatory to specify
        //size 0 is also fine
        // negative size ---> NegativeArraySizeException
        //size data type ==> byte, short,int, char otherwise CTE

        int[] array2 = new int[0];//RTE NegativeArraySizeException
        System.out.println("array 2 length = " + array2.length);
        int[] array1 = new int[-5];//RTE NegativeArraySizeException
    }
}
