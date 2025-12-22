package _0_introduction;

public class DataTypeDemo {

	//args ---> local reference variable
    public static void main(String[] args) {
		System.out.println(System.identityHashCode(args));
        System.out.println("int data type range");
        System.out.println("min = " + Integer.MIN_VALUE);
        System.out.println("max = " + Integer.MAX_VALUE);
    }
}

