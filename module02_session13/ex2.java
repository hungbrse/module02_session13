package module02_session13;

import java.util.HashMap;
import java.util.Map;

public class ex2 {
    public static void main(String[] args) {

        String[]  arr = {"anh" , "yeu" , "em" ,"321" ,"anh","321","123"};
        HashMap <String, Integer> hm = new HashMap<>();
        HashMap <String, Integer> hm2 = new HashMap<>();

        for(String str : arr) {
            if (hm.containsKey(str)) {
                hm.put(str,hm.get(str)+1);
            }else {
                hm.put(str,1);
            }
        }


        System.out.println(hm);


        for(Map.Entry<String,Integer> entry : hm.entrySet()) {

            if(entry.getValue() == 1) {
                hm2.put(entry.getKey(),entry.getValue());
            }

        }

        System.out.println(hm2);




    }
}
