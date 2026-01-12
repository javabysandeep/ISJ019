package _6_java8_features;

public class Demo14 {
    public static void main(String[] args) {
        @FunctionalInterface
        interface Function {
            int process(int number);
        }

        //01. subclass using traditional way
        class FunctionImpl implements Function {
            @Override
            public int process(int number) {
                return number * number;
            }
        }
        Function function = new FunctionImpl();
        System.out.println("square = " + function.process(10));

        //02. subclass using anonymous way
        Function cube = new Function() {
            @Override
            public int process(int number) {
                return number * number * number;
            }
        };
        System.out.println("cube = " + cube.process(10));

        //03. subclass using lambda
        Function process = number -> number * number * number;
        System.out.println("cube = " + process.process(10));

        //04. subclass using method reference
        Function process1 = Demo14::customProcess;
        System.out.println("square = " + process1.process(10));

    }

    public static int customProcess(int number) {
        return number * number;
    }
}
