package com.dream;

public interface DemoInterface {

    public abstract void  abstractMethod();

    public void method();

    default void defaultMethod() {
        System.out.println("这是默认方法");
    }

    static void staticMethod() {
        System.out.println("这是静态方法");
    }

}
