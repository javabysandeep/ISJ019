package _2_controlStatements.ifDemos;

public class Demo9 {
    public static void main(String[] args) {
        //check if the character is alphabet or digit
        char ch = '1';

        if ((ch >= 'A' && ch <= 'Z') || ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is an alphabet");
        }

        if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a digit");
        }
    }
}
