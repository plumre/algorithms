package com.plumre.chapter0;

import edu.princeton.cs.algs4.*;

import java.util.Scanner;

public class Interval2DTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double xlo = Double.parseDouble(scanner.next());
        double xhi = Double.parseDouble(scanner.next());
        double ylo = Double.parseDouble(scanner.next());
        double yhi = Double.parseDouble(scanner.next());
        int T = Integer.parseInt(scanner.next());

        Interval1D xInterval = new Interval1D(xlo, xhi);
        Interval1D yInterval = new Interval1D(ylo, yhi);
        Interval2D box = new Interval2D(xInterval, yInterval);
        box.draw();

        Counter counter = new Counter("hits");
        for (int i = 0; i < T; i++) {
            double x = Math.random();
            double y = Math.random();
            Point2D point2D = new Point2D(x, y);
            if (box.contains(point2D)) {
                counter.increment();
            } else {
                point2D.draw();
            }
        }

        StdOut.println(counter);
        StdOut.println(box.area());
    }

}
