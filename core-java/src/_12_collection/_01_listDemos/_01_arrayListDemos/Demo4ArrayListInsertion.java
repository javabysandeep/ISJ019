package _12_collection._01_listDemos._01_arrayListDemos;

import java.util.ArrayList;
import java.util.List;

public class Demo4ArrayListInsertion {
    public static void main(String[] args) {
        List list = new ArrayList();

        //01. add a single element at the end of list
        list.add(100);
        System.out.println(list);

        //02. add a single element at specified index in the list
        list.add(0, "good morning");
        System.out.println(list);

        //03. add multiple elements in a given list
        List list1 = new ArrayList();
        list1.add("abc");
        list1.add("xyz");

        list.addAll(list1);
        System.out.println(list);

        //04. add multiple elements in a given list at a specific index
        list.addAll(0, list1);
        System.out.println(list);


    }
}
