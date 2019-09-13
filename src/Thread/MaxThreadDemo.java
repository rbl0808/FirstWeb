/**
 * FileName: MaxThreadDemo
 * Author: rbl
 * Date: 2019-5-28
 **/
package Thread;

import java.util.concurrent.CountDownLatch;

public class MaxThreadDemo {
    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(1);
        try {
            Thread.sleep(20000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 4000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        cdl.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

            System.out.println("i=" + i);
        }
    }
}
