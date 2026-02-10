package _12_collection._04_mapDemos;

import java.util.HashMap;

public class Demo4 {
    public static void main(String[] args) {
        //occurrence of each character
        String str = "hello good morning";
        HashMap<Character, Integer> map = new HashMap<>();

        for (Character ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println(map);



    }
}
