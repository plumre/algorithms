package com.plumre.chapter0;

import java.util.Arrays;
import java.util.Random;

public class TestSort {

    public static void main(String[] args) {
        int time = 0;
        for (int i = 0; i < 10; i++) {

            Random random = new Random();
            int[] a = new int[100000000];
            for (int j : a) {
                a[j] = random.nextInt();
            }
            long t1 = System.currentTimeMillis();
            /*
            *
            * 比较经典快速排序和 双基准快速排序
            *
             */
            // classicSort(a, 0, a.length - 1);
            Arrays.sort(a);
            long t2 = System.currentTimeMillis();
            System.out.println(t2 - t1);
            time += t2 - t1;
        }
        System.out.println("平均耗时：" + time / 10);
    }

    private static void classicSort(int[] a, int head, int tail) {
        if (head >= tail || a == null || a.length <= 1) {
            return;
        }
        int i = head, j = tail, pivot = a[(head + tail) / 2];
        while (i <= j) {
            while (a[i] < pivot) {
                ++i;
            }
            while (a[j] > pivot) {
                --j;
            }
            if (i < j) {
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
                ++i;
                --j;
            } else if (i == j) {
                ++i;
            }
        }
        classicSort(a, head, j);
        classicSort(a, i, tail);
    }
}
