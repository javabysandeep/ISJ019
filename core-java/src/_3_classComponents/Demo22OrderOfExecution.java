package _3_classComponents;

public class Demo22OrderOfExecution {
    public static void main(String[] args) {
        class Parent {

            static {
                System.out.println("Parent::static block");
            }

            {
                System.out.println("Parent::instance  block");
            }

            Parent() {
                //1. call to the super class constructor or same class
                //2. instance block of same class
                //3. rest of the code inside the constructor
                super();
                System.out.println("Parent::Constructor");
            }
        }
        class Child extends Parent{

            static {
                System.out.println("Child::static block");
            }

            {
                System.out.println("Child::instance  block");
            }

            Child() {
                //1. call to the super class constructor or same class
                //2. instance block of same class
                //3. rest of the code inside the constructor
                super();
                System.out.println("Child::Constructor");
            }
        }
        Child child = new Child();
        //1. static block
        //2. instance block
        //3. constructor
    }
}
