import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//demonstrate use of countdown latch

class Processor3 implements Runnable {
    private CountDownLatch latch;

    public Processor3(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {
        System.out.println("Started.");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        latch.countDown();
    }
}




public class Q9 {

    public static void main(String[] args) {

        CountDownLatch latch = new CountDownLatch(3);

        ExecutorService executor = Executors.newFixedThreadPool(2);

        for(int i=0; i < 7; i++) {
            executor.submit(new Processor3(latch));
        }

        try {
            latch.await();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("Completed.");
    }
}
