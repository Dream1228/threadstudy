package com.dream;

public class JoinDemo {

    static int i = 0;

    public static void main(String[] args) {

       final Thread t1 = new Thread(() -> {
            if (i % 2 == 0) {

                System.out.println(Thread.currentThread().getName() + ":" + i);
                i++;
            }


        });


      final   Thread t2 = new Thread(() -> {
            try {
                t1.join();
                if (i % 2 == 1) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                    i++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        });

        t1.start();
        t2.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
