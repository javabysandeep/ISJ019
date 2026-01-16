package _8_array;

public class Demo6 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40};
        int sum = 0;
        for (int temp : array) {
            sum += temp;
        }
        System.out.println("sum of array elements = " + sum);
    }

}
