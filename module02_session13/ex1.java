package module02_session13;

import java.util.HashMap;

public class ex1 {
    public static void main(String[] args) {

        String[] arr = {"chuoi","buoi","soai" ,"nho","tao","oi","oi","nho","tao"};

        HashMap<String,Integer> hashMap = new HashMap<>();


        for (String s : arr) {
            if (hashMap.containsKey(s)) {
                hashMap.put(s, hashMap.get(s)+1);
            }else  {
                hashMap.put(s,1);
            }
        }




        System.out.println(hashMap);


    }
}
