package _1_operators._8_bitwise;

public class Demo3 {
    public static void main(String[] args) {
        //System.out.println(4 && 5);//CTE : logical needs boolean type input
        System.out.println("bitwise and &");
        System.out.println(4 & 5); //4
        // 4 ------------> 1 0 0
        // 5 ------------> 1 0 1
        // 4 <-----------> 1 0 0

        System.out.println("bitwise or |");
        System.out.println(4 | 5); //5
        // 4 ------------> 1 0 0
        // 5 ------------> 1 0 1
        // 5 <-----------> 1 0 1

        System.out.println("bitwise xor ^");
        System.out.println(4 ^ 5); //1
        // 4 ------------> 1 0 0
        // 5 ------------> 1 0 1
        // 1 <-----------> 0 0 1
    }
}
