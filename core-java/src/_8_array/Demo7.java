package _8_array;

public class Demo7 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40};
        System.out.println("index 0 to length-1");
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + ", ");
        }

        System.out.println("index length-1 to 0\n");
        for (int index = array.length - 1; index >= 0; index--) {
            System.out.print(array[index] + ", ");
        }
    }
}
