package com.dream.thread;

public class Demo04_CAS {
    static volatile int i = 0;
    static volatile int t = 1;

    public static void main(String[] args) {
        new Thread(() -> {
            while (i < 20) {
                if (t == 1) {
                    System.out.println("t1:" + (++i));
                    t = 2;
                }
            }
        }).start();

        new Thread(() -> {
            while (i < 20) {
                if (t == 2) {
                    System.out.println("    t2:" + (++i));
                    t = 3;
                }
            }
        }).start();

        new Thread(() -> {
            while (i < 20) {
                if (t == 3) {
                    System.out.println("        t3:" + (++i));
                    t = 1;
                }
            }
        }).start();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
