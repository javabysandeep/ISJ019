package _2_controlStatements.whileDemos;

public class Demo6 {
    public static void main(String[] args) {
        //print even numbers from 1 to 20 using while loop
        System.out.println("this following loop will run 10 times");
        int number = 2;
        while (number <= 20) {
            System.out.println(number);
            number = number + 2;
        }

        System.out.println("this following loop will run 20 times");
        int i = 1;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

    }
}
