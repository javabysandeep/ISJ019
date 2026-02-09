package _12_collection._02_setDemos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo6HashSetRemoval {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("ashutosh");
        set.add("shravani");
        set.add("sakshi");
        set.add("kamlini");
        set.add("tanuja");
        set.add("rushikesh");
        set.add("chetan");
        System.out.println(set);

        //01. remove a single element
        set.remove("chetan");
        System.out.println("after single element removal");
        System.out.println(set);

        //02. remove multiple elements
        List removalList = new ArrayList();
        removalList.add("sakshi");
        removalList.add("tanuja");
        set.removeAll(removalList);
        System.out.println("after set removal using removeAll");
        System.out.println(set);

        //03. retainAll(collection) keeps the specified element and remove rest
        List retainersList = new ArrayList();
        removalList.add("shravani");
        removalList.add("kamlini");
        set.retainAll(retainersList);
        System.out.println(set);

    }
}
