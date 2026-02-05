package _12_collection._01_arrayListDemos;

import java.util.ArrayList;
import java.util.List;

public class Demo6ArrayListRemoval {
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

        //01. remove a single element
        list.remove("chetan");
        System.out.println("after single element removal");
        System.out.println(list);


        //02. remove a single element using index
        list.remove(0);
        System.out.println("after single element removal using index");
        System.out.println(list);

        //03. remove multiple elements
        List removalList = new ArrayList();
        removalList.add("sakshi");
        removalList.add("tanuja");
        list.removeAll(removalList);
        System.out.println("after list removal using removeAll");
        System.out.println(list);

        //04. retainAll(collection) keeps the specified element and remove rest
        List retainersList = new ArrayList();
        removalList.add("shravani");
        removalList.add("kamlini");
        list.retainAll(retainersList);
        System.out.println(list);

    }
}
