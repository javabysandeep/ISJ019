package _8_array;

public class Demo11MinSecondMin {
    public static void main(String[] args) {
        int[] array = {98, 200, 30, 40, 99};
        int minValue = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int temp : array) {
            if (temp < minValue) {
                secondMin = minValue;
                minValue = temp;
            }
            if (temp < secondMin && temp > minValue) {
                secondMin = temp;
            }
        }
        System.out.println("Min = " + minValue);
        System.out.println("Second Min = " + secondMin);
    }
}
