package _9_strings;

public class Demo4EndsWith {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd'};
        //check if it ends with cd
        char[] key = {'c', 'd'};
        boolean endsWith = true;
        int keyIndex = 0;
        for (int index = array.length - key.length; index < array.length; index++, keyIndex++) {
            if (key[keyIndex] != array[index]) {
                endsWith = false;
                break;
            }
        }
        System.out.println(endsWith ? "end with" : "does not end with");


    }
}
