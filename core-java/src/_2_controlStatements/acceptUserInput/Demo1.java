package _2_controlStatements.acceptUserInput;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a byte value");
        byte byteValue = scanner.nextByte();

        System.out.println("Enter a short value");
        short shortValue = scanner.nextShort();

        System.out.println("Enter a int value");
        int intValue = scanner.nextInt();

        System.out.println("Enter a long value");
        long longValue = scanner.nextLong();

        System.out.println("Enter a float value");
        float floatValue = scanner.nextFloat();

        System.out.println("Enter a double value");
        double doubleValue = scanner.nextDouble();

        System.out.println("Enter a boolean value");
        boolean booleanValue = scanner.nextBoolean();

        System.out.println("Enter a character");
        char charValue = scanner.next().charAt(0);

        System.out.println("Enter a word");
        String word = scanner.next();

        System.out.println("Enter a String line");
        String line = scanner.nextLine();

        System.out.println("printing all values");
        System.out.println("byte value =" + byteValue);
        System.out.println("short value =" + shortValue);
        System.out.println("int value =" + intValue);
        System.out.println("long value =" + longValue);
        System.out.println("float value =" + floatValue);
        System.out.println("double value =" + doubleValue);
        System.out.println("boolean value =" + booleanValue);
        System.out.println("char value =" + charValue);
        System.out.println("word value =" + word);
        System.out.println("String line value =" + line);


    }
}
