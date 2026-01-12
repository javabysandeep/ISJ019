package _6_java8_features;

public class Demo4 {
    public static void main(String[] args) {

        interface A {
            static void m1() {
                System.out.println("static method of interface A");
            }
        }

        A.m1();


    }
}
