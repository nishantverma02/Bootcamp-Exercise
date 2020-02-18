class A7 {
    static String firstname;
    static  String lastname;
    static int age;


    // Write a program to print your Firstname,LastName & age using static block,static method & static variable respectively
    static {
         firstname = "Nishant";
         lastname = "Verma";
         age = 21;
    }
    static void fname()
    {
        System.out.println(firstname);
    }
    static void lname()
    {
        System.out.println(lastname);
    }
    static void ages()
    {
        System.out.println(age);
    }
}

public class Q7
{
    public static void main(String[] args) {
        A7.fname();
        A7.lname();
        A7.ages();

    }
}
