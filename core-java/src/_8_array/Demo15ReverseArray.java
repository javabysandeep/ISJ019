package _8_array;

public class Demo15ReverseArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        System.out.println("before reversing");
        for (int temp : array) {
            System.out.print(temp + ", ");
        }

        int left = 0;
        int right = array.length - 1;//4
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        System.out.println("\nAfter reversing");
        for (int temp : array) {
            System.out.print(temp + ", ");
        }


    }
}
