package _7_misc;

public class Demo4FinalClass {
    public static void main(String[] args) {
        final class Parent {
            final void m1() {
                System.out.println("Parent::m1");
            }
        }
        //class Child extends Parent { }//CTE --> final classes cannot be extended

    }
}
