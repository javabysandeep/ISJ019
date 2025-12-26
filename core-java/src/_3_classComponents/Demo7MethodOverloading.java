package _3_classComponents;

public class Demo7MethodOverloading {
    public static void main(String[] args) {
        System.out.println(add(10, 20));
        System.out.println(add(10, 20, 30));
        System.out.println(add(10, 20, 30, 40));
        System.out.println(add(10.0f, 20.15f));
        System.out.println(add(10, "string"));
    }

    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static int add(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    public static int add(int number1, int number2, int number3, int number4) {
        return number1 + number2 + number3 + number4;
    }

    public static float add(float number1, float number2) {
        return number1 + number2;
    }

    public static String add(int number1, String str) {
        return number1 + str;
    }
}
