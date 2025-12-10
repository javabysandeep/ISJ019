package _1_operators._2_stringConcate;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(10 + 20); // addition = 30
        System.out.println(10 + "20"); // concate = 1020
        System.out.println(10 + "20" + 30 + 40); // 10203040
        System.out.println(10 + 20 + "30" + 40); // 303040
        System.out.println("A" + "A");//AA
        System.out.println('A' + 'A');//130
        System.out.println('A' + 'A' + "A");//130A
        System.out.println("A" + 'A' + "A");//AAA
        System.out.println("A"+'A'+'A');//AAA
        System.out.println("A"+'A'+'A'+"A");//AAAA
        System.out.println('A'+"A");//AA
    }
}
