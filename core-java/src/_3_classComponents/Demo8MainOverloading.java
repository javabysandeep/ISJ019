package _3_classComponents;

public class Demo8MainOverloading {
    public static void main(String[] args) {
        System.out.println("String[] args");
        main("abc");
        main();
        main(100);
        //main(null);//CTE
    }

    public static void main(String args) {
        System.out.println("String args");
    }

    public static void main() {
        System.out.println("main()");
    }

    public static void main(int number) {
        System.out.println("main(int number)");
    }
}
