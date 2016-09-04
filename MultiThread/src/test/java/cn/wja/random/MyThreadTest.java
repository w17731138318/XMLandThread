package cn.wja.random;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wangweixin on 16/9/4.
 */
public class MyThreadTest {

    @Test
    public void testRun() throws Exception {
        try {
            MyThread thread = new MyThread();
            thread.setName("myThread");
            thread.start();
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("main=:" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}