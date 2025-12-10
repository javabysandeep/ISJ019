package _2_controlStatements.switchDemos;

public class Demo5 {
    public static void main(String[] args) {
        int digit = 2;

        //from java 12 : break is implicitly added after each case statements
        switch (digit) {
            case 0 -> System.out.println("zero");
            case 1 -> System.out.println("one");
            case 2 -> System.out.println("two");
            case 3 -> System.out.println("three");
            case 4 -> System.out.println("four");
            case 5 -> System.out.println("five");
            case 6 -> System.out.println("six");
            case 7 -> System.out.println("seven");
            case 8 -> System.out.println("eight");
            case 9 -> System.out.println("nine");
            default -> System.out.println("invalid input");
        }


    }

}
