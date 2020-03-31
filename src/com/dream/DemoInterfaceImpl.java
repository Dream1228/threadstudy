package com.dream;

public class DemoInterfaceImpl implements DemoInterface {
    @Override
    public void abstractMethod() {

    }

    @Override
    public void method() {

    }


    public static void main(String[] args) {
        DemoInterface demo = new DemoInterfaceImpl();
        demo.defaultMethod();

        DemoInterface.staticMethod();


        DemoAbstarct.method2();

        DemoAbstarct demoAbstarct = new DemoAbstarctImpl();

        demoAbstarct.method();
        demoAbstarct.method1();
    }
}
