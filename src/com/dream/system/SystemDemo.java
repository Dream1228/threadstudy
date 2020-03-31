package com.dream.system;

import java.util.Properties;

/**
 * @author ：lixiang
 * @version ：v1.0
 * @program ：jvm
 * @date ：2020/3/31 11:38
 * @description ：
 */
public class SystemDemo {
    public static void main(String[] args) {
        System.setProperty("defined", "myValue");
        Properties properties = System.getProperties();

        properties.forEach((key, value) -> {
            System.out.println(key + " ===== " + value);
        });

        String defined = System.getProperty("defined");
        System.out.println("defined = " + defined);

    }

}
