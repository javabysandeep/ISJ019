package _12_collection._04_mapDemos;

import java.util.Map;
import java.util.TreeMap;

public class Demo3 {
    public static void main(String[] args) {
        /*
         *  TreeMap key features
         * unique keys, homo keys,   Sorting order
         * null not even once
         * no insertion order of keys
         *
         * */
        Map map = new TreeMap();
       /* map.put(1, "abc");
        map.put(1, "abc");*/
        map.put("pqr", "abc");
        /*map.put(null, "abc");
        map.put(null, "abc");
        map.put(null, "abc");*/
        map.put("abc", "abc");
        map.put("abc", "abc value updated");
        map.put("xyz", "abc");

        System.out.println(map);


    }
}
