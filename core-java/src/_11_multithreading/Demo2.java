package _11_multithreading;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(10 / 0);
    }
}
