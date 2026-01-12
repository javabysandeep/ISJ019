package _6_java8_features;

public class Demo11 {
    public static void main(String[] args) {
        @FunctionalInterface
        interface NumberProcessor {
            int process(int number);
        }

        /*
        concrete subclass of functional interface
        where method is defined.
        object of subclass is created
        and stored using parent class reference
         */
        NumberProcessor square = number -> number * number;
        System.out.println("square = " + square.process(10));


        NumberProcessor cuber = number -> number * number*number;
        System.out.println("cube = " + cuber.process(10));

    }
}
