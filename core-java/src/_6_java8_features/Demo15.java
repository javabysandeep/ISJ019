package _6_java8_features;

public class Demo15 {
    public static void process1() {
        System.out.println("Demo15::static method : process1");
    }

    public void process2() {
        System.out.println("Demo15::instance method : process2");
    }

    public Demo15() {
        System.out.println("Demo15::constructor");
    }

    public static void main(String[] args) {
        @FunctionalInterface
        interface Processor {
            void process();
        }

        // Processor processor = Demo15::process1;
        //Processor processor = Demo15::new;
        Demo15 ref = new Demo15();
        Processor processor = ref::process2;
        processor.process();
    }


}
