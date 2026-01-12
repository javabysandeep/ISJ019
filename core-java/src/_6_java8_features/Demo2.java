package _6_java8_features;

public class Demo2 {
    public static void main(String[] args) {
        interface I1 {
            void m1();

            //default method
            default void m2() {
                System.out.println("Default method of I1");
            }
        }
        class A implements I1 {
            @Override
            public void m1() {
                System.out.println("A::m1");
            }
        }
        class B implements I1 {
            @Override
            public void m1() {
                System.out.println("B::m1");
            }
        }
        class C implements I1 {
            @Override
            public void m1() {
                System.out.println("C::m1");
            }
        }
        class D implements I1 {
            @Override
            public void m1() {
                System.out.println("D::m1");
            }
        }
        //.....1 lac implementation

        I1 a = new A();
        I1 b = new B();
        I1 c = new C();
        I1 d = new D();
        a.m1();
        b.m1();
        c.m1();
        d.m1();

        a.m2();
        b.m2();
        c.m2();
        d.m2();

    }
}
