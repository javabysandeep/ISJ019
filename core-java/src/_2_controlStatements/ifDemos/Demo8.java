package _2_controlStatements.ifDemos;

public class Demo8 {
    public static void main(String[] args) {
        //check if the number is divisible by 5 and 11

        int number = 50;
        if (number % 5 == 0 && number % 11 == 0) {
            System.out.println(number + " number is divisible by 5 and 11");
        } else {
            System.out.println(number + " number is not divisible by 5 and 11");
        }
    }
}
