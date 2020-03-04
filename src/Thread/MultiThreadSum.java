package Thread;

//周杰
import java.util.concurrent.atomic.AtomicLong;

public class MultiThreadSum {

    private static AtomicLong sum = new AtomicLong();

    private static long unit = 10000;

    public static void main(String[] args) {
        long start = 1;
        long end = unit;
        for (int i = 1; i <= 10; i++) {
            // 开10个线程
            new Thread(new SumTask(start, end)).start();
            start = end + 1;
            end = (i + 1) * unit;
        }
        System.out.println(sum.get());
        long real = 10000L * (1 + 10000) / 2;
        System.out.println(real);
    }


    static class SumTask implements Runnable {

        private long start;

        private long end;

        public SumTask(long start, long end) {
            this.start = start;
            this.end = end;
        }
        @Override
        public void run() {
            long res = unit * (start + end) / 2;
            sum.addAndGet(res);
        }
    }
}