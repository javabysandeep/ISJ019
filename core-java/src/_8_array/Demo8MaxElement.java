package _8_array;

public class Demo8MaxElement {
    public static void main(String[] args) {
        int[] array = {99, 200, 30, 40};//40
        int max = array[0];

        for (int temp : array) {
            if (temp > max) {
                max = temp;
            }
        }

        System.out.println("max element = " + max);
    }
}
