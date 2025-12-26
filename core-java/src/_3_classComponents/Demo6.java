package _3_classComponents;

public class Demo6 {
    public static void main(String[] args) {
        Demo6 ref = new Demo6();
        sm();
        Demo6.sm();
        ref.sm();

        ref.im1();
        //this.im1(); // CTE - this is not applicable for static
    }

    public static void sm() {
        System.out.println("Demo6::sm - static method");
    }

    public void im1() {
        System.out.println("Demo6::im1 - instance method");
        this.im2();
        im2();
    }

    public void im2() {
        System.out.println("Demo6::im2 - instance method");
    }
}
