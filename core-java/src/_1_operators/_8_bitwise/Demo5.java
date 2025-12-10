package _1_operators._8_bitwise;

public class Demo5 {
    public static void main(String[] args) {
        System.out.println("******* bitwise left shift *********");
        System.out.println(4 << 1);//8
        System.out.println(4 << 2);//16
        System.out.println(4 << 3);//32
        System.out.println(4 << 4);//64
        System.out.println(4 << 5);//128

        System.out.println("******* bitwise right shift *********");
        System.out.println(4 >> 1);//2
        System.out.println(4 >> 2);//1
        System.out.println(4 >> 3);//0
        System.out.println(4 >> 4);//0
        System.out.println(4 >> 5);//0
    }
}
