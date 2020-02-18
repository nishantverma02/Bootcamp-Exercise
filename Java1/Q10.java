class Calculator {
    int Operation(int num1, int num2) {
        return num1 + num2;
    }

    double Operation(double num1, double num2) {
        return num1 +num2;
    }

    float Operation(float num1, float num2) {
        return (num1 * num2);
    }

    String Operation(String s1, String s2) {
        return s1+s2;
    }
    String Operation(String s1, String s2,String s3) {
        return s1+s2+s3;
    }
}
public class Q10
{
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        System.out.println(cal.Operation(1,2));
        System.out.println(cal.Operation(4.5d,6.6d));
        System.out.println(cal.Operation(4.5f,7.4f));
        System.out.println(cal.Operation("Nishant","Verma"));
        System.out.println(cal.Operation("Nishant","Prajjwal","vinod"));
    }
}