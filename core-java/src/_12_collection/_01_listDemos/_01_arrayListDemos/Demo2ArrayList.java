package _12_collection._01_listDemos._01_arrayListDemos;

import java.util.ArrayList;
import java.util.List;

public class Demo2ArrayList {
    public static void main(String[] args) {
        //case 3 --> Parent ref = new Child()
        //1 ---> members only present in Parent ---> parent
        //2 ---> members only present in child ----> cte
        //3 ---> members present in both parent and child --->v-parent, methods-child
        List list = new ArrayList();

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
