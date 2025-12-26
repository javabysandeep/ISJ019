package _3_classComponents;

public class B {
    public static void m1() {
        //call A class methods here
        A ref= new A();
        A.m1();
        ref.m1();

        ref.m2();
    }

    public void m2() {
        //call A class methods here
        A ref= new A();
        A.m1();
        ref.m1();

        ref.m2();
    }
}
