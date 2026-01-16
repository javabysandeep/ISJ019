package _8_array;

public class Demo5 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(array[0]);//1
        System.out.println(array[1]);//2
        System.out.println(array[2]);//3
        System.out.println(array[3]);//4
        System.out.println(array[4]);//5

        System.out.println("using for loop");
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }

        System.out.println("using enhanced for loop");
        for (int temp: array) {
            System.out.println(temp);
        }
    }
}
