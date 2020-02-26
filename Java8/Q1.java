//Write the following a functional interface and implement it using lambda:
//(1) First number is greater than second number or not             Parameter (int ,int ) Return boolean
//(2) Increment the number by 1 and return incremented value    Parameter (int) Return int
//(3) Concatination of 2 string                                                             Parameter (String , String ) Return (String)
//(4) Convert a string to uppercase and return .                                Parameter (String) Return (String)

interface OperationCompare{
    Boolean Compare(int num1,int num2);
}
interface IncrementBY1{
    int Increment(int num);
}
interface StringConcatnation{
    String Concat(String s1,String s2);
}
interface Uppercase{
    String uppercase(String s);
}

public class Q1 {

    public static void main(String[] args) {
        // First number is greater than second number or not
        OperationCompare op=(num1,num2)->{
            if(num1>num2)
                return true;
            else return false;

        };
        System.out.println("6 is greater than 8 :"+op.Compare(6,8));
        // Increment the number by 1 and return incremented value
        IncrementBY1 op2=(num1)->{
            return num1+1;
        };
        System.out.println("The incremented value of 6 is:"+op2.Increment(6));
        // Concatination of 2 string
        StringConcatnation op3=(str1,str2)->{
            return str1+str2;
        };
        System.out.println("The concated string of nishant and verma is :"+op3.Concat("nishant","verma"));
        // Convert a string to uppercase and return
        Uppercase op4=(s)->{
            return s.toUpperCase();
        };
        System.out.println("The uppercase value of nishant is :"+op4.uppercase("Nishant"));

    }

}