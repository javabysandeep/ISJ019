package _6_java8_features;

public class Demo8 {
    public static void main(String[] args) {

        @FunctionalInterface
        interface NumberProcessor {
            int process(int number);
        }

        //01. traditional way
        class NumberProcessorImpl implements NumberProcessor {
            @Override
            public int process(int number) {
                return number * number;
            }
        }
        NumberProcessor traditionalWay = new NumberProcessorImpl();
        System.out.println("traditional way " + traditionalWay.process(10));//100

        //02. anonymous class
        NumberProcessor anonymousWay = new NumberProcessor() {
            @Override
            public int process(int number) {
                return number * number;
            }
        };
        System.out.println("anonymous way " + anonymousWay.process(10));//100

        //03. lambda expression
        NumberProcessor lambda = number -> number * number;
        System.out.println("lambda way " + lambda.process(10));//100

    }
}
