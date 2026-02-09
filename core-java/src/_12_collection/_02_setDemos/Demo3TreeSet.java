package _12_collection._02_setDemos;

import java.util.Set;
import java.util.TreeSet;

public class Demo3TreeSet {
    public static void main(String[] args) {
          /*
             features of TreeSet
        * 1. multiple values of same type only
        * 2. unique
        * 3. not even once null value
        * 4. sorting  order of elements will be maintained
        * */

        Set set = new TreeSet();

        set.add(100);
        set.add(100);
        set.add(102);
        set.add(81);

        System.out.println(set.toString());

        //[81, 100, 102]

    }
}
