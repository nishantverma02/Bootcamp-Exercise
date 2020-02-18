class Bank{
    void getDetails()
    {
        System.out.println("NO ROI");
    }
}

class ICICI extends Bank{
    void getDetails()
    {
        System.out.println("10 percent");
    }
}
class Amex extends Bank{
    void getDetails()
    {
        System.out.println("8 percent");
    }
}





public class Q11 {
    /*Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method
    called getDetails which provide there specific details like rateofinterest etc,print details of every banks
     */
    public static void main(String[] args) {
        Bank b = new Bank();
        b.getDetails();
        ICICI i = new ICICI();
        i.getDetails();
        Amex a = new Amex();
        a.getDetails();

    }
}
