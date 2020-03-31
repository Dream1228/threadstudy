package com.dream;

import java.util.ArrayList;

public class Heap {
    public static void main(String[] args) {

        ArrayList<byte[]> list = new ArrayList<>();
        int i = 0;
        boolean flag = true;

        while (flag) {
            try {
                i++;
                list.add(new byte[1 * 1024 * 1024]);
                Thread.sleep(60);
            } catch (Throwable e) {
                flag = false;
                System.out.printf("记录运行次数为%d", i);
            }
        }
    }
}