package _7_misc;

public class Demo3FinalMethod {
    public static void main(String[] args) {
        class Parent {
            final void m1() {
                System.out.println("Parent::m1");
            }
        }
        class Child extends Parent {
            //final methods cannot be overridden --> CTE
          /*  @Override
            void m1() {
                System.out.println("Child::m1");
            }*/
        }
        Parent parent = new Child();
        parent.m1();

    }
}
