package _10_exceptions;

public class Demo1 {
    public static void main(String[] args) {
        int[] array = {};
        //System.out.println(array[0]);//RTE - > ArrayIndexOutOfBoundsException
        //System.out.println(10 / 0);//RTE - ArithmeticException / by zero
        //int[] array1 = new int[-1];//RTE -NegativeArraySizeException
        String str = null;
        System.out.println(str.length());//RTE - NullPointerException
    }
}
