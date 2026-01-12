package _6_java8_features;

public class Demo3 {
    public static void main(String[] args) {
        interface A {
            default void m1() {
                System.out.println("default method of interface A");
            }
        }

        interface B {
            default void m1() {
                System.out.println("default method of interface B");
            }
        }

        class C implements A, B{
            @Override
            public void m1() {
                A.super.m1();
                B.super.m1();
            }
        }

        C c = new C();
        c.m1();


    }
}
