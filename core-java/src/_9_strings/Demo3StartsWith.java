package _9_strings;

public class Demo3StartsWith {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd'};
        //check if it starts with ab
        char[] key = {'x', 'y'};
        boolean startsWith = true;
        for (int index = 0; index < key.length; index++) {
            if (key[index] != array[index]) {
                startsWith = false;
                break;
            }
        }
        System.out.println(startsWith ? "starts with" : "does not startwith");


    }
}
