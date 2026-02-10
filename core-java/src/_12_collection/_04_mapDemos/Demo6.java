package _12_collection._04_mapDemos;

import java.util.HashMap;
import java.util.Map;

public class Demo6 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "ashutosh");
        map.put(3, "chetan");
        map.put(2, "gayatri");
        map.put(4, "kamlini");
        map.put(5, "rushi");

        System.out.println(map);
        // removal
        map.remove(1);
        System.out.println(map);

        map.clear();
        System.out.println(map);

    }
}
