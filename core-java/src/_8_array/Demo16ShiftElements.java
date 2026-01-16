package _8_array;

public class Demo16ShiftElements {
    public static void main(String[] args) {
        int[] array = {1, 0, 0, 1, 0, 1};
        System.out.println("before shifting elements");
        for (int temp : array) {
            System.out.print(temp + ", ");
        }

        int left = 0;
        for (int right = 0; right < array.length; right++) {
            if (array[right] != 0) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
            }
        }


        System.out.println("\nAfter shifting elements");
        for (int temp : array) {
            System.out.print(temp + ", ");
        }


    }
}
