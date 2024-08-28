package module02_session13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();

        map.put("key1",7);
        map.put("key2",8);
        map.put("key3",100);
        map.put("key4",10);
        map.put("key5",1);
        map.put("key6",14);
        map.put("key7",13);

        map2.putAll(map);

        System.out.println(map2);

        Scanner sc = new Scanner(System.in);
        System.out.println("nhập phần tử muốn kiểm tra :");

        String kiemTra = sc.nextLine();

      boolean check = false;

        for (Map.Entry<String,Integer> entry : map2.entrySet()) {
            if (entry.getKey().equals(kiemTra)) {
                check = true;
            }
        }


        System.out.println("phần tử có tồn tại hay không :" + check);

    }
}
