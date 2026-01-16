package _8_array;

public class Demo17ShiftElements {
    public static void main(String[] args) {
        int[] array = {1, 0, 0, 1, 0, 1};
        int zeroCount = 0;
        int oneCount = 0;
        System.out.println("before shifting elements");
        for (int temp : array) {
            System.out.print(temp + ", ");
            if (temp == 0) {
                zeroCount++;
            }
            if (temp == 1) {
                oneCount++;
            }
        }

        for (int index = 0; index < oneCount; index++) {
            array[index] = 1;
        }
        for (int index = oneCount; index < array.length; index++) {
            array[index] = 0;
        }


        System.out.println("\nAfter shifting elements");
        for (int temp : array) {
            System.out.print(temp + ", ");
        }


    }
}
