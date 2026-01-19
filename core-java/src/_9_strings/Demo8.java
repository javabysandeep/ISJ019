package _9_strings;

public class Demo8 {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = "abc";

        System.out.println(s1 == s2);//false --> reference check
        System.out.println(s1.equals(s2));//true ---> content check

    }
}
