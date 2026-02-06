package _12_collection._03_stackDemos;

import java.util.Stack;

public class Demo1 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);
        System.out.println("size of the stack = "+stack.size());
        System.out.println("top of stack ="+stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        // stack.pop();//EmptyStackException
        System.out.println("size of the stack = "+stack.size());

    }
}
