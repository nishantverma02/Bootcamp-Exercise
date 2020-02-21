//Making thread by both the methods

// Java code for thread creation by extending
// the Thread class
class Multithreading1 extends Thread
{
    public void run()
    {
        try
        {
            // Displaying the thread that is running
            System.out.println ("Thread " +
                    Thread.currentThread().getId() +
                    " is running");

        }
        catch (Exception e)
        {
            // Throwing an exception
            System.out.println ("Exception is caught");
        }
    }
}

//Through runnable interface
class Multithreading2 implements Runnable
{
    public void run()
    {
        try
        {
            // Displaying the thread that is running
            System.out.println ("Thread " +
                    Thread.currentThread().getId() +
                    " is running");

        }
        catch (Exception e)
        {
            // Throwing an exception
            System.out.println ("Exception is caught");
        }
    }
}


// Main Class
public class Q2
{
    public static void main(String[] args)
    {

        int n = 8; // Number of threads
        for (int i=0; i<8; i++)
        {
            Multithreading1 object1 = new Multithreading1();
            object1.start();
        }


        for (int i=0; i<n; i++)
        {
            Thread object2 = new Thread(new Multithreading2());
            object2.start();
        }
    }
}
