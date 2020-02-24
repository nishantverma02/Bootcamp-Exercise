/*Write a method that takes a string and print the number of occurrence of each character characters in the string.*/

import java.util.HashMap;
import java.util.Map;

public class Q3
{
    public static void main(String[] args) {
        String s="nishant verma" ;
        char arr[]=s.toCharArray();
        Map<Character,Integer> hashMap=new HashMap<Character, Integer>();
        for(char eachCharacter:arr){

            if(hashMap.containsKey(eachCharacter))
            {
                hashMap.put(eachCharacter, hashMap.get(eachCharacter)+1);
            }
            else
            {
                hashMap.put(eachCharacter, 1);
            }

        }
        for(char map:hashMap.keySet()){
            System.out.println("Occurences of each character in nishant verma: "+map+" : "+hashMap.get(map));
        }

    }
}