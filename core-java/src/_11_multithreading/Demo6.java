package _11_multithreading;

public class Demo6 {
    public static void main(String[] args) {
        //01. create the subclass of type Runnable
        class Worker implements Runnable {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i + " = " + Thread.currentThread().getName());
                }
            }
        }

        //02. create the subclass object
        Worker worker = new Worker();

        //03. create the Thread class object and pass the reference of subclass
        Thread thread = new Thread(worker);

        //04. call the start method
        thread.setName("worker");
        thread.start();
    }
}
