package _6_java8_features;

public class Demo13 {
    public static void main(String[] args) {

        @FunctionalInterface
        interface Predicate {
            boolean test(int number);
        }
        Predicate predicate = number -> number % 2 == 0;
        System.out.println("is even " + predicate.test(12));//true
        System.out.println("is even " + predicate.test(13));//false

    }
}
