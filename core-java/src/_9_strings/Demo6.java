package _9_strings;

public class Demo6 {
    public static void main(String[] args) {
        String s1 = new String("abc");//1-heap | 1-scp
        String s2 = new String("abc");//1-heap | 0-scp
        String s3 = new String("xyz");//1-heap | 1-scp
        String s4 = "abc";//0-heap | 0-scp
        String s5 = "xyz";//0-heap | 0-scp
        String s6 = "ABC";//0-heap | 1-scp
        String s7 = "ABC";//0-heap | 0-scp
        //total six objects
        System.out.println(s6 == s7);//true
        System.out.println(s1 == s2);//false
        System.out.println(s1 == s4);//false

    }
}
