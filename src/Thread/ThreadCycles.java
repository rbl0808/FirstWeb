/**
 * FileName: ThreadCycles
 * Author: rbl
 * Date:
 **/
package Thread;

//线程死循环
public class ThreadCycles {
    public static void main(String[] args) {
        Runnable implRunnable = new Cycles();
        for (int i = 0; i < 1; i++) {
            new Thread(implRunnable).start();
        }
        System.out.println(Thread.currentThread().getName());
    }
}

class Cycles implements Runnable {
    @Override
    public void run() {
        while (true) {
        }
    }
}
