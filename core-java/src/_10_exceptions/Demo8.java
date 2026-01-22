package _10_exceptions;

public class Demo8 {
    public static void main(String[] args) {
        try {
            System.out.println("try");
            System.out.println(10 / 1);
        } finally {
            System.out.println("finally");
        }
        System.out.println("rest of the main");
        //try 10--> finally --> rest of the main
    }
}
