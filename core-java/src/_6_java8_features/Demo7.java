package _6_java8_features;

public class Demo7 {
    public static void main(String[] args) {
        //01. creating a concrete subclass of a concrete parent class using traditional way
        class A{}
        class B extends A{}
        A a = new B();

        //02. creating a concrete subclass of a concrete parent class using anonymous way
        class A1{}
        A1 a1 = new A1(){};


        //03. creating a concrete subclass of a abstract parent class using traditional way
        abstract class A2{}
        class B2 extends A2{}
        A2 a2 = new B2();

        //04. creating a concrete subclass of a abstract parent class using anonymous way
        class A3{}
        A3 a3 = new A3(){};


        //05. creating a concrete subclass of a normal interface parent class using traditional way
        interface I1{}
        class I1Impl implements I1{}

        //04. creating a concrete subclass of a normal interface parent class using anonymous way
        interface I2{}
       I2 i2 = new I2(){};

    }
}
