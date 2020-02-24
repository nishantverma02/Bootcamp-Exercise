//Print the elements of an array in the decreasing frequency if 2 numbers have same frequency then print the one which came first.



import java.util.*;

public class Q7 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(12);
        integerList.add(2);
        integerList.add(5);
        integerList.add(7);
        integerList.add(7);

        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i =0; i<integerList.size(); i++)
        {
            if (map.containsKey(integerList.get(i)))
                map.put(integerList.get(i), map.get(integerList.get(i)) + 1);

            else
                map.put(integerList.get(i), 1);
        }

//        printing the map
        for (Map.Entry entry : map.entrySet())
            System.out.println("Number "+entry.getKey()+" frequency is "+entry.getValue());

        //sorting based on frequency
        List<Map.Entry<Integer,Integer>> list=new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet()) ;


        Collections.sort(list, new Comparator<Map.Entry<Integer,Integer>>() {

            @Override
            public int compare(Map.Entry<Integer,Integer> E1,Map.Entry<Integer,Integer> E2) {
                return -(E1.getValue()).compareTo(E2.getValue());
            }
        });
        System.out.println("Element After Sorting");

        for(Map.Entry<Integer,Integer> mp:list){
            System.out.println("Number "+mp.getKey()+" frequency is "+mp.getValue());

        }

    }

}