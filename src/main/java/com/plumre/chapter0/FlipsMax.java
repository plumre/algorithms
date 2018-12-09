package com.plumre.chapter0;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Scanner;

public class FlipsMax {

    public static Counter max(Counter x, Counter y) {
        if (x.tally() > y.tally()) {
            return x;
        } else {
            return y;
        }
    }

    public static void main(String[] args) {
        int x = Integer.parseInt(new Scanner(System.in).next());
        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");
        for (int i = 0; i < x; i++) {
            if (StdRandom.bernoulli(0.5)) {
                heads.increment();
            } else {
                tails.increment();
            }
        }
        if (heads.tally() == tails.tally()) {
            StdOut.println("Tie");
        } else {
            StdOut.println(max(heads, tails) + " wins...");
        }
    }
}
