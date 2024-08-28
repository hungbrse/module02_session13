package module02_session13;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeMap;

public class ex5 {
    public static void main(String[] args) {


        Random rd = new Random();
        TreeMap<String,Integer> map1 = new TreeMap<>();
        TreeMap<String,Integer> map2 = new TreeMap<>(Comparator.reverseOrder());
        int max = 10 ;
        int min = 7;
        int arrLength = (rd.nextInt(max - min + 1) + min);



        int[] arr = new int[arrLength];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i]);
        }


         for (int i = 0; i < arr.length - 1; i++) {
             for(int j = i + 1 ; j < arrLength; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
             }
         }

         for (int i = 0; i < arr.length; i++) {
             String key = "key" + i ;

             map1.put(key, arr[i]);

         }

        System.out.println(map1);
        System.out.println(map1.firstKey());
        map2.putAll(map1);
        System.out.println( map2);
        map2.remove(map2.firstKey());

        int lonThu2 = map2.get(map2.firstKey());
        System.out.println(map2.firstKey() + "lớn thứ 2 là :" + lonThu2);


    }
}
