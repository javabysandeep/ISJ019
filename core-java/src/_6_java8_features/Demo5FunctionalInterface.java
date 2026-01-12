package _6_java8_features;

public class Demo5FunctionalInterface {
    public static void main(String[] args) {

        @FunctionalInterface
        interface MessageService {
            void sendMessage();//FISAM
            static void m1(){}
            static void m2(){}
            default void m3(){}
            default void m4(){}
        }
    }
}
