package _8_array;

public class Demo4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(array);//hashcode
        System.out.println(array[0]);//1
        array[0]=11;
        System.out.println(array[0]);//1
        System.out.println(array[1]);//2
        System.out.println(array[2]);//3
        System.out.println(array[3]);//4
        System.out.println(array[4]);//5
        System.out.println(array[5]);//RTE -- ArrayIndexOutOfBoundsException
    }
}
