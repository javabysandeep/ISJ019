package _9_strings;

public class Demo2LowerCase {
    public static void main(String[] args) {
        char[] array = {'A', 'B', 'C', 'D'};
        //good morning
        for (int index = 0; index < array.length; index++) {
            if (array[index] >= 'A' && array[index] <= 'Z') {
                array[index] = (char) (array[index] + 32);
            }
        }
        for (char ch : array) {
            System.out.println(ch);
        }
    }
}
