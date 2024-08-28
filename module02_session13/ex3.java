package module02_session13;

import java.util.*;

public class ex3 {
    public static void main(String[] args) {



        HashMap<String,Integer> hashMap = new HashMap();

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(hashMap.entrySet());


        entryList.add(new AbstractMap.SimpleEntry<>("key1", 1));
        entryList.add(new AbstractMap.SimpleEntry<>("key2", 7));
        entryList.add(new AbstractMap.SimpleEntry<>("key3", 3));
        entryList.add(new AbstractMap.SimpleEntry<>("key4", 4));
        entryList.add(new AbstractMap.SimpleEntry<>("key5", 5));
        entryList.add(new AbstractMap.SimpleEntry<>("key6", 9));
        entryList.add(new AbstractMap.SimpleEntry<>("key7", 7));
        entryList.add(new AbstractMap.SimpleEntry<>("key8", 10));


        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {

                return o1.getValue() - o2.getValue();

            }
        });


        System.out.println(entryList);






    }
}
