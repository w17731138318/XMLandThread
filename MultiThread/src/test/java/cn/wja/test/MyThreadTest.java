package cn.wja.test;

import static org.junit.Assert.*;

/**
 * 线程结束时间在代码执行完之后
 */
public class MyThreadTest {
    public static void main(String[] args) {
        MyThread myThread =new MyThread();
        myThread.start();
        System.out.println("运行结束!");
    }
}