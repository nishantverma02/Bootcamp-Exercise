public class Q8 {
    public static void main(String[] args) {
        //Write a program to reverse a string and remove character from index 4 to index 9 from the reversed string using String Buffer

        String s1 = "Sweater Weather";
        StringBuffer sb1 = new StringBuffer(s1);

        sb1 = new StringBuffer(sb1.reverse().delete(4,9));

        System.out.println(sb1);




    }
}
