package _3_classComponents.nestedClasses;

public class Demo3 {

    public static class StaticNested {
        //iv, im, ib, con, ic
        //sv, sm, sb, snc
        int instanceVariable = 100;
        static int staticVariable = 200;

        void instanceMethod() {
            System.out.println("StaticNested ::instanceMethod");
        }

        static void staticMethod() {
            System.out.println("StaticNested ::staticMethod");
        }

        {
            System.out.println("StaticNested::instance block");
        }

        static {
            System.out.println("StaticNested::static block");
        }

    }

    public static void main(String[] args) {
        //access members of static nested class : [static, non-static]
        System.out.println("access static members of static nested class");
        System.out.println("static variable of Static NestedClass " + Demo3.StaticNested.staticVariable);
        Demo3.StaticNested.staticMethod();


        System.out.println("access non-static members of static nested class");
        Demo3.StaticNested ref = new Demo3.StaticNested();
        System.out.println("non-static variable of static nested class "+ref.instanceVariable);
        ref.instanceMethod();

    }
}
