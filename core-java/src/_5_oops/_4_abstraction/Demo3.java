package _5_oops._4_abstraction;

public class Demo3 {
    public static void main(String[] args) {

        abstract class A {
            abstract void m1();
        }

        class B extends A {
            @Override
            void m1() {
                System.out.println("m1 overidden in B");
            }
        }
        A a = new B();
        a.m1();

    }
}
