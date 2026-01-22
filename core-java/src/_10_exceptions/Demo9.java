package _10_exceptions;

public class Demo9 {
    public static void main(String[] args) {
        try {
            System.out.println("try");
            System.out.println(10 / 1);
            System.exit(0);//stops the program
        } finally {
            System.out.println("finally");
        }
        System.out.println("rest of the main");
        //try 10--> program stops
    }
}
