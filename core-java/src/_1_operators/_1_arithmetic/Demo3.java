package _1_operators._1_arithmetic;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println('A' + 'A'); //130
        System.out.println('A' + 5); //70
        System.out.println('A' - 'A');//0
        System.out.println('A' - 5);//60

        System.out.println(2025 % 400); //25
        System.out.println(2025 % 100); //25
        System.out.println(2025 % 4);//1


        // digit separation
        System.out.println(123 % 10); //3
        System.out.println(123 / 10); //12

        System.out.println(12 % 10); //2
        System.out.println(12 / 10); //1

        System.out.println(1 % 10); //1
        System.out.println(1 / 10); //0

    }
}
