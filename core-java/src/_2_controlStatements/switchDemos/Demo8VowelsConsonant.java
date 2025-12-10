package _2_controlStatements.switchDemos;

import java.util.Scanner;

public class Demo8VowelsConsonant {
    public static void main(String[] args) {
        //check if the character is vowel or consonant
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = scanner.next().charAt(0);

        //vowel - a,e,i,o,u
        //consonants - rest
       /* if(ch=='a' || ch=='e'|| ch=='i' | ch=='o' || ch=='u'){
            System.out.println("Vowel");
        } else {
            System.out.println("consonant");
        }*/

        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");break;
            default:
                System.out.println("Consonants");break;
        }
    }
}
