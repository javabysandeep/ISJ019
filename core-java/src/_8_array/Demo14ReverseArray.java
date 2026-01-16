package _8_array;

public class Demo14ReverseArray {
    public static void main(String[] args) {
        int[] array = {98, 200, 300, 40, 999};

        //printing in reverse and not modifying the existing array
        for (int index = array.length - 1; index >= 0; index--) {
            System.out.print(array[index] + " ");
        }

        //using another array
        int[] arrayCopy = new int[array.length];
        int copyIndex = 0;
        for (int index = array.length - 1; index >= 0; index--) {
            arrayCopy[copyIndex] = array[index];
            copyIndex++;
        }

        //printing arrayCopy
        System.out.println("\nprinting arrayCopy");
        for (int index = 0; index < arrayCopy.length; index++) {
            System.out.print(arrayCopy[index] + " ");
        }


    }
}
