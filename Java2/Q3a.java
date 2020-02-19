// Java program to illustrate
// ClassNotFoundException
public class Q3a {

    public static void main(String args[]) {
        try
        {
            Class.forName("Nishant2");
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
            System.out.println("Exception Handled");
        }
    }
}
