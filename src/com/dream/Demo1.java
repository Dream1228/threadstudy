package com.dream;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

public class Demo1 {
    public static void main(String[] args) {
        int n = 10;
        LinkedList<Integer> array = new LinkedList<Integer>();
        HashMap<String, String> map = new HashMap<>();
        map.put("haha", "shiwo");
        Random random = new Random();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {

        }

        System.out.println("linkedList总耗时：" + (System.currentTimeMillis() - startTime));
    }

}
