package com.dream.thread;

public class Demo02_WaitNotify3 {

    static int i = 0;
    static Object obj = new Object();

    public static void main(String[] args) {

        new Thread(() -> {
            synchronized (obj) {
                while (i < 20) {
                    if (i % 3 == 0) {
                        System.out.println("t1:" + (++i));
                        obj.notifyAll();
                    } else {
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }).start();


        new Thread(() -> {
            synchronized (obj) {
                while (i < 20) {
                    if (i % 3 == 1) {
                        System.out.println("    t2:" + (++i));
                        obj.notifyAll();
                    } else {
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }).start();

        new Thread(() -> {
            synchronized (obj) {
                while (i < 20) {
                    if (i % 3 == 2) {
                        System.out.println("        t3:" + (++i));
                        obj.notifyAll();
                    } else {
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
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
