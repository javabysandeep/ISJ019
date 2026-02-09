package _12_collection._01_listDemos._01_arrayListDemos;

import java.util.ArrayList;
import java.util.List;

public class Demo7ArrayListRemoval {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("ashutosh");
        list.add("shravani");
        list.add("sakshi");
        list.add("kamlini");
        list.add("tanuja");
        list.add("rushikesh");
        list.add("chetan");
        System.out.println(list);
        System.out.println("list size  = "+list.size());

        //01. remove(object)
        //02. remove(index)
        //03. removeAll(collection),
        //04. retainAll(retainCollection)
        //05. clear()

        //clear()  ---> it will remove all the elements
        list.clear();
        System.out.println(list);
        System.out.println("list size  = "+list.size());

    }
}
