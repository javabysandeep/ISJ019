package _10_exceptions;

public class Demo7 {
    public static void main(String[] args) {
        try {
            System.out.println("try");
            System.out.println(10 / 0);
        } finally {
            System.out.println("finally");
        }
        System.out.println("rest of the main");
        //try --> finally --> abnormal termination
    }
}
