class CustomException extends Exception
{

}

// A Class that uses above MyException
public class Q13
{
    // Driver Program
    public static void main(String[] args)
    {
        try
        {
            // Throw an object of user defined exception
            throw new CustomException();
        }
        catch (CustomException ex)
        {
            System.out.println("Caught");
            ex.printStackTrace();
        }
    }
}