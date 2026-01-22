package _10_exceptions;

public class Demo5 {
    public static void main(String[] args) {
        try {
            System.out.println("try");
        } catch (Exception ex) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
        //try --> finally
    }
}
