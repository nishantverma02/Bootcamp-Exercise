import java.util.HashSet;
import java.util.Set;
/*Write a method that takes a string and returns the number of unique characters in the string.*/

public class Q2 {
    public static void main(String[] args) {
        String str="nishant";
        char arr[]=str.toCharArray();
        Set<Character> set=new HashSet<Character>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        System.out.println("Number of Unique charcter in string:"+str);
        for(char ch:set){

            System.out.println(ch);

        }
    }
}