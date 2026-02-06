package _12_collection._02_linkedListDemos;

import java.util.LinkedList;
import java.util.List;

public class Demo2LinkedListSearch {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("ashutosh");
        list.add("shravani");
        list.add("sakshi");
        list.add("kamlini");
        list.add("tanuja");
        list.add("rushikesh");
        list.add("chetan");

        //01. contains(object) - searches specific element
        System.out.println(list.contains("chetan"));//true
        System.out.println(list.contains("xxxx"));//false

        //02. containsAll(collection) - searches a collection
        List searchList = new LinkedList();
        searchList.add("chetan");
        searchList.add("tanuja");

        System.out.println("is collection present " + list.containsAll(searchList));//true

    }
}
