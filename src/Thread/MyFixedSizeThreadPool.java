/**
 * FileName: MyFixedSizeThreadPool
 * Author: rbl
 * Date: 2019-5-28
 **/
package Thread;

import sun.tools.jconsole.Worker;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class MyFixedSizeThreadPool {
    //仓库
    private BlockingQueue<Runnable> taskQueue;
    //放线程的集合
    private List<Worker> workers;
    private volatile boolean working = true;

    public MyFixedSizeThreadPool(int poolsize, int taskQueueSize) {
        if (poolsize <= 0 || taskQueueSize <= 0) {
            throw new IllegalArgumentException("参数错误");
        }
        //初始化任务队列
        this.taskQueue = new LinkedBlockingDeque<>(taskQueueSize);
        //创建放线程的集合
        this.workers = Collections.synchronizedList(new LinkedList<>());
        //创建线程
        for (int i = 0; i < poolsize; i++) {
            Worker w = new Worker(this);
            this.workers.add(w);
            w.start();
        }
    }

    public boolean submit(Runnable task) {
        return this.taskQueue.offer(task);
    }

    public void shutdown() {
        if (this.working) {
            this.working = false;
            for (Thread t : this.workers) {
                if (t.getState().equals(Thread.State.BLOCKED) || t.getState().equals(Thread.State.WAITING)) {
                    t.interrupt();
                }
            }
        }
    }

    private class Worker extends Thread {
        private MyFixedSizeThreadPool pool;

        public Worker(MyFixedSizeThreadPool pool) {
            super();
            this.pool = pool;
        }

        public void run() {
            int taskCount = 0;
            //从队列中取任务,去执行,要能不停的取
            while (this.pool.working || this.pool.taskQueue.size() > 0) {
                Runnable task = null;

                try {
                    if (this.pool.working) {
                        task = this.pool.taskQueue.poll();
                    } else {
                        task = this.pool.taskQueue.take();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (task != null) {
                    try {
                        task.run();
                        System.out.println(Thread.currentThread().getName() + "执行完成" + (++taskCount) + "个任务");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            }
        }
    }
}
