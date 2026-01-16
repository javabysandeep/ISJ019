package _8_array;

public class Demo13ArrayEquality {
    public static void main(String[] args) {
        int[] array1 = {98, 200, 300, 40, 999};
        int[] array2 = {98, 200, 300, 40, 89};
        System.out.println(arrayEquals(array1, array2));
    }

    private static boolean arrayEquals(int[] array1, int[] array2) {
        //01. null check
        if (array1 == null || array2 == null) {
            return false;
        }

        //02. length check
        if (array1.length != array2.length) {
            return false;
        }


        //03. element check
        for (int index = 0; index < array1.length; index++) {
            if (array1[index] != array2[index]) {
                return false;
            }
        }
        return true;
    }
}
