package _12_collection._04_mapDemos;

import java.util.LinkedHashMap;
import java.util.Map;

public class Demo2 {
    public static void main(String[] args) {
        /*
         *  LinkedHashMap key features
         * unique keys, homo or hetero keys,  no SO,
         * null only once
         * insertion order of keys
         *
         * */
        Map map = new LinkedHashMap();
        map.put(1, "abc");
        map.put(1, "abc");
        map.put(null, "abc");
        map.put(null, "abc");
        map.put(null, "abc");
        map.put("abc", "abc");
        map.put("abc", "abc value updated");
        map.put("xyz", "abc");

        System.out.println(map);


    }
}
