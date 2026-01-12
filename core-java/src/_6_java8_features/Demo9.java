package _6_java8_features;

public class Demo9 {
    public static void main(String[] args) {
        interface A {
            void m1();
        }
        //01. traditional way
        class AImpl implements A {
            @Override
            public void m1() {
                System.out.println("AImpl::m1");
            }
        }
        A a = new AImpl();
        a.m1();

        //02. anonymous class
        A a1 = new A() {
            @Override
            public void m1() {
                System.out.println("Anonymous::m1");
            }
        };
        a1.m1();

        //03. Lambda expression
        A a2 = () -> System.out.println("Anonymous::m1");
        a2.m1();
    }
}
