package _12_collection._03_queueDemos;

import java.util.PriorityQueue;
import java.util.Queue;

public class Demo3 {
    public static void main(String[] args) {
        Queue queue = new PriorityQueue();

        //Priority ---> ascending order of Integers

        //insertion
        queue.add(99);
        queue.add(23);
        queue.add(101);
        queue.add(88);

        //deletion -- remove
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        //System.out.println(queue.remove());//NoSuchElementException
        System.out.println(queue.poll());//null


        //examine
        System.out.println(queue.peek());//null
        System.out.println(queue.element());//NoSuchElementException
    }
}
