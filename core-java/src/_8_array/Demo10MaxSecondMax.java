package _8_array;

public class Demo10MaxSecondMax {
    public static void main(String[] args) {
        int[] array = {98, 200, 30, 40, 99};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int temp : array) {
            if (temp > max) {
                secondMax = max;
                max = temp;
            }
            if (temp > secondMax && temp < max) {
                secondMax = temp;
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Second Max = " + secondMax);
    }
}
