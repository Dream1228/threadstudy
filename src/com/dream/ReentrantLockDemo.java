package com.dream;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {

    public static void main(String[] args) {

        ReentrantLock lock = new ReentrantLock();
        for (int i = 0; i < 10; i++) {

            new Thread(() -> {
                lock.lock();
                System.out.println(Thread.currentThread().getName());
                lock.unlock();
            }).start();

        }

        try {
            Thread.sleep(2000);
            System.out.println(lock.getQueueLength());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
