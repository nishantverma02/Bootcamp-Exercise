/*Write Java code to define List .
        Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        List<Float> list=new ArrayList<Float>();
        list.add(9.8f);
        list.add(2.3f);
        list.add(3.4f);
        list.add(2.4f);
        list.add(3.6f);
        float sum=0;
        Iterator<Float> it=list.iterator();
        while(it.hasNext()){
            sum+=it.next();
        }
        System.out.println("sum of list of 5 floating number is:"+sum);
    }
}