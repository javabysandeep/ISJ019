package _1_operators._1_arithmetic;

public class Demo8 {
    public static void main(String[] args) {
        int a = 10;
        //a = a + 5;  //15 ---------> a +=5
        a += 5;  //15
        System.out.println("a = " + a);

        int b = 10;
        //b =b - 5; //5
        b -= 5;//5
        System.out.println("b = " + b);

        int c = 10;
        //c = c * 5; //50
        c *= 5; //50
        System.out.println("c = " + c);

        int d = 10;
        d /= 5;
        System.out.println("d = " + d);

        int e = 10;
        e %= 5;
        System.out.println("e = " + e);

    }
}
