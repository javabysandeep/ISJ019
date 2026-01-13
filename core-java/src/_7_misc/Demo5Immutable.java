package _7_misc;

public class Demo5Immutable {

    public static void main(String[] args) {
        A a = new A(100,200);//x and y are final instance variables.
        a.setX(100);
        a.setY(200);
    }
}
