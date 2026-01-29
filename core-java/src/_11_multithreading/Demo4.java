package _11_multithreading;

public class Demo4 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(){
            @Override
            public void run() {
                m1();
            }
        };
        thread.setName("worker");
        thread.start();
        Thread.sleep(5000);
        m1();
    }

    private static void m1() {
        System.out.println("m1---> " + Thread.currentThread().getName());
        m2();
    }

    private static void m2() {
        System.out.println("m2---> " + Thread.currentThread().getName());
        m3();
    }

    private static void m3() {
        System.out.println("m3---> " + Thread.currentThread().getName());
    }

}
