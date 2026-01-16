package _8_array;

public class Demo12LinearSearch {
    public static void main(String[] args) {
        int[] array = {98, 200, 300, 40, 999};
        int key = 99;
        boolean isFound = false;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == key) {
                isFound = true;
                break;
            }
        }
        System.out.println(isFound ? "found" : "not found");

    }
}
