package _7_misc;

public class Demo10HashCodeMethod {
    public static void main(String[] args) {
        class A {
        }
        A ref1 = new A();
        A ref2 = new A();
        ref1 = ref2;
        System.out.println(ref1.hashCode());//1595428806 ----> object address
        System.out.println(ref2.hashCode());//1595428806 ----> object address
    }
}
