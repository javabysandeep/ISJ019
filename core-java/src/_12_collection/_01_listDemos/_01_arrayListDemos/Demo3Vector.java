package _12_collection._01_listDemos._01_arrayListDemos;

import java.util.List;
import java.util.Vector;

public class Demo3Vector {
    public static void main(String[] args) {
        List list = new Vector();

        /*
            features of list
        * 1. multiple values same type or diff type
        * 2. duplicates
        * 3. any number of null values
        * 4. insertion order of elements will be maintained
        * */

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

    }
}
