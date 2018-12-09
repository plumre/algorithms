package com.plumre.chapter0;

import edu.princeton.cs.algs4.*;

public class Stats {

    public static void main(String[] args) {
        int[] y = readInts("/Users/plumre/Desktop/oo.txt");
        System.out.println(y);
        for (int i : y) {
            System.out.print(i + "\t");
        }
        /*Bag<Double> numbers = new Bag<>();
        int i = 0;
        while (!StdIn.isEmpty() && i < 10) {
            numbers.add(StdIn.readDouble());
            i++;
        }
        // the size of numbers
        int N = numbers.size();

        // the sum of numbers
        double sum = 0.0;
        for (Double x : numbers) {
            sum += x;
        }

        // the mean of numbers
        double mean = sum / N;

        // the std diff of sample
        sum = 0.0;
        for (Double x : numbers) {
            sum += (x - mean) * (x - mean);
        }
        double std = Math.sqrt(sum / (N - 1));

        StdOut.printf("Mean: %.2f\n", mean);
        StdOut.printf("Std dev: %.2f\n", std);*/

    }

    public static int[] readInts(String name) {
        In in = new In(name);
        Queue<Integer> queue = new Queue<>();
        while (!in.isEmpty() ) {
            queue.enqueue(in.readInt());
        }
        int N = queue.size();
        int[] a = new int[N];

//        Serious ERROR
//        增强for循环不能修改集合数据，只能查看
//        for (int j : a) {
//            a[j] = queue.dequeue();
//        }

        for (int i = 0; i < N; i++) {
            a[i] = queue.dequeue();
        }
        return a;
    }
}
