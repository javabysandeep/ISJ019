package _12_collection._03_queueDemos;

import java.util.LinkedList;
import java.util.Queue;

public class Demo1 {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
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
