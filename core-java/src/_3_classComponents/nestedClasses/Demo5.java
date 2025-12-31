package _3_classComponents.nestedClasses;

public class Demo5 {
    class Inner {
        //static members are not allowed till java 12.
      /*  static int a= 20;
        static void m1(){}
        static {}
        static class A{}*/
        int instanceVariable = 100;

        void instanceMethod() {
            System.out.println("Inner::instance method");
        }
    }

    public static void main(String[] args) {
        Demo5 outer = new Demo5();
        Inner inner = outer.new Inner();
        System.out.println("instance variable = " + inner.instanceVariable);
        inner.instanceMethod();
    }
}
