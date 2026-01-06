package _5_oops._3_polymorphism;

public class Demo3 {
    public static void main(String[] args) {
        class Addition {
            //final and instance method overloading
            final int add(int number1, int number2) {
                return number1 + number2;
            }

            final int add(int number1, int number2, int number3) {
                return number1 + number2 + number3;
            }

            final float add(float number1, float number2) {
                return number1 + number2;
            }
        }

        Addition addition = new Addition();
        System.out.println(addition.add(10, 20));
        System.out.println(addition.add(10, 20, 30));
        System.out.println(addition.add(10.5f, 10.5f));

    }


}
