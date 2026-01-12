package _6_java8_features;

public class Demo12 {
    public static void main(String[] args) {
        interface Runnable {
            void run();
        }

        Runnable runnable = () -> System.out.println("running");
        runnable.run();

    }
}
