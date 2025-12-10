package _2_controlStatements.ifDemos;

public class Demo5 {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;
        int number3 = 40;


        if (number1 > number2 && number1 > number3) System.out.println(number1 + " is max");
        if (number2 > number1 && number2 > number3) System.out.println(number2 + " is max");
        if (number3 > number1 && number3 > number2) System.out.println(number3 + " is max");
    }
}
