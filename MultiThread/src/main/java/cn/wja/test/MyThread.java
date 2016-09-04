package cn.wja.test;

/**
 * Created by wangweixin on 16/9/4.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("MyThread");
    }
}
