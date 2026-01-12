package _6_java8_features;

public class Demo10 {
    public static void main(String[] args) {
        interface B {
            void m1(int number);
        }

        //01. traditional way
        class BImpl implements B {
            @Override
            public void m1(int number) {
                System.out.println("m1");
            }
        }
        B b1 = new BImpl();
        b1.m1(10);

        //02. anonymous way
        B b2 = new B() {
            @Override
            public void m1(int number) {
                System.out.println("m1");
            }
        };
        b2.m1(10);


        //create subclass using lambda expression
        B b3 = number -> System.out.println("m1");
        b3.m1(10);

    }
}
