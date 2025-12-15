package _2_controlStatements.whileDemos;

public class Demo12Reverse {
    public static void main(String[] args) {
        //reverse the given number
        int number = 452;
        int result = 0;
        int digit;

        while (number > 0) {
            digit = number % 10;
            result = result * 10 + digit;
            number = number / 10;
        }

        System.out.println("reverse  = " + result);


    }
}
