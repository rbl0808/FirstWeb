package ZXD_2018_4_1;

public class DeadLock {
    public static  Object flag1 = new Object();
    public static  Object flag2 = new Object();
    public  static  void  main(String[] args){
      Thread t1 = new Thread(new t1l());
      Thread t2 = new Thread(new t2l());
      t1.start();
      t2.start();
    }
}
class t1l implements Runnable{
    @Override
    public void run() {
        System.out.println("t1运行");
        synchronized (DeadLock.flag1){
            try {
                System.out.println("t1锁住flag1");
                Thread.sleep(5000);
                synchronized (DeadLock.flag2){
                    System.out.println("t1锁住flag2");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class t2l implements Runnable{
    @Override
    public void run() {
        System.out.println("t2运行");
        synchronized (DeadLock.flag2){
            try {
                System.out.println("t2锁住flag2");
                Thread.sleep(5000);
                synchronized (DeadLock.flag1){
                    System.out.println("t2锁住flag1");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}