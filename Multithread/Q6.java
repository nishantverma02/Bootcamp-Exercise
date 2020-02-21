
class Thread1 implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread 1 is called");
    }
}
class Thread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("thread 2 is called");
    }
}


public class Q6 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(new Thread1());
        t1.start();
        Thread t2=new Thread(new Thread2());
        t2.start();
        t1.join();
        t2.join();
        System.out.println("finally main block reach to end");
    }
}
