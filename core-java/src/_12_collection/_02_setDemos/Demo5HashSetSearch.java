package _12_collection._02_setDemos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo5HashSetSearch {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("ashutosh");
        set.add("shravani");
        set.add("sakshi");
        set.add("kamlini");
        set.add("tanuja");
        set.add("rushikesh");
        set.add("chetan");

        //01. contains(object) - searches specific element
        System.out.println(set.contains("chetan"));//true
        System.out.println(set.contains("xxxx"));//false

        //02. containsAll(collection) - searches a collection
        List searchList = new ArrayList();
        searchList.add("chetan");
        searchList.add("tanuja");

        System.out.println("is collection present " + set.containsAll(searchList));//true

    }
}
