package _8_array;

public class Demo9MinElement {
    public static void main(String[] args) {
        int[] array = {99, 200, 30, 40};//40
        int min = array[0];

        for (int temp : array) {
            if (temp < min) {
                min = temp;
            }
        }

        System.out.println("min element = " + min);
    }
}
