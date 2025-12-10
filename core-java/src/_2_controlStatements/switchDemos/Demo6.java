package _2_controlStatements.switchDemos;

public class Demo6 {
    public static void main(String[] args) {
        int digit = 9;

        //from java 12 : break is implicitly added after each case statements
        //from java 12 : switch can return the value also
        String result = switch (digit) {
            case 0 -> "zero";
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            case 6 -> "six";
            case 7 -> "seven";
            case 8 -> "eight";
            case 9 -> "nine";
            default -> "invalid input";
        };
        System.out.println(result);


    }

}
