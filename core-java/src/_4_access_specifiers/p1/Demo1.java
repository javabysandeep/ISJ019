package _4_access_specifiers.p1;

public class Demo1 {
    public static void main(String[] args) {

        // both A and Demo1 are in package p1
        A a = new A();
        //System.out.println("x=" + a.x);//x is private
        System.out.println("y=" + a.y); //y is default
        System.out.println("z=" + a.z);// z is protected
        System.out.println("w="+a.w);//w is public
    }
}
