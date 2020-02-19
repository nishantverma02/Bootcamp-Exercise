public class Q6 {

    public static void main(String[] args) {

        int a = 5;


        try
        {
            int k = a/0;
            System.out.println(k);

        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Inside Catch");
            e.printStackTrace();
        }
        catch (Exception f)
        {
            System.out.println("There's some problem");
            f.printStackTrace();
        }
        finally {
            System.out.println("finally is always executed");
        }
    }
}
