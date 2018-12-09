package com.plumre.chapter0;

import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.Stack;

import java.util.Date;

public class CollectionTest {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("kevin");
        stack.push("bayee");
        System.out.println("The size of Stack after pushed is : " + stack.size());
        String nextF = stack.pop();
        System.out.println("The size of Stack after popped is : " + stack.size());
        System.out.println("kevin First In : " + nextF);
        System.out.println("------  cut line ------");

        Queue<Date> queue = new Queue<>();
        queue.enqueue(new Date());
        System.out.println("The size of Queue after enqueued is : " + queue.size());
        Date next = queue.dequeue();
        System.out.println("The size of Queue after dequeued is : " + queue.size());
        System.out.println("The date in queue is : " + next);
    }
}
