package _1_operators._4_increment;

public class Demo1 {
    public static void main(String[] args) {
        int a = 5;
        int b = ++a;
        System.out.println("a = " + a);//6
        System.out.println("b = " + b);//6

        int c = 5;
        int d = c++;
        System.out.println("c = " + c);//6
        System.out.println("d = " + d);//5

        int e = 5;
        int f = --e;
        System.out.println("e = " + e);//4
        System.out.println("f = " + f);//4

        int g = 5;
        int h = g--;
        System.out.println("g = " + g);//4
        System.out.println("h = " + h);//5
    }
}
