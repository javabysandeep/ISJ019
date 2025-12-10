package _1_operators._6_logical;

public class Demo4 {
    public static void main(String[] args) {

        //& and | are bitwise operators
        System.out.println(10 % 2 == 1 & 10 / 0 == 5);//AE
        System.out.println(10 % 2 == 0 | 10 / 0 == 5);//AE

    }
}
