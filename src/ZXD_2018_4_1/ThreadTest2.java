package ZXD_2018_4_1;

public class ThreadTest2 extends Thread{
     private int i;
     public void run(){
         for (;i<40;i++){
             System.out.println(getName() + " " + i);
         }
     }
    public static void main(String[] args) {
      for (int i = 0;i<40;i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
            if(i == 20 ){
                new ThreadTest2().start();
                new ThreadTest2().start();
            }
        }

    }
}