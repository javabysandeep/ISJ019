package _10_exceptions;

public class Demo6 {
    public static void main(String[] args) {
        try {
            System.out.println("try");
            System.out.println(10 / 0);
        } catch (Exception ex) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
        //try -->catch--> finally
    }
}
