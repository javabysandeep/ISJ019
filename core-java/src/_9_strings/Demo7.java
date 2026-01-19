package _9_strings;

public class Demo7 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = "abc";
        String s4 = "abc";
        String s5 = "abc";
        System.out.println(s1 == s2);//true
        System.out.println(s1 == s3);//true
        System.out.println(s1 == s4);//true
        System.out.println(s1 == s5);//true

        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//true
        System.out.println(s1.equals(s5));//true


        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s5.hashCode());

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5.toString());

    }
}
