package com.dream.thread;

public class Demo01_WaitNotify {

    static int i = 0;

    static Object obj = new Object();

    public static void main(String[] args) {


        Thread t1 = new Thread(() -> {
            synchronized (obj) {
                while (i < 10) {
                    System.out.println("t1:" + (++i));
                    obj.notify();

                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                obj.notify();
            }

        });

        Thread t2 = new Thread(() -> {
            synchronized (obj) {
                while (i < 10) {
                    System.out.println("    t2:" + (++i));
                    obj.notify();
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
//                obj.notify();
            }
        });


        t1.start();
        t2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
