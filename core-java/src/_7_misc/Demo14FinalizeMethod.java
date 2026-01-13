package _7_misc;

public class Demo14FinalizeMethod {
    public static void main(String[] args) {
        class A {
            @Override
            protected void finalize() throws Throwable {
                System.out.println("finalize() will be called by GC before deleting the object");
            }

        }
        A ref1 = new A();
        ref1 = null;
        System.gc();

    }
}
