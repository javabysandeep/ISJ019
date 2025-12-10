package _1_operators._6_logical;

public class Demo5 {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a > 3 || a % 0 == 0);//true
        //System.out.println(a > 3 | a % 0 == 0);//AE
        System.out.println(true || true && false);//true
        System.out.println(false || true && false);//false
    }
}
