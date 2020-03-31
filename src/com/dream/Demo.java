package com.dream;

import java.util.ArrayList;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        int n = 10000;
        ArrayList<Integer> array = new ArrayList<>(n);
        Random random = new Random();
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            array.add(random.nextInt(n), i);
        }

        System.out.println("arrayList总耗时：" + (System.currentTimeMillis() - startTime));
        
    }

}
