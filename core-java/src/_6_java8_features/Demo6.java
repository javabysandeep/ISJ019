package _6_java8_features;

public class Demo6 {
    public static void main(String[] args) {

        interface Parent {
            default void m1() {
                System.out.println("Parent ::m1");
            }
        }

        //01. creating subclass of a concrete class using traditional way
        class Child implements Parent {
        }
        Parent parent = new Child();
        parent.m1();

        //02. creating subclass of a concrete class using anonymous class
        //parent class reference = object of subclass anonymous class.
        Parent parent1 = new Parent() {
            //class body definition using anonymous class
        };
        parent1.m1();

    }
}
