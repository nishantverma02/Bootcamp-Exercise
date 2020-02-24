//sort hashmap by value

import java.util.*;



public class Q4 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<String, Integer>();
        map.put("one",1);
        map.put("three",3);
        map.put("two",2);
        map.put("Five",5);
        map.put("four",4);

        List<Map.Entry<String,Integer>> list=new  ArrayList<Map.Entry<String,Integer>>(map.entrySet());




        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> entry1,
                               Map.Entry<String, Integer>  entry2)
            {
                return (entry1.getValue()).compareTo(entry2.getValue());
            }
        });

        for(Map.Entry<String,Integer> mp:list){
            System.out.println(mp);
        }


    }
}