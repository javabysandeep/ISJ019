package _12_collection._04_mapDemos;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {
        /*
         *  HashMap key features
         * unique keys, homo or hetero keys, no IO, no SO,
         * null only once
         *
         *
         * */
        Map map = new HashMap();
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
