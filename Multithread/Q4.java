import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Even implements Runnable{

    @Override
    public void run() {

        for(int i=2;i<=20;i=i+2 ) {
            System.out.println(i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class Odd implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=20;i=i+2) {
            System.out.println(i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

public class Q4 {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(new Odd());
        executor.submit(new Even());

        executor.shutdown();






    }


}