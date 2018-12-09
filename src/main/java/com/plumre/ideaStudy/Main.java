package com.plumre.ideaStudy;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Date());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
