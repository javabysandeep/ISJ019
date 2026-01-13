package _7_misc;

public class Demo11HashCodeMethod {
    public static void main(String[] args) {
        class A {
        }
        A ref1 = new A();
        System.out.println(ref1.hashCode());//1595428806 ----> object address

        System.out.println(Integer.toBinaryString(8));
        System.out.println(Integer.toOctalString(8));
        System.out.println(Integer.toHexString(100));

        //converting decimal[1595428806] hashCode into hexadecimal[5f184fc6]
        System.out.println(Integer.toHexString(ref1.hashCode()));//5f184fc6

    }
}
