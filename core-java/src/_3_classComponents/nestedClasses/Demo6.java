package _3_classComponents.nestedClasses;

public class Demo6 {
    public static void main(String[] args) {
        class LocalInnerClass {
            int instanceVariable = 100;

            void instanceMethod() {
                System.out.println("LocalInnerClass::instance method");
            }

        }
        LocalInnerClass ref = new LocalInnerClass();
        System.out.println(ref.instanceVariable);
        ref.instanceMethod();
    }
}
