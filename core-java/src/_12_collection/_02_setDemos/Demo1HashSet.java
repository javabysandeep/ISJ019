package _12_collection._02_setDemos;

import java.util.HashSet;
import java.util.Set;

public class Demo1HashSet {
    public static void main(String[] args) {
          /*
             features of HashSet
        * 1. multiple values same type or diff type
        * 2. unique
        * 3. only one null value
        * 4. No insertion order of elements will be maintained
        * */

        Set list = new HashSet();

        list.add(100);
        list.add(100);
        list.add("abc");
        list.add("abc");
        list.add(12.5f);
        list.add(true);
        list.add(false);
        list.add(null);
        list.add(null);
        list.add(null);

        System.out.println(list.toString());

        //[null, abc, 100, false, 12.5, true]

    }
}
