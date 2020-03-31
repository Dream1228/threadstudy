package com.dream;

import java.util.Random;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) throws Exception {
        Vector<String> vector = new Vector<>();

        new Thread(() -> {
            System.out.println("t1开始");

            try {
                Thread.sleep(new Random().nextInt(10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            vector.add("t1");
            System.out.println("t1结束");

        }).start();

        new Thread(() -> {
            System.out.println("t2开始");
            try {
                Thread.sleep(new Random().nextInt(10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            vector.add("t2");
            System.out.println("t2结束");
        }).start();


        Thread.sleep(1000);

        System.out.println(vector.get(0));
    }
}
