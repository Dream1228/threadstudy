package com.dream;

import java.util.ArrayList;

public class ArrayListDemo {
    static int x = 0;

    public static void main(String[] args) throws InterruptedException {

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                list.add("t" + (x++));
            }).start();

        }

        Thread.sleep(2000);

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println(list.size());

    }


}
