package _9_strings;

public class Demo14 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("hello");
        //StringBuilder sb2 = "abc";//CTE --> literal way is not possible
        sb1.append(" world");
        System.out.println(sb1);//hello world
        sb1.insert(0, "hi ");
        System.out.println(sb1);
        sb1.delete(0, 3);
        System.out.println(sb1);
        sb1.reverse();
        System.out.println(sb1);
    }
}
