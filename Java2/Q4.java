public class Q4 {
    private static Q4 myObj;

    static{
        myObj = new Q4();
    }

    private Q4(){

    }

    public static Q4 getInstance(){
        return myObj;
    }

    public void testMe(){
        System.out.println("Hey.... it is working!!!");
    }

    public static void main(String a[]){
        Q4 ms = getInstance();
        ms.testMe();
    }
}