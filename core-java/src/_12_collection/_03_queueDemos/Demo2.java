package _12_collection._03_queueDemos;

import java.util.PriorityQueue;
import java.util.Queue;

public class Demo2 {
    public static void main(String[] args) {
        Queue queue = new PriorityQueue();

        //Priority ---> ascending order of Strings

        //insertion
        queue.add("abc");
        queue.add("xyz");
        queue.add("pqr");
        queue.add("uvw");

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
