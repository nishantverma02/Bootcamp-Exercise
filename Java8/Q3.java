//Using (instance) Method reference create and apply add and subtract method and using (Static) Method
// reference create and apply multiplication method for the functional interface created.

interface calcualte{
    int calculation(int num1,int num2);
}
public class Q3 {
    int add(int num1,int num2){
        return num1+num2;
    }
    int sub(int num1,int num2){
        return num1-num2;
    }
    static int mul(int num1,int num2){
        return num1*num2;
    }

    public static void main(String[] args) {
        Q3 imr=new Q3();
        calcualte ca=imr::add;
        System.out.println("sum of two number is:4+5="+ca.calculation(4,5));

        calcualte ca2=imr::sub;
        System.out.println("sub of two number is:9-5="+ca2.calculation(9,5));

        calcualte ca3=Q3::mul;
        System.out.println("Multiplication of two number is:4*5="+ca3.calculation(4,5));

    }
}