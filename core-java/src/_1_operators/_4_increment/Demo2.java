package _1_operators._4_increment;

public class Demo2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        System.out.println(++a + ++b + a++ + b++ + c--); //13
        System.out.println(a); //3
        System.out.println(b); //4
        System.out.println(c); //2

    }
}
