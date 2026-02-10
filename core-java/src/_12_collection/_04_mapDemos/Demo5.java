package _12_collection._04_mapDemos;

import java.util.HashMap;

public class Demo5 {
    public static void main(String[] args) {
        //occurrence of each word
        String str = "hello good morning hello";
        HashMap<String, Integer> map = new HashMap<>();

        for (String string : str.split(" ")) {
            if (map.containsKey(string)) {
                map.put(string, map.get(string) + 1);
            } else {
                map.put(string, 1);
            }
        }
        System.out.println(map);


    }
}
