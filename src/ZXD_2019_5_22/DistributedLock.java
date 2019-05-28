/**
 * FileName: DistributedLock
 * Author: rbl
 * Date: 2019-5-25
 **/
package ZXD_2019_5_22;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class DistributedLock {
    public static void main(String[] args) {
        //并发数
        int currency = 20;

        //循环屏障
        CyclicBarrier cb = new CyclicBarrier(currency);

        //多线程模拟并发
        for (int i = 0;i<currency;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "---------------我准备好了");
                    //等待一起出发
                    try {
                        cb.await();
                    }catch (InterruptedException | BrokenBarrierException e){
                        e.printStackTrace();
                    }

                }
            });
        }

    }
}
