//Create a functional interface whose method takes 2 integers and return one integer.


interface ReturnOneInteger{
    int add(int num1,int num2);
}

public class Q2 {
    public static void main(String[] args) {
        ReturnOneInteger i=(num1,num2)->{
            return num1+num2;
        };
        System.out.println("The addition of two number 5 and 6 is:"+i.add(5,6));
    }
}
