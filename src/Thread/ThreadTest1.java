package Thread;

public class ThreadTest1 {
    public static void main(String args[]) {
        Thread t=new Thread(){
            public void run(){
                pong();
            }
        };
        //t.run();
//        t.start();
//        t.start();
//        t.start();
        t.start();
        System.out.print("ping");

    }
    static synchronized void pong(){
        System.out.print("pong");
    }
}

